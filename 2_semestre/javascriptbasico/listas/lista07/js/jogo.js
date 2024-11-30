var boy = document.getElementById("boy");
var textBoy = document.getElementById("textBoy");

// Evento ao passar o mouse
boy.addEventListener("mouseenter", function() {
    boy.src = "images/assustado.png";
    textBoy.innerHTML = "O que você quer?";
});

// Evento ao tirar o mouse
boy.addEventListener("mouseout", function() {
    boy.src = "images/pensativo.png";
    textBoy.innerHTML = "zzzzzzzz!";
    boy.classList.remove("nervous", "happy"); // Remove classes de animação
});

// Evento ao clicar
boy.addEventListener("click", function() {
    var userName = prompt("Qual é o seu nome?");
    if (userName === null || userName.trim() === "") {
        boy.src = "images/nervoso.png";
        textBoy.innerHTML = "Não me faça perder o meu tempo!";
        boy.classList.add("nervous"); // Adiciona animação de tremor
    } else {
        boy.src = "images/alegre.png";
        textBoy.innerHTML = `${userName}, seja bem-vindo!`;
        boy.classList.add("happy"); // Adiciona animação de balanço
    }
});

// Botão SAIR
document.getElementById("btnExit").addEventListener("click", function() {
    document.getElementById("exitMenu").style.display = "block"; // Exibe o menu de confirmação
});

// Botão SIM - sair do jogo
document.getElementById("btnYes").addEventListener("click", function() {
    window.location.href = "index.html"; // Redireciona para o login
});

// Botão NÃO - continuar no jogo
document.getElementById("btnNo").addEventListener("click", function() {
    document.getElementById("exitMenu").style.display = "none"; // Fecha o menu de confirmação
});
