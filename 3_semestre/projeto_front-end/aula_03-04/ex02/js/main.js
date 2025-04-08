window.addEventListener('DOMContentLoaded', () => {
    // Exemplos de SPREAD usando arrays
    
    const vet1 = [10, 20, 30];
    const vet2 = [40, 50, 60];
    const vet3 = [...vet1, ...vet2];

    var x = Math.max(10,78,54);
    console.log(x);

    var y = Math.max(...vet1);
    console.log(y);



   // var a = vet[0];
   // var b = vet[1];
   // var c = vet[2];

   // Como realizar a atribuição acima utilizando o recurso SPREAD do JS?

   // [a, b, c] = [...vet1];

    // console.log(a,b,c);


    // Exemplo de SPREAD usando objetos

    const user1 = {nome: "Wilton", idade: 14};

    const copiaUser1 = {...user1};

    console.log(copiaUser1);

    // Crie um terceiro usuario que terá os mesmos valores do user1, usando SPREAD e adicionando sexo

    const user3 = {...user1, sexo: "M"};

    console.log(user3);

    // Crie um quarto usuario que terá os mesmos valores do user1, mas com idade alterada

    const user4 = {...user1, idade: 20};

    console.log(user4);
});