document.getElementById("gerarTabela").addEventListener("click", function() {
    var numero = parseInt(document.getElementById("numeroInput").value);
    
    if (isNaN(numero) || numero < 2) {
        alert("Por favor, insira um número inteiro positivo maior ou igual a 2.");
        return;
    }

    var tabela = "<table><tr><th>Base decimal</th><th>Base binária</th><th>Base hexadecimal</th></tr>";

    for (var i = 0; i <= numero; i++) {
        tabela += "<tr><td>" + i + "</td><td>" + i.toString(2) + "</td><td>" + i.toString(16).toUpperCase() + "</td></tr>";
    }

    tabela += "</table>";
    document.getElementById("tabela").innerHTML = tabela;
});
