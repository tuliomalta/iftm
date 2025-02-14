function sortearCartas() {
    let todasCartas = Array.from({ length: 27 }, (_, i) => i + 1);
    todasCartas = todasCartas.sort(() => Math.random() - 0.5);

    for (let i = 1; i <= 4; i++) {
        let cartasSorteadas = todasCartas.splice(0, 3);
        let divCartas = document.querySelector(`#jogador${i} .cartas`);
        divCartas.innerHTML = "";

        cartasSorteadas.forEach(numero => {
            let img = document.createElement("img");
            img.src = `cartas/carta${numero}.png`;
            divCartas.appendChild(img);
        });
    }
}
