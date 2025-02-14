function sortear() {
    let nomes = document.getElementById("nomes").value.trim().split("\n").filter(nome => nome !== "");
    
    if (nomes.length < 2) {
        alert("Digite pelo menos dois nomes para sortear.");
        return;
    }

    nomes = nomes.sort(() => Math.random() - 0.5);

    let resultadoHtml = "<h2>Ordem de Apresentação:</h2><div class='lista'>";
    nomes.forEach((nome, index) => {
        resultadoHtml += `<div class='item'>${index + 1}º - ${nome}</div>`;
    });
    resultadoHtml += "</div>";

    document.getElementById("resultado").innerHTML = resultadoHtml;
}
