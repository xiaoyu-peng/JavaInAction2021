package com.xhh.lambda;

import com.xhh.lambda.chapter01.Apple;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorIntroduce {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple(10, "green"),
                new Apple(12, "red"),
                new Apple(21, "red"),
                new Apple(92, "green"),
                new Apple(19, "green")
        );

        List<Apple> greenList = list.stream().filter(apple -> apple.getColor().equals("green")).collect(Collectors.toList());

        // 1
        Optional.ofNullable(greenList).ifPresent(System.out::println);

        // 2
        Optional.ofNullable(groupByNormal(greenList)).ifPresent(System.out::println);

        // 3
        Optional.ofNullable(groupByFunction(greenList)).ifPresent(System.out::println);

        // 4
        Optional.ofNullable(groupByCollector(greenList)).ifPresent(System.out::println);

    }


    /**
     * 普通方法
     *
     * @param apples
     * @return
     */
    public static Map<String, List<Apple>> groupByNormal(List<Apple> apples) {
        Map<String, List<Apple>> map = new HashMap<>();
        for (Apple apple : apples) {
            List<Apple> list = map.get(apple.getColor());
            if (null == list) {
                list = new ArrayList<>();
                map.put(apple.getColor(), list);
            }
            list.add(apple);
        }
        return map;
    }

    /**
     * Function方法
     *
     * @param apples
     * @return
     */
    public static Map<String, List<Apple>> groupByFunction(List<Apple> apples) {
        Map<String, List<Apple>> map = new HashMap<>();
        apples.stream().forEach(apple -> {
            List<Apple> colorList = Optional.ofNullable(map.get(apple.getColor())).orElseGet(() -> {
                List<Apple> list = new ArrayList<>();
                map.put(apple.getColor(), list);
                return list;
            });
            colorList.add(apple);
        });
        return map;
    }

    /**
     * Collector方法
     * @param apples
     * @return
     */
    public static Map<String, List<Apple>> groupByCollector(List<Apple> apples) {
        return apples.stream().collect(Collectors.groupingBy(Apple::getColor));
    }

}
