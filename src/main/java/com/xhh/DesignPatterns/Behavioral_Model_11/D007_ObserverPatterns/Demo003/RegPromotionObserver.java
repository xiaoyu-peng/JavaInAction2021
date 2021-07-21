package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo003;

import com.google.common.eventbus.Subscribe;
import com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo002.PromotionService;

public class RegPromotionObserver {

    private PromotionService promotionService; // 依赖注入

    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}