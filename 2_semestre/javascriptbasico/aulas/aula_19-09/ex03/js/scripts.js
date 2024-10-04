nome = prompt("Qual é o seu nome?");

if ((nome == null) || (nome.trim() == "")) {
    alert("Nome não informado.");
} else {
    alert (`Bem vindo, ${nome}`);
}

notaPrimeiroBimestre = prompt("Qual foi a sua nota no primeiro bimestre?");

nota1 = parseFloat(notaPrimeiroBimestre);

if ((notaPrimeiroBimestre == null) || (notaPrimeiroBimestre.trim() == "")) {
    alert("Nota não informada.");
}

notaSegundoBimestre = prompt("Qual foi a sua nota no segundo bimestre?");

nota2 = parseFloat(notaSegundoBimestre);

if ((notaSegundoBimestre == null) || (notaSegundoBimestre.trim() == "")) {
    alert("Nota não informada.");
}

notaFinal = (nota1 + nota2) / 2;

if (notaFinal >= 6) {
    alert(`${nome}, você está APROVADO.`);
} else {
    alert(`${nome}, você está REPROVADO.`);
}