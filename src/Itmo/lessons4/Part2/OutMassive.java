package Itmo.lessons4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class OutMassive {

    public static void fillMassive(int[]arr, int i){
        Scanner sc = new Scanner(System.in);
        if (i > arr.length-1) {
            System.out.println("Array index out of bounds");
        } else {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array Length:");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Input numbers of array: ");
        int count = 0;
        for( int i = 0; i< array.length; i++){
            fillMassive(array, count);
            count++;
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
