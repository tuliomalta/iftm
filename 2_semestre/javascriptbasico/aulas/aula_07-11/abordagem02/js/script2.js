function exibirMsg(msg){
    alert(msg)
}

btn1.onclick = function (){
    exibirMsg('Você clicou sobre mim!');
}

btn2.onmouseenter = function(){
    exibirMsg('Você passou o cursor sobre mim!');
}