package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo002;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}