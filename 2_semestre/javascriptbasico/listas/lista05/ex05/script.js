var texto = prompt("Informe um texto qualquer:");
var palavras = texto.trim().split(/\s+/).length;
alert("Quantidade de palavras no texto: " + palavras);
