package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo002;

public class RegPromotionObserver implements RegObserver {
    // 依赖注入
    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}