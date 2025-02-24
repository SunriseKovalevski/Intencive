package ru.aston.kovalevski_vv.task5.divide;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DivideStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Map<Boolean,List<Integer>> divided = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        Stream<Integer> evenStream = divided.get(true).stream();
        Stream<Integer> oddStream  = divided.get(false).stream();

        evenStream.forEach(System.out::println);
        oddStream.forEach(System.out::println);
    }
}
