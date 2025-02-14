document.getElementById("mostrarResultado").addEventListener("click", function() {
    var texto = document.getElementById("textoInput").value;
    var letras = "abcdefghijklmnopqrstuvwxyz".split('');
    var palavras = texto.trim().split(/\s+/);
    palavras = palavras.map(function(palavra) {
        return palavra.replace(/[.,!?;:(){}[\]"']/g, "");  // Remove pontuação
    });
    
    var palavrasPorLetra = {};

    letras.forEach(function(letra) {
        palavrasPorLetra[letra] = [];
    });

    palavras.forEach(function(palavra) {
        var primeiraLetra = palavra.charAt(0).toLowerCase();
        if (letras.includes(primeiraLetra)) {
            palavrasPorLetra[primeiraLetra].push(palavra);
        }
    });

    var resultado = '';
    letras.forEach(function(letra) {
        if (palavrasPorLetra[letra].length > 0) {
            resultado += `<strong>Palavras com a letra "${letra.toUpperCase()}":</strong><br><ul>`;
            palavrasPorLetra[letra].forEach(function(palavra) {
                resultado += `<li>${palavra}</li>`;
            });
            resultado += '</ul><br>';
        }
    });

    document.getElementById("resultado").innerHTML = resultado;
});
