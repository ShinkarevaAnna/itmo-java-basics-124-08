package Itmo.lessons4.Part2;

import java.util.Arrays;

public class Sort {
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void sort(int[] arr, int from, int to) {
        if (arr.length == 0) {
            return;
        }
        if (from >= to) {
            return;
        } else {
            int mid = (from + to) / 2;
            sort(arr, from, mid);
            sort(arr, mid + 1, to);
            mergeArray(arr, from, mid + 1, to);
        }
    }

    public static void mergeArray(int[] array, int low, int high, int to) {
        int j = 0;
        int from = low;
        int middle = high - 1;
        int length = to - from + 1;
        int[] temporary = new int[length];

        while (low <= middle && high <= to) {
            if (array[low] < array[high]) {
                temporary[j++] = array[low++];
            } else {
                temporary[j++] = array[high++];
            }
        }
        while (low <= middle) {
            temporary[j++] = array[low++];
        }

        while (high <= to) {
            temporary[j++] = array[high++];
        }
        for (j = 0; j < length; j++) {
            array[from + j] = temporary[j];
        }

    }

    public static void main(String[] args) {
        int[] array = new int[9];
        fillArray(array);
        System.out.println("Array before sort: " + Arrays.toString(array));
        sort(array, 0, array.length - 1);
        System.out.println("Array after sort: " + Arrays.toString(array));
        int[] ar = {};
        int[] arr = {1};
        sort(ar, 0, ar.length - 1);
        sort(arr, 0, arr.length - 1);
        System.out.println("Array null: " + Arrays.toString(ar));
        System.out.println("Array.length = 1: " + Arrays.toString(arr));
    }
}