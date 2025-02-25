package ru.aston.kovalevski_vv.task5.random_pairs;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomPairs {
    public static void main(String[] args) {

        int[] numbers = new Random().ints(20, 1, 10).toArray(); // 20 чисел от 1 до 10

        Map<Integer, Long> numberCounts = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ));

        long pairOrDuplicateCount = numberCounts.values()
                .stream()
                .filter(count -> count >= 2)
                .count();

        System.out.println("Количество парных или одинаковых чисел: " + pairOrDuplicateCount);

        System.out.println("Числа, которые встречаются два или более раз:");
                numberCounts.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() >= 2)
                        .forEach(entry -> System.out.println(entry.getKey() + " (встречается " + entry.getValue() + " раз)"));
    }
}
