document.querySelector('input[value="Cadastrar"]').addEventListener('click', function() {
    const nome = document.getElementById('nome').value.trim();
    const sobrenome = document.getElementById('sobrenome').value.trim();
    const faixaEtaria = document.getElementById('faixaEtaria').value;
    const txtAlterar = document.getElementById('txtAlterar');
    const img = document.getElementById('b3');

    if (!nome || !sobrenome) {
        txtAlterar.textContent = "Nome e sobrenome devem ser informados";
        txtAlterar.style.color = "red";
        img.src = "img/erro.png";
    } else if (faixaEtaria === "Selecione") {
        txtAlterar.textContent = "Selecione a sua faixa etária";
        txtAlterar.style.color = "red";
        img.src = "img/erro.png";
    } else if (faixaEtaria === "Entre 0 a 12 anos" || faixaEtaria === "Entre 13 a 18 anos") {
        txtAlterar.textContent = `${nome.toUpperCase()} ${sobrenome.toUpperCase()} você não tem idade suficiente`;
        txtAlterar.style.color = "red";
        img.src = "img/erro.png";
    } else {
        txtAlterar.textContent = "Processando. Aguarde (5 segundos)";
        txtAlterar.style.color = "blue";
        img.src = "img/processando.gif";
        localStorage.setItem('nome', nome);
        localStorage.setItem('sobrenome', sobrenome);
        localStorage.setItem('faixaEtaria', faixaEtaria);
        setTimeout(function() {
            window.location.href = "processa.html";
        }, 5000);
    }
});

document.getElementById('nome').addEventListener('click', function() {
    const txtAlterar = document.getElementById('txtAlterar');
    if (txtAlterar.textContent === "Nome e sobrenome devem ser informados") {
        txtAlterar.textContent = "* Favor preencher todos os campos acima";
        txtAlterar.style.color = "red";
    }
});

document.getElementById('sobrenome').addEventListener('click', function() {
    const txtAlterar = document.getElementById('txtAlterar');
    if (txtAlterar.textContent === "Nome e sobrenome devem ser informados") {
        txtAlterar.textContent = "* Favor preencher todos os campos acima";
        txtAlterar.style.color = "red";
    }
});

document.querySelector('input[value="Limpar"]').addEventListener('click', function() {
    document.getElementById('nome').value = '';
    document.getElementById('sobrenome').value = '';
    document.getElementById('faixaEtaria').value = 'Selecione';
    const txtAlterar = document.getElementById('txtAlterar');
    txtAlterar.textContent = "* Favor preencher todos os campos acima";
    txtAlterar.style.color = "blue";
    const img = document.getElementById('b3');
    img.src = "img/b3.png";
});