window.addEventListener('DOMContentLoaded', function() {
    var nome01 = document.getElementById('nome01');
    var nome02 = document.getElementById('nome02');
    var btnExibir = document.getElementById('btnExibir');
    var txtParag = document.getElementById('txtParag');

    btnExibir.addEventListener('click', function() {
        setTimeout(copiarTxt, 2000);
    });

    function copiarTxt() {
        nome02.value = nome01.value;
        txtParag.innerHTML = nome01.value;
    }

});
