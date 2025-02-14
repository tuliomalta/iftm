document.getElementById("substituir").addEventListener("click", function() {
    var texto = document.getElementById("textoInput").value;
    var palavra1 = document.getElementById("palavra1Input").value;
    var palavra2 = document.getElementById("palavra2Input").value;
    
    if (texto === "" || palavra1 === "" || palavra2 === "") {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    var textoAlterado = texto.replace(new RegExp(palavra1, 'g'), palavra2);
    alert("Texto alterado: " + textoAlterado);
});
