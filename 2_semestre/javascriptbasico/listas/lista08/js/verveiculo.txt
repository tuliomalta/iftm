window.addEventListener('DOMContentLoaded', function () {
    var userName = document.getElementById('userName');
    var imgVehicle = document.getElementById('imgVehicle');
    var userHobby = localStorage.getItem('userHobby');
    var mudarPerfil = document.getElementById('mudarPerfil');
    var fabricante = document.getElementById("fabricante");
    var nomeVeiculo = document.getElementById("nomeVeiculo");
    var potencia = document.getElementById("potencia");
    var garantia = document.getElementById("garantia");
    var consumo = document.getElementById("consumo");
    var nome = document.getElementById("nome");
    var userMessage = document.getElementById("userMessage");
});

nome.textContent = userName;

userMessage.innerHTML = `${userName}, veja as opções para o seu perfil:`;

var vehicles = {
    "shopping": [
        { "Fabricante: Honda, Nome: Civic, Potência: 150 cv, Garantia: 3 anos, Consumo: 9,7 km/l"},
        { "Fabricante: Toyota, Nome: Corolla, Potência: 144 cv, Garantia: 3 anos, Consumo: 10,6 km/l"}
    ],
    "nature": [
        { "Fabricante: Ford, Nome: Troller, Potência: 200 cv, Garantia: 3 anos, Consumo: 7,7 km/l"},
        { "Fabricante: Jeep, Nome: Wrangler, Potência: 199 cv, Garantia: 2 anos, Consumo: 3,1 km/l"}
    ]
};

var selectVehicle = (userHobby === "shopping") ? vehicles.shopping : vehicles.nature;
var vehicleIndex = 0;

function updateVehicle() {
    var vehicle = selectVehicle[vehicleIndex];
    imgVehicle.src = "img/" + vehicle.img;
    fabricante.textContent = vehicle.Fabricante;
    nomeVeiculo.textContent = vehicle.Nome;
    potencia.textContent = vehicle.Potência;
    garantia.textContent = vehicle.Garantia;
    consumo.textContent = vehicle.Consumo;
}

updateVehicle();

var intervaloSlideshow = setInterval(function () {
    vehicleIndex = (vehicleIndex + 1) % selectVehicle.length;
    updateVehicle();
}, 2000);

clearInterval(intervaloSlideshow);

getItem(mudarPerfil).addEventListener('click', function () {
    window.location.href = 'index.html';
});
