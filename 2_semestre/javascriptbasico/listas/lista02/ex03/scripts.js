const codes = ['P2', 'AP', 'POO1', 'FBD', 'JSB'];
const names = ['Projeto Sistema Web MVC e SQL', 'Algoritmos e Programação', 'Programação Orientada a Objetos 1', 'Fundamentos de Banco de Dados', 'JavaScript Básico'];

const tableBody = document.querySelector('#disciplines tbody');

for (let index in codes) {
    const row = document.createElement('tr');
    row.innerHTML = `<td>${codes[index]}</td><td>${names[index]}</td>`;
    tableBody.appendChild(row);
}