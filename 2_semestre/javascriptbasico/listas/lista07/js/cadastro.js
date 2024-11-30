document.getElementById("btnCadastrar").addEventListener("click", function () {
    const email = document.getElementById("cadastroUser").value.trim();
    const senha = document.getElementById("cadastroPwd").value.trim();

    if (!email || !senha) {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    if (senha.length < 5) {
        alert("Senha inválida. Informe uma senha contendo pelo menos 5 caracteres.");
        return;
    }

    const users = JSON.parse(localStorage.getItem("users")) || [];

    if (users.some(user => user.username === email)) {
        alert("Usuário já existente. Tente outro.");
    } else {
        users.push({ username: email, password: senha });
        localStorage.setItem("users", JSON.stringify(users));
        alert("Usuário cadastrado com sucesso!");
        window.location.href = "index.html"; // Redireciona para a página de login
    }
});
