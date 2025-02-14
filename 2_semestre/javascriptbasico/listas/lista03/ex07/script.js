function sortearDado() {
    let dado = document.getElementById("dado");
    let numeroSorteado = Math.floor(Math.random() * 6) + 1;

    dado.innerHTML = "";
    dado.className = "face-" + numeroSorteado;

    for (let i = 0; i < numeroSorteado; i++) {
        let dot = document.createElement("div");
        dot.classList.add("dot");
        dado.appendChild(dot);
    }
}
