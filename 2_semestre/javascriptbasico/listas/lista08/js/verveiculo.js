const vehicles = {
    shopping: [
        {
            image: 'civic.jpg',
            details: 'Fabricante: Honda, Nome: Civic, Potência: 150 cv, Garantia: 3 anos, Consumo: 9,7 km/l'
        },
        {
            image: 'corolla.jpg',
            details: 'Fabricante: Toyota, Nome: Corolla, Potência: 144 cv, Garantia: 3 anos, Consumo: 10,6 km/l'
        }
    ],
    nature: [
        {
            image: 'troller.jpg',
            details: 'Fabricante: Ford, Nome: Troller, Potência: 200 cv, Garantia: 3 anos, Consumo: 7,7 km/l'
        },
        {
            image: 'wrangler.jpg',
            details: 'Fabricante: Jeep, Nome: Wrangler, Potência: 199 cv, Garantia: 2 anos, Consumo: 3,1 km/l'
        }
    ]
};

const userName = localStorage.getItem('userName');
const userHobby = localStorage.getItem('userHobby');
const slideshowContainer = document.getElementById('slideshow');
const userMessage = document.getElementById('user-message');

userMessage.textContent = `${userName}, veja as opções para o seu perfil`;

const selectedVehicles = vehicles[userHobby];
let currentIndex = 0;

function updateSlideshow() {
    const vehicle = selectedVehicles[currentIndex];
    slideshowContainer.innerHTML = `
        <img src="${vehicle.image}" alt="${vehicle.details}">
        <p>${vehicle.details}</p>
    `;
    currentIndex = (currentIndex + 1) % selectedVehicles.length;
    setTimeout(updateSlideshow, 2000);
}

updateSlideshow();

document.getElementById('change-profile').addEventListener('click', () => {
    window.location.href = 'index.html';
});
