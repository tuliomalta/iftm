nome = prompt("Qual é o seu nome?");
numero = prompt("Quantas vezes quer exibir o seu nome?");

cor = prompt("Qual a cor você deseja que seu nome apareça?")

for (i = 0; i < numero; i++) {
    document.write(`<p style="color: ${cor}">${nome}</p>`)
}

