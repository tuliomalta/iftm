const today = new Date().getDay();
let dayName = '';

switch (today) {
    case 0:
        dayName = 'domingo';
        break;
    case 1:
        dayName = 'segunda-feira';
        break;
    case 2:
        dayName = 'terça-feira';
        break;
    case 3:
        dayName = 'quarta-feira';
        break;
    case 4:
        dayName = 'quinta-feira';
        break;
    case 5:
        dayName = 'sexta-feira';
        break;
    case 6:
        dayName = 'sábado';
        break;
}

document.getElementById('day').innerHTML = `Hoje é ${dayName}`;