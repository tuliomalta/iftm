package org.example.aula_2701.services;

import org.example.aula_2701.domain.Login;
import org.example.aula_2701.repository.LoginRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private LoginRepository repository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public LoginService(LoginRepository repository) {
        this.repository = repository;
    }

    public boolean verificaLoginSenha(Login loginDigitado) {
        Login loginBanco = repository.verificarLogin(loginDigitado);
        if (loginBanco == null) {
            return false;
        }
        return encoder.matches(loginDigitado.getSenha(), loginBanco.getSenha());
    }

    public void salvar(Login login) {
        login.setSenha(encoder.encode(login.getSenha()));
        repository.salvar(login);
    }


}
