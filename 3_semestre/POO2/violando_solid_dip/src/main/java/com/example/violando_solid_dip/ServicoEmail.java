package com.example.violando_solid_dip;

public class ServicoEmail {
    void sendEmail(String mensagem, String destinatario) {
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}
