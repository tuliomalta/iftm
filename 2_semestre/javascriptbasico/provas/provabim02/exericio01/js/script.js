const texto = prompt("Digite um texto qualquer:");

const letra = prompt("Digite uma letra para remover as palavras que começam com ela:");

function removerPalavras(texto, letra) {
    const letraMinuscula = letra.toLowerCase();
    
    const palavras = texto.split(" ");

    const palavrasFiltradas = palavras.filter(palavra => {
               
        return !palavra.toLowerCase().startsWith(letraMinuscula);
    });

    return palavrasFiltradas.join(" ");
}

const resultado = removerPalavras(texto, letra);

document.getElementById("output").innerText = resultado;

