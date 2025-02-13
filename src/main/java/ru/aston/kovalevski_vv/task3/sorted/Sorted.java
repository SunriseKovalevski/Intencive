package ru.aston.kovalevski_vv.task3.sorted;

public class Sorted {
    public static void isSorted (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] <= arr[i + 1])){
                System.out.println("Please, try again");
            }
        }
        System.out.println("OK");
    }
}
