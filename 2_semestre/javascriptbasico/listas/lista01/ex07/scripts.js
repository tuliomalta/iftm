const r = prompt("Digite o valor de R (0-255):");
const g = prompt("Digite o valor de G (0-255):");
const b = prompt("Digite o valor de B (0-255):");

const output = document.getElementById('output');
output.style.color = `rgb(${r},${g},${b})`;