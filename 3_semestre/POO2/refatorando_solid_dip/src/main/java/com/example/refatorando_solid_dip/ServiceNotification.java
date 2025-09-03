package com.example.refatorando_solid_dip;

public class ServiceNotification implements SendNotification {
    private final SendNotification sendNotification;

    public ServiceNotification(SendNotification sendNotification) {
        this.sendNotification = sendNotification;
    }

    @Override
    public void sendNotification(String message, String user) {
        sendNotification.sendNotification(message, user);
    }

}
