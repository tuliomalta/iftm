const days = ['domingo', 'segunda-feira', 'terça-feira', 'quarta-feira', 'quinta-feira', 'sexta-feira', 'sábado'];
const today = new Date().getDay();
document.getElementById('day').innerHTML = `Hoje é ${days[today]}`;