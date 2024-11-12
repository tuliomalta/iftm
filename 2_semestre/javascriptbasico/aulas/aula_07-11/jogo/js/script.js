var boy = document.getElementById("boy");
var textBoy = document.getElementById("textBoy");

boy.addEventListener("mouseenter", function() {
    boy.src = "img/assustado.png"
    textBoy.innerHTML = "O que você quer?"
});

boy.addEventListener("mouseout", function() {
    boy.src = "img/pensativo.png";
    textBoy.innerHTML = "zzzzzzzz!"
});