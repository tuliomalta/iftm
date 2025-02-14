function sortearCarta() {
    let numero = Math.floor(Math.random() * 27) + 1;
    let caminhoImagem = `cartas/carta${numero}.png`;

    let cartaImg = document.getElementById("carta");
    cartaImg.src = caminhoImagem;
    cartaImg.style.display = "block";
}
