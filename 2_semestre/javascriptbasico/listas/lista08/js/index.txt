document.getElementById('submit-btn').addEventListener('click', function() {
    const nome = document.getElementById('nome').value.trim();
    const idade = parseInt(document.getElementById('idade').value);
    const hobby = document.getElementById('hobby').value;

    if (!nome) {
        alert('O nome não pode estar vazio.');
        return;
    }

    if (isNaN(idade) || idade < 1 || idade > 130) {
        alert('Idade inválida. Insira um valor entre 1 e 130.');
        return;
    }

    if (!hobby) {
        alert('Selecione um passatempo válido.');
        return;
    }

    localStorage.setItem('userName', nome);
    localStorage.setItem('userHobby', hobby);

    window.location.href = 'aguarde.html';
});