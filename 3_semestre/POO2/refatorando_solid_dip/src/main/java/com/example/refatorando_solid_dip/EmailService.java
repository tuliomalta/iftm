package com.example.refatorando_solid_dip;

public class EmailService implements SendNotification{
    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Enviando e-mail para " + user + ": " + message);
    }
}
