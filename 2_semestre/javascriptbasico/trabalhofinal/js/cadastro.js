document.addEventListener("DOMContentLoaded", () => {
    const cadastroForm = document.getElementById("cadastroForm");
    const nomeInput = document.getElementById("nome");
    const cpfInput = document.getElementById("cpf");
    const celularInput = document.getElementById("celular");
    const emailInput = document.getElementById("email");
    const senhaInput = document.getElementById("senha");
    const sexoSelect = document.getElementById("sexo");
    const cadastroError = document.getElementById("cadastroError");
    const btnCancelar = document.getElementById("btnCancelar");
  
    function getUsers() {
      let users = localStorage.getItem("usuarios");
      return users ? JSON.parse(users) : [];
    }
  
    function saveUser(user) {
      let users = getUsers();
      users.push(user);
      localStorage.setItem("usuarios", JSON.stringify(users));
    }
  
    function validarEmail(email) {
      const regex = /^[^@]+@[^@]+\.[^@]+(\.[^@]+)?$/;
      return regex.test(email);
    }
  
    function validarSenha(senha) {
      const regex = /^(?=.*[A-Z])(?=.*\d).{8,}$/;
      return regex.test(senha);
    }
  
    cadastroForm.addEventListener("submit", (e) => {
      e.preventDefault();
      const nome = nomeInput.value.trim();
      const cpf = cpfInput.value.trim();
      const celular = celularInput.value.trim();
      const email = emailInput.value.trim();
      const senha = senhaInput.value;
      const sexo = sexoSelect.value;
      if (!nome || !cpf || !celular || !email || !senha || !sexo) {
        cadastroError.textContent = "Preencha todos os campos.";
        return;
      }
      if (!/^\d{1,11}$/.test(celular)) {
        cadastroError.textContent = "Celular deve conter apenas números (máximo 11 dígitos).";
        return;
      }
      if (!validarEmail(email)) {
        cadastroError.textContent = "Formato de e-mail inválido.";
        return;
      }
      if (!validarSenha(senha)) {
        cadastroError.textContent = "Senha deve ter no mínimo 8 caracteres, 1 letra maiúscula e 1 número.";
        return;
      }
      let users = getUsers();
      if (users.some(u => u.cpf === cpf)) {
        cadastroError.textContent = "CPF já cadastrado.";
        return;
      }
      const newUser = { nome, cpf, celular, email, senha, sexo };
      saveUser(newUser);
      window.location.href = "login.html";
    });
  
    btnCancelar.addEventListener("click", () => {
      window.location.href = "login.html";
    });
  });
  