window.addEventListener("DOMContentLoaded", function() {
    var vetCelular = [
        {img: "cel01.png", info: "Samsung"},
        {img: "cel02.png", info: "Motorola"},
        {img: "cel03.png", info: "Xiaomi"}
    ]});

    var slideAtual = 0;
    var idCron = null;
    var slideShow = this.document.getElementById("slideShow");
    var info = this.document.getElementById("infoSlideShow");

    function mostrarImg() {

