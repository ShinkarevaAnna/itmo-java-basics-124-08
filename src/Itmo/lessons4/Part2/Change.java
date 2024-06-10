package Itmo.lessons4.Part2;

import java.util.Arrays;

public class Change {
    public static void change(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr2[arr2.length - 1] = arr[i];
            } else if (i == arr.length - 1) {
                arr2[0] = arr[i];
            } else {
                arr2[i] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 8, 12};
        int[] arrayChange = new int[array.length];
        change(array, arrayChange);
        System.out.println("Array 1: " + Arrays.toString(array));
        System.out.println("Array 2: " + Arrays.toString(arrayChange));
    }
}


