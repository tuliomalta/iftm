function gerarNumeroAleatorio() {
    const numeroN = document.getElementById('numeroN').value;
    const numeroM = document.getElementById('numeroM').value;

    const n = parseInt(numeroN);
    const m = parseInt(numeroM);

    if (isNaN(n) || isNaN(m)) {
        alert("Por favor, digite valores válidos para N e M.");
        return;
    }

    if (n >= m) {
        alert("O valor de N deve ser menor que M.");
        return;
    }

    const numeroAleatorio = Math.floor(Math.random() * (m - n + 1)) + n;
    document.write(`Número Aleatório entre ${n} e ${m}: ${numeroAleatorio}`);
}