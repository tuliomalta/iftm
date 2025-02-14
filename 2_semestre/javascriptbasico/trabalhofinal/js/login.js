document.addEventListener("DOMContentLoaded", () => {
    const loginForm = document.getElementById("loginForm");
    const loginEmail = document.getElementById("loginEmail");
    const loginPassword = document.getElementById("loginPassword");
    const loginError = document.getElementById("loginError");
    const btnClear = document.getElementById("btnClear");
  
    function getUsers() {
      let users = localStorage.getItem("usuarios");
      return users ? JSON.parse(users) : [];
    }
  
    loginForm.addEventListener("submit", (e) => {
      e.preventDefault();
      const email = loginEmail.value.trim();
      const password = loginPassword.value.trim();
      const users = getUsers();
      const user = users.find(u => u.email === email && u.senha === password);
      if (user) {
        window.location.href = "index.html";
      } else {
        loginError.textContent = "Usuário e senha incorretos ou não cadastrados";
      }
    });
  
    btnClear.addEventListener("click", () => {
      loginEmail.value = "";
      loginPassword.value = "";
      loginError.textContent = "";
    });
  });
  