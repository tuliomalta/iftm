var primeiroNome = prompt("Qual o seu primeiro nome?");
var sobrenome = prompt("Qual o seu sobrenome?");
var quantidade = parseInt(prompt("Quantas vezes você deseja ver seu nome?"));
var cor = prompt("Qual cor você deseja para o seu sobrenome?(Digite a cor em inglês)");

for (var i = 1; i <= quantidade; i++) {
    var corPrimeiroNome = "black";
    var corSobrenome = cor;
    document.write("<p style='color:" + (i % 2 == 1 ? corPrimeiroNome : corSobrenome) + ";'>" +
        (i % 2 == 1 ? primeiroNome : sobrenome) + "</p>");
}
