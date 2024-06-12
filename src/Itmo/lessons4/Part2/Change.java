package Itmo.lessons4.Part2;

import java.util.Arrays;

public class Change {
    public static void change(int[] arr) {
        int temporary = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temporary;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 8, 12};
        System.out.println("Array 1: " + Arrays.toString(array));
        change(array);
        System.out.println("Array 2: " + Arrays.toString(array));
    }
}


