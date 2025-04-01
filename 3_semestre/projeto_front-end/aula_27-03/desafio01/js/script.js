window.addEventListener('DOMContentLoaded', function() {

    const tabelaDados = [
        { nome: 'Ana', idade: 18, genero: 'F', salario: 1000 },
        { nome: 'João', idade: 20, genero: 'M', salario: 3000 },
        { nome: 'César', idade: 33, genero: 'M', salario: 1900 },
        { nome: 'Maria', idade: 12, genero: 'F', salario: 7000 },
        { nome: 'Zé', idade: 17, genero: 'M', salario: 2400 }
    ]

    const nomeIdade = tabelaDados.filter(elemento => elemento.idade > 18);
    

    nomeIdade.forEach(({nome, idade}) => {
            console.log(`${nome}, ${idade}`)
    });
    
    const nomesMasc = tabelaDados.filter(({genero}) => genero === 'M');

    nomesMasc.forEach(({nome}) => {
        console.log(nome);
    });
    

    
});