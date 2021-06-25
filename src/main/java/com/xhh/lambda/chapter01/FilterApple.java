package com.xhh.lambda.chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApple {

    public static List<Apple> findGreenApples(List<Apple> apples){
        ArrayList<Apple> result = new ArrayList<>();
        for(Apple apple:apples){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 接口过滤
     */
    @FunctionalInterface
    public interface AppleFilter {
        boolean filter(Apple apple);
    }

    public static List<Apple> filterAppleByFilterInterface(List<Apple> apples, AppleFilter filter){
        ArrayList<Apple> result = new ArrayList<>();
        for(Apple apple:apples){
            if(filter.filter(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static class GreenApple implements AppleFilter{

        @Override
        public boolean filter(Apple apple) {
            if("green".equals(apple.getColor())){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple(10, "green"), new Apple(12, "red"));
        List<Apple> greenApples = findGreenApples(apples);
        System.out.println("For循环过滤："+ greenApples);

        List<Apple> apples1 = filterAppleByFilterInterface(apples, new GreenApple());
        System.out.println("实现接口过滤："+ apples1);

        List<Apple> apples2 = filterAppleByFilterInterface(apples, new AppleFilter() {
            @Override
            public boolean filter(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        System.out.println("匿名内部类过滤："+ apples2);

        List<Apple> apples3 = filterAppleByFilterInterface(apples, apple -> "green".equals(apple.getColor()));
        System.out.println("Lambda表达式过滤："+ apples3);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
