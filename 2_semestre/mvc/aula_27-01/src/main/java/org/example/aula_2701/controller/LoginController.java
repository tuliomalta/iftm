package org.example.aula_2701.controller;

import org.example.aula_2701.domain.Login;
import org.example.aula_2701.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String telaInicial(Model model) {
        return "login/login";
    }

    @GetMapping("/login/telaNovoUsuario")
    public String novo(Model model) {
        return "login/cadastro";
    }

    @PostMapping("/login/entrar")
    public String logar(Login loginDigitado, Model model) {
        if (service.verificaLoginSenha(loginDigitado)) {
            model.addAttribute("mensagem", "Usuário autenticado com sucesso");
        } else {
            model.addAttribute("mensagem", "Usuário ou Senha inválidos");
        }

        return "login/login";
    }

    @PostMapping("/login/novoUsuario")
    public String novoUsuario(Login loginDigitado, Model model) {
        service.salvar(loginDigitado);
        model.addAttribute("mensagem", "Usuário " + loginDigitado.getUsuario() + " cadastrado com sucesso");
        return "login/login";
    }

}
