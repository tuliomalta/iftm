function gerarNumeros() {
    let numeros = new Set();

    while (numeros.size < 6) {
        let numero = Math.floor(Math.random() * 60) + 1;
        numeros.add(numero);
    }

    document.getElementById("resultado").innerHTML = 
        `Números sorteados: ${[...numeros].sort((a, b) => a - b).join(" - ")}`;
}
