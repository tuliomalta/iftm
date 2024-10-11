const nome = prompt("Digite seu nome completo:");
const idade = prompt("Digite sua idade:");

if (idade >= 18) {
    alert(`${nome}, você já POSSUI idade para tirar carteira de motorista.`);
} else {
    const anosFaltantes = 18 - idade;
    alert(`${nome}, você ainda NÃO POSSUI idade para tirar carteira de motorista. Faltam ${anosFaltantes} ano(s).`);
}
