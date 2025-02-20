package ru.aston.kovalevski_vv.task5.sum_of_elements;

import java.util.ArrayList;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = list.stream().reduce(0, (element1, element2) -> element1 + element2);

        System.out.println(sum);
    }
}
