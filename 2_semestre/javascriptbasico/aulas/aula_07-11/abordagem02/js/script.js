function exibirMsg(){
    alert("Mensagem 1!")
}

function exibirMsg2(){
    alert("Mensagem 2!")
}

var btn = document.getElementById("btn1");
var btn2 = document.getElementById("btn2");


btn.onclick = exibirMsg; // não coloque parenteses para não executar a função antes do clique
btn2.onmouseenter = exibirMsg2;
