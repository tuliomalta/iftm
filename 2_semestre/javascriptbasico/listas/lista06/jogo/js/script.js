var boy = document.getElementById("boy");
var textBoy = document.getElementById("textBoy");

boy.addEventListener("mouseenter", function () {
    boy.src = "img/assustado.png";
    textBoy.innerHTML = "O que você quer?";
});

boy.addEventListener("mouseout", function () {
    boy.src = "img/pensativo.png";
    textBoy.innerHTML = "zzzzzzzz!";
    boy.classList.remove("nervous", "happy");
});

boy.addEventListener("click", function () {
    setTimeout(() => {
        var userName = prompt("Qual é o seu nome?");
        handleUserName(userName);
    }, 10);
});

function handleUserName(userName) {
    userName = userName && userName.trim();

    if (!userName) {
        boy.src = "img/nervoso.png";
        textBoy.innerHTML = "Não me faça perder o meu tempo!";
        boy.classList.add("nervous");
        setTimeout(() => boy.classList.remove("nervous"), 300);
    } else {
        boy.src = "img/alegre.png";
        textBoy.innerHTML = `${userName}, seja bem-vindo!`;
        boy.classList.add("happy");
        setTimeout(() => boy.classList.remove("happy"), 1000);
    }
}
