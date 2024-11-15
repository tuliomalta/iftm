var boy = document.getElementById("boy");
var textBoy = document.getElementById("textBoy");

// Evento ao passar o mouse
boy.addEventListener("mouseenter", function() {
    boy.src = "img/assustado.png";
    textBoy.innerHTML = "O que você quer?";
});

// Evento ao tirar o mouse
boy.addEventListener("mouseout", function() {
    boy.src = "img/pensativo.png";
    textBoy.innerHTML = "zzzzzzzz!";
    boy.classList.remove("nervous", "happy"); // Remove classes de animação
});

// Evento ao clicar
boy.addEventListener("click", function() {
    var userName = prompt("Qual é o seu nome?");
    if (userName === null || userName.trim() === "") {
        boy.src = "img/nervoso.png";
        textBoy.innerHTML = "Não me faça perder o meu tempo!";
        boy.classList.add("nervous"); // Adiciona animação de tremor
    } else {
        boy.src = "img/alegre.png";
        textBoy.innerHTML = `${userName}, seja bem-vindo!`;
        boy.classList.add("happy"); // Adiciona animação de balanço
    }
});
