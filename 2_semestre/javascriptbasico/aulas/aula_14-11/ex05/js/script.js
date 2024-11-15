var btnResult = document.getElementById('btnResult');
var txtValue1 = document.getElementById('txtValue1');
var txtValue2 = document.getElementById('txtValue2');
var txtResult = document.getElementById('txtResult');

btnResult.addEventListener('click', function() {
    txtResult.value = eval(txtValue1.value + operador.value + txtValue2.value);
});