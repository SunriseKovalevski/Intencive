package ru.aston.kovalevski_vv.task5.multiply2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.stream().map(x -> x*2).forEach(System.out::println);

    }
}
