package com.xhh.lambda.chapter02;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreams {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        List<String> namesByCollections = getNamesByStreams(menu);
        System.out.println(namesByCollections);

    }

    public static List<String> getNamesByStreams(List<Dish> menu) {
        List<String> collect = menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
        return collect;
    }

}
