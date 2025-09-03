import { View, Image, Button, StyleSheet, TextInput, Text } from 'react-native';
import { useState } from 'react';

const imagens = [
  require('./assets/forca.png'),
  require('./assets/cabeca.png'),
  require('./assets/cabecacorpo.png'),
  require('./assets/cabecacorpoumbraco.png'),
  require('./assets/cabecacorpodoisbracos.png'),
  require('./assets/cabecacorpodoisbracosumaperna.png'),
  require('./assets/cabecacorpodoisbracosduaspernas.png'),
];

export default function App() {
  const [indiceImagemAtual, setIndiceImagemAtual] = useState(0);
  const [entrada, setEntrada] = useState('');
  const [fimDeJogo, setFimDeJogo] = useState(false);
  const [mensagem, setMensagem] = useState('');

  const sortearLetra = () =>
    'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('')[Math.trunc(Math.random() * 26)];

  const [letraSorteada, setLetraSorteada] = useState(sortearLetra(''));

  const verificarEntrada = () => {
    console.log('entrada: ', entrada);
    console.log(letraSorteada);
    console.log(entrada == letraSorteada);
    if (entrada == letraSorteada) {
      setMensagem('acertou');
      setFimDeJogo(true);
    } else if (indiceImagemAtual == 6) setMensagem('fim de jogo');
    else setIndiceImagemAtual(indiceImagemAtual + 1);
    setEntrada('')
  };

  const novoJogo = () => {
    setFimDeJogo(false);
    setLetraSorteada(sortearLetra());
  };
  return (
    <View style={estilos.container}>
      <Image source={imagens[indiceImagemAtual]} />
      {fimDeJogo ? (
        <View>
          <Text style={{ fontSize: 40 }}>{mensagem}</Text>
          <Button title="Jogar novamente" onPress={novoJogo} />
        </View>
      ) : (
        <View style={{ flexDirection: 'row', gap: 8 }}>
          <TextInput
            maxLength={1}
            style={estilos.entrada}
            value={entrada}
            onChangeText={(letra) => setEntrada(letra.toUpperCase())}
          />
          <Button title="jogar" onPress={verificarEntrada} />
        </View>
      )}
    </View>
  );
}

const estilos = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    gap: 8,
  },
  entrada: {
    fontSize: 20,
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    padding: 8,
    marginBottom: 8,
  },
});
