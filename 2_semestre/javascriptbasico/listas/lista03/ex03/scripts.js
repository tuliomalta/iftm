function gerarNumeroAleatorio() {
    const numeroN = document.getElementById('numeroN').value;
    const n = parseInt(numeroN);

    if (isNaN(n) || n < 1) {
        alert("Por favor, digite um número válido maior ou igual a 1.");
        return;
    }

    const numeroAleatorio = Math.floor(Math.random() * n) + 1;

    document.getElementById('resultado').textContent = `Número Aleatório: ${numeroAleatorio}`;
}