package Itmo.lessonArrays.Part1;

import java.util.Arrays;

public class Contains {
    public static boolean check(int[] arr, int key, int key1) {
        for (int element : arr) {
            if (element == key || element == key1) {
                return true;
            }
        }
        return false;
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[9];
        int key = 1;
        int key1 = 3;
        fillArray(array);
        System.out.println("array = " + Arrays.toString(array));
        System.out.println(check(array, key, key1));
    }
}