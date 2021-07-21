package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo003;

import com.google.common.eventbus.Subscribe;
import com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo002.NotificationService;

public class RegNotificationObserver {
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}