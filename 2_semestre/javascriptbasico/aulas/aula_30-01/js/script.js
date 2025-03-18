window.addEventListener("DOMContentLoaded", function () {

    const box = document.getElementById("box");

    const p = document.getElementById("info");

    box.addEventListener("mouseenter", function () {

        // p.innerHTML= "entrei na caixa"

        p.innerHTML = `${getComputedStyle(box).textAlign}

${getComputedStyle(box).margin}`;

        //box.classList.remove("mouseOut")

        //box.classList.add("mouseIn");

        //box.classList.replace("mouseOut", "mouseIn");

    })

    box.addEventListener("mouseout", function () {

        //box.classList.remove("mouseIn");

        //box.classList.add("mouseout");

        //box.classList.replace("mouseIn", "mouseOut");

        alertWifi("Olá, tudo bem?", true, 5, "img/logo.png", 30, "");

    })

})