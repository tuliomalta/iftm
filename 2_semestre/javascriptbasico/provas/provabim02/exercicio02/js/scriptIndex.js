function validarFormulario() {
    const nome = document.getElementById('nome').value.trim();
    const sobrenome = document.getElementById('sobrenome').value.trim();
    const senha = document.getElementById('senha').value.trim();
    const sexo = document.getElementById('sexo').value;

    if (nome === "" || sobrenome === "") {
        alert("Favor informar o NOME e SOBRENOME.");
        return;
    }

    const padraoSenha = /^(REC|RECUPERAÇÃO)-Jsbásico:\(1\)[2-5]{2}$/;
    if (!padraoSenha.test(senha)) {
        alert("Senha inválida. O formato deve ser: REC-Jsbásico:(1)23");
        return;
    }

    if (sexo === "masculino") {
        window.location.href = "masculino.html";
    } else {
        window.location.href = "feminino.html";
    }

    localStorage.setItem("nomeCompleto", `${nome} ${sobrenome}`);
}