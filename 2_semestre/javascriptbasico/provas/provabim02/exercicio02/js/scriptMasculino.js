let contadorMario = 0;
        let contadorLuigi = 0;

        function trocarPersonagem(personagem) {
            const img = document.getElementById('personagem');
            if (personagem === 'luigi') {
                img.src = "Imagens/luigi.gif";
                img.alt = "Luigi";
                img.onclick = () => incrementarContador('luigi');
            } else {
                img.src = "Imagens/mario.gif";
                img.alt = "Mário";
                img.onclick = () => incrementarContador('mario');
            }
        }

        function incrementarContador(personagem) {
            if (personagem === 'mario') {
                contadorMario++;
                document.getElementById('contadorMario').textContent = contadorMario;
            } else if (personagem === 'luigi') {
                contadorLuigi++;
                document.getElementById('contadorLuigi').textContent = contadorLuigi;
            }
        }s