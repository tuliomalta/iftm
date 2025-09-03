package com.example.violando_solid_dip;


public class Main {
    public static void main(String[] args) {
        com.example.violando_solid_dip.ServicoNotificacao servicoNotificacao =
                new ServicoNotificacao(new ServicoEmail(), new ServicoSms());
        servicoNotificacao.notificarPorSms("julio", "+55 11 99999-9999");
        servicoNotificacao.notificarPorEmail("Testando a mensagem", "test@gmail.com");
    }
}