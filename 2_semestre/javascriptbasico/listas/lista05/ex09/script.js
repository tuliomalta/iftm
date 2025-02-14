document.getElementById("verificarPalindromo").addEventListener("click", function() {
    var texto = document.getElementById("textoInput").value.trim().toLowerCase();
    var textoInvertido = texto.split("").reverse().join("");
    
    if (texto === textoInvertido) {
        alert("O texto é um palíndromo!");
    } else {
        alert("O texto não é um palíndromo.");
    }
});
