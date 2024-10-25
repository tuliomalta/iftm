function gerarSenha() {
    const comprimento = document.getElementById('length').value;
    
    if (!comprimento || comprimento < 1 || comprimento > 100) {
        alert('Por favor, insira um número válido entre 1 e 100.');
        return;
    }

    const caracteresMinusculos = 'abcdefghijklmnopqrstuvwxyz';
    const caracteresMaiusculos = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    const numeros = '0123456789';
    const todosCaracteres = caracteresMinusculos + caracteresMaiusculos + numeros;

    let senha = '';

    for (let i = 0; i < comprimento; i++) {
        const indiceAleatorio = Math.floor(Math.random() * todosCaracteres.length);
        senha += todosCaracteres.charAt(indiceAleatorio);
    }

    document.getElementById('senha').value = senha;
}
