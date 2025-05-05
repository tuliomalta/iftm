import getCats from "./thecatapi.js";

window.addEventListener("DOMContentLoaded", () => {
    document.getElementById("btnShowCats").addEventListener("click",showCats);})

const showCats = async () => {
    showMsgAlerta("Processando. Aguarde...");
    const vetCats = await getCats();
    console.log(vetCats);

    if (vetCats.length > 0) {
        const catPainel = document.getElementById("catPainel");

        vetCats.forEach(gato => {
        const img = document.createElement("img");
        const parag = document.createElement("p");
        img.src = vetCats[0].url;
        img.className = "cat";
        img.alt = "Gatinho";
        catPainel.appendChild(img);
        catPainel.appendChild(parag);
        })
        
        showMsgAlerta("");
}
else {

    showMsgAlerta("Erro no carregamento dos gatos");}
}

const showMsgAlerta = (msg) => {
    document.getElementById("msgAlerta").innerHTML = msg;
}