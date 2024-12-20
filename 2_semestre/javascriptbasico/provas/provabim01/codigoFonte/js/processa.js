document.addEventListener('DOMContentLoaded', function() {
    const nome = localStorage.getItem('nome').toUpperCase();
    const sobrenome = localStorage.getItem('sobrenome').toUpperCase();
    const faixaEtaria = localStorage.getItem('faixaEtaria');
    const span = document.getElementById('nomeUsuario');
    const usuario = document.getElementById('usuario');
    const senha = document.getElementById('senha');
    const aplicacao = document.getElementById('aplicacao');

    span.textContent = `${nome} ${sobrenome}`;
    span.style.color = "black";
    usuario.textContent = `Usuário: ${nome}`;
    usuario.style.color = "blue";
    senha.textContent = `Senha: ${nome.charAt(0)}${sobrenome.charAt(0)}`;
    senha.style.color = "blue";

    if (faixaEtaria === "Entre 19 a 21 anos") {
        aplicacao.textContent = "Renda Fixa";
        aplicacao.style.color = "blue";
    } else if (faixaEtaria === "Entre 22 a 30 anos") {
        aplicacao.textContent = "Ações";
        aplicacao.style.color = "blue";
    } else if (faixaEtaria === "31 anos ou mais") {
        aplicacao.textContent = "Fundo de Investimento Imobiliário";
        aplicacao.style.color = "blue";
    }
});

