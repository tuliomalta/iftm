package com.example.refatorando_solid_dip;

public class Main {
    public static void main(String[] args) {
        ServiceNotification emailService = new ServiceNotification(new EmailService());
        emailService.sendNotification("Olá, Augusto!", "augusto");
        ServiceNotification smsService = new ServiceNotification(new SmsService());
        smsService.sendNotification("Olá, Augusto!", "augusto");
    }
}