function gerarSenha() {
    const comprimento = document.getElementById('length').value;
    
    if (!comprimento || comprimento < 8 || comprimento > 100) {
        alert('Por favor, insira um número válido entre 8 e 100 caracteres.');
        return;
    }

    const TODOS_CARACTERES = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';

    let senha = '';

    for (let i = 0; i < comprimento; i++) {
        const indiceAleatorio = Math.floor(Math.random() * TODOS_CARACTERES.length);
        senha += TODOS_CARACTERES.charAt(indiceAleatorio);
    }

    document.getElementById('senha').value = senha;
}
