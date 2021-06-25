package com.xhh.lambda.chapter01;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author PengHui
 */
public class LambdaExpression {

    public static void main(String[] args) {

        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getColor().compareTo(a2.getColor());
            }
        };
        List<Apple> list = Collections.emptyList();
        list.sort(byColor);

        Comparator<Apple> byColor2 = (a1, a2) -> a1.getColor().compareTo(a2.getColor());
        List<Apple> list2 = Collections.emptyList();
        list2.sort(byColor2);

        // lambda语法表达式
        Function<Apple, Boolean> function =  (Apple a) -> a.getColor().equals("green");

        Predicate<Apple> green = (Apple a) -> a.getColor().equals("green");

    }
}
