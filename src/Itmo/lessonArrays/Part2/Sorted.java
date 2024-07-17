package Itmo.lessonArrays.Part2;

import java.util.Arrays;

public class Sorted {
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static boolean isSorted(int[] arr) {
        boolean isSort = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            } else if (arr[i] < arr[i + 1] && i == arr.length - 2) {
                isSort = true;
            }
        }
        return isSort;
    }

    public static void main(String[] args) {
        int[] array = new int[7];
        int[] hardArray = {2, 3, 4, 5, 6};
        fillArray(array);
        System.out.println("randomArray " + Arrays.toString(array));
        System.out.println("hardArray" + Arrays.toString(hardArray));
        System.out.println("randomArray = " + isSorted(array));
        System.out.println("hardArray= " + isSorted(hardArray));
    }
}


