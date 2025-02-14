var nomeCompleto = prompt("Informe seu nome completo:");
var nomeArray = nomeCompleto.split(" ");
var primeiroNome = nomeArray[0].toUpperCase();
var restoNome = nomeArray.slice(1).join(" ").toLowerCase();
var nomeFormatado = primeiroNome + " " + restoNome;
alert("Seu nome formatado é: " + nomeFormatado);
