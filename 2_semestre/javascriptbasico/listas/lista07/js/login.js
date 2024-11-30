document.getElementById("btnLogin").addEventListener("click", function () {
    const email = document.getElementById("loginUser").value.trim();
    const senha = document.getElementById("loginPwd").value.trim();

    if (!email || !senha) {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    const users = JSON.parse(localStorage.getItem("users")) || [];

    const user = users.find(user => user.username === email);

    if (!user) {
        alert("Usuário inexistente. Tente outro usuário.");
    } else if (user.password !== senha) {
        alert("Usuário existente, porém senha inválida.");
    } else {
        alert("Login realizado com sucesso!");
        window.location.href = "jogo.html"; // Redireciona para a página do jogo
    }
});
