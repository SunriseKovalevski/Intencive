package ru.aston.kovalevski_vv.task3.unique;

public class SearchUnique {
    public static Integer searchUnique(int[] arr) {
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = true;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return arr[i];
            }
        }
        return null;
    }
}
