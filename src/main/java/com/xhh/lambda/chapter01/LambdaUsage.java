package com.xhh.lambda.chapter01;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaUsage {

    @FunctionalInterface
    public interface Addr{
        int add(int a, int b);
    }

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello");

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("World");
            }
        };

        processRun(r1);
        processRun(r2);
        
        // ---------------------------------

        List<Apple> apples = Arrays.asList(new Apple(10, "green"), new Apple(6, "red"));

        List<Apple> greenList = filterAppleByColor(apples, (apple -> apple.getColor().equals("green")));
        System.out.println(greenList);

        List<Apple> weightList = filterAppleByColor(apples, (apple -> apple.getWeight()<10));
        System.out.println(weightList);

        List<Apple> list = filterAppleByBiPredicate(apples, (w,s) -> w<10 && s.equals("green"));
        System.out.println(list);


        simpleTestConsumer(apples, a -> System.out.println(a));

        IntFunction<Integer> f = i -> i * 1_000;
        Integer result = f.apply(10);
        System.out.println(result);

        Apple yellow = testBiFunction("Yellow", 100, (s, w) -> new Apple(w, s));
        System.out.println(yellow);

        Supplier<String> s = String::new;
        System.out.println(s.get().getClass());
    }

    private static void processRun(Runnable R){
        R.run();
    }


    private static List<Apple> filterAppleByColor(List<Apple> source, Predicate<Apple> predicate){
        ArrayList<Apple> result = new ArrayList<>();
        for(Apple a : source){
            if(predicate.test(a)){
                result.add(a);
            }
        }
        return result;
    }

    private static List<Apple> filterAppleByWeight(List<Apple> source, LongPredicate predicate){
        ArrayList<Apple> result = new ArrayList<>();
        for(Apple a : source){
            if(predicate.test(a.getWeight())){
                result.add(a);
            }
        }
        return result;
    }

    private static List<Apple> filterAppleByBiPredicate(List<Apple> source, BiPredicate<Long, String> predicate){
        ArrayList<Apple> result = new ArrayList<>();
        for(Apple a : source){
            if(predicate.test(a.getWeight(),a.getColor())){
                result.add(a);
            }
        }
        return result;
    }


    private static List<Apple> simpleTestConsumer(List<Apple> source, Consumer<Apple> consumer){
        ArrayList<Apple> result = new ArrayList<>();
        for(Apple a : source){
            consumer.accept(a);
        }
        return result;
    }

    private static Apple testBiFunction(String color, Integer weight, BiFunction<String, Integer, Apple> f){
       return f.apply(color,weight);
    }


}
