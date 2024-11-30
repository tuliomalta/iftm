var txtUser = document.getElementById("txtUser");
var txtPwd = document.getElementById("txtPwd");
var btnCadastrar = document.getElementById("btnCadastrar");

btnCadastrar.addEventListener("click", function() {
    var newUser = {username: txtUser.value, password: txtPwd.value};
    
    var users = localStorage.getItem("users");

    // Função para verificar se o usuário já existe
    function checkUser(username, users) {
        return users.some(user => user.username === username);
    }

    // cadastrar o primeiro usuário (criar a chave)
    if (!users) {
        localStorage.setItem("users", JSON.stringify([newUser]));
    // adicionar o novo usuário a lista existente
    } else {
        var users = JSON.parse(users);
        
        // Verificar se o usuário já existe
        if (checkUser(newUser.username, users)) {
            alert("Esse usuário já existe. Tente com um novo usuário.");
        } else {
            users.push(newUser);
            localStorage.setItem("users", JSON.stringify(users));
            alert("Usuário cadastrado com sucesso!");
        }
    }
});