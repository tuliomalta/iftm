import { useEffect, useState } from "react";


function Contadores() {

    const [cont1,setCont1] = useState(0);
    const [cont2,setCont2] = useState(0);

    useEffect(() => {
        console.log(Math.random());
    }); // roda após a montagem do componente e após cada atualização
    // },[]); // roda apenas uma vez após a montagem do componente
    // },[cont1]); // roda apenas quando cont1 for atualizado
    // },[cont1, cont2]); // roda apenas quando cont1 ou cont2 forem atualizados

    return (
        <>
            <form action="">
                <input type="button" value="Incrementar +1" onClick={()=>setCont1(cont1+1)} />
                <input type="button" value="Incrementar +2" onClick={() => setCont2(cont2+2)}/>
            </form>
            <p>Contador 1: {cont1}</p>
            <p>Contador 2: {cont2}</p>
        </>
    );
}

export default Contador;