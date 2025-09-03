package com.example.violando_solid_dip;

public class ServicoNotificacao {
    private final ServicoEmail email;
    private final ServicoSms sms;

    public ServicoNotificacao(ServicoEmail email, ServicoSms sms) {
        this.email = email;
        this.sms = sms;
    }

    void notificarPorEmail(String mensagem, String destinatario) {
        email.sendEmail(mensagem, destinatario);
    }

    void notificarPorSms(String mensagem, String destinatario) {
        sms.sendSms(mensagem, destinatario);
    }

}
