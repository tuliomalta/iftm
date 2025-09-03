package com.example.refatorando_solid_dip;

public class SmsService implements SendNotification{
    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Enviando SMS para " + user + ": " + message);
    }
}
