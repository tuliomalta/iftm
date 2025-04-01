window.addEventListener(DOMException, function() {
    const maior = (x,y) => x > y ? x : y;

    console.log(maior(30,20));

    const vet = [10, 5, 78, 21, 33];
    const ref = 20;

    const maioresRef = (vet, ref) => {
        var vetMaiores = [];
        for (let i = 0; i < vet.length; i++) {
            if (vet[i] > ref) {
                vetMaiores.push(vet[i]);
            }
        return vetMaiores;
        }
    }

    const imprimirVet = (vet) => {
        vet.array.forEach((elemento, i, vet) => {
            console.log(`${i} = ${elemento} : ${vet}`);
        })};
    
    imprimirVet(maioresRef(vet, ref));

    console.log(vet.map(elemento => elemento * 2));

    const vet2 = [10, 20, 30, 15]

    console.log(vet2.filter(element => element >= 15));
    console.log(vet2.every(element => element >= 15));
    console.log(vet2.some(element => element >= 15));

    const total = vet2.reduce((total, elemento) => total += elemento, 0) 
    const media = total / vet2.length;

    console.log(media);
});