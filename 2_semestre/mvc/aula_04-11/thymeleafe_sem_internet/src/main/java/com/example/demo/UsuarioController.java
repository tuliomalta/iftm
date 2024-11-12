package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/")
    public String init(Model model) {
        String nomeUsuario = "Carlos Eduardo";
        Usuario usuario = new Usuario();
        usuario.setNome(nomeUsuario);
        model.addAttribute("nomeUsuario", nomeUsuario);
        model.addAttribute("usuario", usuario);
        return "usuarioView";
    }
}
