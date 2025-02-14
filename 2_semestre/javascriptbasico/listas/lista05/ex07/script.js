document.getElementById("mostrarResultado").addEventListener("click", function() {
    var texto = document.getElementById("textoInput").value;
    var letra = document.getElementById("letraInput").value.toLowerCase();
    
    if (letra.length === 1 && texto.trim() !== "") {
        var palavras = texto.trim().split(/\s+/);
        var palavrasFiltradas = palavras.filter(function(palavra) {
            return palavra.toLowerCase().startsWith(letra);
        });
        
        document.getElementById("resultado").innerText = palavrasFiltradas.join(" ");
    } else {
        document.getElementById("resultado").innerText = "Por favor, insira uma letra válida e um texto.";
    }
});
