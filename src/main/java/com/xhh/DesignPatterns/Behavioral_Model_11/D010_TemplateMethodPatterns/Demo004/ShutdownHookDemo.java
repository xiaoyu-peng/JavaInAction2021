package com.xhh.DesignPatterns.Behavioral_Model_11.D010_TemplateMethodPatterns.Demo004;

/**
 * Callback 更侧重语法机制的描述，Hook 更加侧重应用场景的描述。
 */
public class ShutdownHookDemo {

    private static class ShutdownHook extends Thread {
        @Override
        public void run() {
            System.out.println("I am called during shutting down.");
        }
    }

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }

}