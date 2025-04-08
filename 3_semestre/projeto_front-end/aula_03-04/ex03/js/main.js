// Destructing (desestruturação) em JS

window.addEventListener('DOMContentLoaded', () => {
    const vet = [10, 20, 30];

    // Desestruturação usando vetor

    const [a, b, c] = vet;

    console.log(a);
    console.log(b);
    console.log(c);

    // Desestruturação usando objeto, trocando nome do parametro

    const user1 = {nome: "Wilton", idade: 14};

    const {nome: nomeUser} = user1;

    console.log(nomeUser);
});