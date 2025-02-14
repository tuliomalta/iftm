document.getElementById("mostrarResultado").addEventListener("click", function() {
    var texto = document.getElementById("textoInput").value;
    var palavras = texto.trim().split(/\s+/);
    if (palavras.length > 1) {
        var primeiraPalavra = palavras[0];
        var ultimaPalavra = palavras[palavras.length - 1];
        var resultado = primeiraPalavra + " " + ultimaPalavra;
        document.getElementById("resultado").innerText = "Resultado: " + resultado;
    } else {
        document.getElementById("resultado").innerText = "Por favor, insira um texto com mais de uma palavra.";
    }
});
