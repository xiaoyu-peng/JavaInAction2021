package com.xhh.lambda;

import com.xhh.lambda.chapter01.Apple;
import com.xhh.lambda.chapter02.Dish;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author PengHui
 */
public class CollectorsInAction {

    private final static List<Dish> menu = Arrays.asList(
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

    public static void main(String[] args) {

        //1. 平均值
        Optional.ofNullable(menu.stream().collect(Collectors.averagingDouble(Dish::getCalories))).ifPresent(System.out::println);
        Optional.ofNullable(menu.stream().collect(Collectors.averagingInt(Dish::getCalories))).ifPresent(System.out::println);
        Optional.ofNullable(menu.stream().collect(Collectors.averagingLong(Dish::getCalories))).ifPresent(System.out::println);

        //2. CollectingAndThen
        Optional.ofNullable(
                menu.stream().collect(
                        Collectors.collectingAndThen(Collectors.averagingInt(Dish::getCalories), a -> "The Average Calories Is : " + a)
                )
        ).ifPresent(System.out::println);

        //3. list
        List<Dish> collect = menu.stream().filter(dish -> dish.getType().equals(Dish.Type.MEAT)).collect(Collectors.toList());
        collect.add(new Dish("ceshi", false, 100, Dish.Type.OTHER));
        Optional.ofNullable(collect).ifPresent(System.out::println);

        //4. list 不能被修改
        List<Dish> unModifiableCollect = menu.stream().filter(dish -> dish.getType().equals(Dish.Type.MEAT)).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        // 新增元素会抛异常：Exception in thread "main" java.lang.UnsupportedOperationException
        //unModifiableCollect.add(new Dish("ceshi", false, 100, Dish.Type.OTHER));
        Optional.ofNullable(unModifiableCollect).ifPresent(System.out::println);

        //5. counting
        Optional.of(menu.stream().collect(Collectors.counting())).ifPresent(System.out::println);

        //6. groupingBy
        Optional.of(menu.stream().collect(Collectors.groupingBy(Dish::getType))).ifPresent(System.out::println);
        Optional.of(menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.averagingInt(Dish::getCalories)))).ifPresent(System.out::println);
        Optional.of(menu.stream().collect(Collectors.groupingBy(Dish::getType, TreeMap::new, Collectors.averagingInt(Dish::getCalories)))).ifPresent(System.out::println);
        System.out.println("===================");
        Optional.of(menu.stream().collect(Collectors.groupingByConcurrent(Dish::getType, Collectors.averagingInt(Dish::getCalories)))).ifPresent(System.out::println);


        //7. summarizingInt
        IntSummaryStatistics result = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        Optional.ofNullable(result).ifPresent(System.out::println);


        //8. join
        Optional.of(menu.stream().map(Dish::getName).collect(Collectors.joining())).ifPresent(System.out::println);
        Optional.of(menu.stream().map(Dish::getName).collect(Collectors.joining(","))).ifPresent(System.out::println);
        Optional.of(menu.stream().map(Dish::getName).collect(Collectors.joining(",", "Names[", "]"))).ifPresent(System.out::println);
        Optional.of(
                menu.stream().collect(
                        Collectors.mapping(Dish::getName, Collectors.joining(",", "Test Mapping ===>", ""))
                )
        ).ifPresent(System.out::println);

        // MAX
        menu.stream().collect(Collectors.maxBy(Comparator.comparing(Dish::getCalories))).ifPresent(System.out::println);


        // partitionBy
        Map<Boolean, Double> collect1 = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.averagingInt(Dish::getCalories)));
        Optional.of(collect1).ifPresent(System.out::println);

        // reducing
        Optional<Dish> collect2 = menu.stream().collect(
                Collectors.reducing(
                        BinaryOperator.maxBy(
                                Comparator.comparing(Dish::getCalories)
                        )
                )
        );
        Optional.of(collect2).ifPresent(System.out::println);

        Integer sumCalorie = menu.stream().map(Dish::getCalories).collect(Collectors.reducing(0, (d1, d2) -> d1 + d2));
        System.out.println(sumCalorie);
    }
}
