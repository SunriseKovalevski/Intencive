package ru.aston.kovalevski_vv.task3.change;

public class Changed {
    public int[] changeFirstLast(int[] arr) {
        int temp;
        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }
}
