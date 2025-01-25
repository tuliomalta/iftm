window.addEventListener("DOMContentLoaded", function () {
    var txtInfo = document.getElementById("txtInfo");
    var btnValidar = document.getElementById("btnValidar");

    btnValidar.addEventListener("click", function () {
       // var padrao = /\d/; // Expressão regular para encontrar um dígito

       // var padrao = /^\d/; // Expressão regular para encontrar um dígito no início da string

       // var padrao = /\d$/; // Expressão regular para encontrar um dígito no final da string

       // var padrao = /^\d$/; // Expressão regular para encontrar apanas 1 digito

       // var padrao = /^\(\d{2,3}\)\d{4,5}-\d{4}$/; // Expressão regular para encontrar um numero de telefone

       // var padrao = /\d{2}\/\d{2}\/\d{4}$/; // Expressão regular para encontrar uma data

       // var padrao = /\d{2}\.\d{3}-\d{3}$/; // Expressão regular para encontrar um CEP

       // var padrao = /^[Ii][Ff][Tt][Mm]-\d{4,6}-(TSPI|LCO|MKT):\d[A-Z]$/;

       // var padrao = /^(M|F|Masculino|Feminino)$/i; // Expressão regular onde o "i" ignora o case sensitive

       // var padrao = /^IFTM\s{1,3}TSPI$/; // Expressão regular que permite de 1 a 3 espaços
       
       // var padrao = /^IFTM\s{1,}TSPI$/; // Expressão regular que permite de 1 a infinitos espaços, por não colocar o limite superior

       // var padrao = /^IFTM\s?TSPI$/; // Ao usar a interrogação podemos colocar o espaço ou não

       // var padrao = /^[abcde]{2,}$/; // Expressão que permite formar palavras com as letras descritas

       // var padrao = /^[0-9a-f]+$/i; // Usar o "+" é para substituir {1,} que seria no mínimo 1

       // var padrao = /^[^+-*]$/; // O ^ dentro do colchetes serve para negar o que for colocado junto dele

       // var padrao = /^[0-2][0-3]:[0-5]\d$/;

       var padrao = /^[A-z]{4,}\d{2,4}\W{2}$/;





        if (padrao.test(txtInfo.value)) {
            alert("Contém dígito");
        } else {
            alert("Não contém dígito");
        }
    })
})