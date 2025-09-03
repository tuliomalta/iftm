import { useState, useEffect } from 'react';
import style from './Ranking.module.css';
function Ranking() {

    const [users, setUsers] = useState(null);
useEffect(() => {
    fetch('https://wilton-filho.github.io/PFJS-GitHub/APIs/fetch/versao01/03/js/users.json')
    .then(response => response.json())
    .then(dados => setUsers(dados.setUsers))
}, []);

    function showUsers() {
        return (
            <ul>
                {users.map(user => <li><span className= {style.alert}>{user.name}</span><li/>) ({user.level}:{user.score})</li>)}
            </ul>
        )
    }
    
    
        return (
        <>
            <h2>Melhores Colocados (Ranking):</h2>
            <div className= {style.ranking}>
                {users && showUsers()}
            </div>
        </>
)}

export default Ranking;