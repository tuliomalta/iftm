const nomeCompleto = localStorage.getItem("nomeCompleto");

document.getElementById('nomeCompleto').value = nomeCompleto;
document.getElementById('nomeCompletoTexto').textContent = nomeCompleto;

const apenasLetras = nomeCompleto.replace(/[^a-zA-ZÀ-ÿ]/g, '');

const palavras = nomeCompleto.split(' ');

document.getElementById('quantidadeCaracteres').textContent = apenasLetras.length;
document.getElementById('primeiraPalavra').textContent = palavras[0];
document.getElementById('ultimaPalavra').textContent = palavras[palavras.length - 1];
document.getElementById('quantidadePalavras').textContent = palavras.length;