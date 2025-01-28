package org.example.aula_2701.repository;

import java.util.List;

import org.example.aula_2701.domain.Login;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {
    private JdbcTemplate db;

    public LoginRepository(JdbcTemplate db) {
        this.db = db;
    }

    public Login verificarLogin(Login loginDigitado) {
        String sql = "select usuario,senha from tb_login where usuario = ?";
        List<Login> logins = db.query(sql,
                new BeanPropertyRowMapper<>(Login.class),
                loginDigitado.getUsuario());
        if (!logins.isEmpty()) {
            return logins.get(0);
        }
        return null;
    }

    public void salvar(Login login) {
        String sql = "insert into tb_login(usuario,senha) values(?,?)";
        db.update(sql, login.getUsuario(), login.getSenha());
    }
}