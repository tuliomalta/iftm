const vezes = parseInt(prompt("Digite um número inteiro positivo:"));
const nome = prompt("Digite seu nome completo:");

const output = document.getElementById('output');
for (let i = 0; i < vezes; i++) {
    const p = document.createElement('p');
    p.textContent = nome;
    output.appendChild(p);
}
