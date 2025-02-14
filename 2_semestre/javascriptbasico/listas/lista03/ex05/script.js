let passageiros = [];

function adicionarPassageiro() {
    let nome = document.getElementById("nome").value.trim();
    let idade = document.getElementById("idade").value.trim();

    if (nome === "" || idade === "" || isNaN(idade) || idade < 0) {
        alert("Por favor, insira um nome válido e uma idade positiva.");
        return;
    }

    passageiros.push({ nome, idade: parseInt(idade) });
    document.getElementById("lista").innerHTML += `<p>${nome} - ${idade} anos</p>`;

    document.getElementById("nome").value = "";
    document.getElementById("idade").value = "";
}

function calcularResultados() {
    if (passageiros.length === 0) {
        alert("Adicione pelo menos um passageiro antes de calcular.");
        return;
    }

    let somaIdades = passageiros.reduce((total, p) => total + p.idade, 0);
    let mediaIdade = (somaIdades / passageiros.length).toFixed(2);

    let sorteado = passageiros[Math.floor(Math.random() * passageiros.length)].nome;

    document.getElementById("resultado").innerHTML = 
        `Idade média: ${mediaIdade} anos <br> Passageiro sorteado: ${sorteado}`;
}
