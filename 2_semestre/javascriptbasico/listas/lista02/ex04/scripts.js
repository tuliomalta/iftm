const passengers = [
    { name: 'Ana', gender: 'F' },
    { name: 'Jane', gender: 'F' },
    { name: 'Bea', gender: 'F' },
    { name: 'Rose', gender: 'F' },
    { name: 'Tião', gender: 'M' },
    { name: 'Leo', gender: 'M' },
    { name: 'Juca', gender: 'M' },
    { name: 'Perl', gender: 'M' }
];

const women = passengers.filter(p => p.gender === 'F').map(p => p.name).sort();
const men = passengers.filter(p => p.gender === 'M').map(p => p.name).sort();

const womenList = document.getElementById('women-list');
const menList = document.getElementById('men-list');

women.forEach(name => {
    const li = document.createElement('li');
    li.textContent = name;
    womenList.appendChild(li);
});

men.forEach(name => {
    const li = document.createElement('li');
    li.textContent = name;
    menList.appendChild(li);
});