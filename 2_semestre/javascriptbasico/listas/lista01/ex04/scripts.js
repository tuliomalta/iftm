const nota1 = parseFloat(prompt("Digite a nota do 1º bimestre:"));
const nota2 = parseFloat(prompt("Digite a nota do 2º bimestre:"));
const soma = nota1 + nota2;

if (soma >= 60) {
    alert("Você foi APROVADO.");
} else {
    const pontosFaltantes = 60 - soma;
    alert(`Você foi REPROVADO. Faltam ${pontosFaltantes} pontos para aprovação.`);
}
