package com.example.violando_solid_dip;

public class ServicoSms {
    void sendSms(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}
