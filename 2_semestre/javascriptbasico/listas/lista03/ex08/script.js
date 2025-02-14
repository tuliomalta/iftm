function jogar() {
    const opcoes = ["pedra", "papel", "tesoura"];
    const imagens = {
        pedra: "imagens/pedra.jpg",
        papel: "imagens/papel.jpg",
        tesoura: "imagens/tesoura.jpg"
    };

    let escolha1 = opcoes[Math.floor(Math.random() * 3)];
    let escolha2 = opcoes[Math.floor(Math.random() * 3)];

    document.getElementById("jogador1").src = imagens[escolha1];
    document.getElementById("jogador2").src = imagens[escolha2];

    let resultado = "";

    if (escolha1 === escolha2) {
        resultado = "Empate!";
    } else if (
        (escolha1 === "pedra" && escolha2 === "tesoura") ||
        (escolha1 === "papel" && escolha2 === "pedra") ||
        (escolha1 === "tesoura" && escolha2 === "papel")
    ) {
        resultado = "Jogador 1 venceu!";
    } else {
        resultado = "Jogador 2 venceu!";
    }

    document.getElementById("resultado").innerText = resultado;
}

window.onload = jogar;
