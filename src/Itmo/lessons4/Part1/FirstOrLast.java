package Itmo.lessons4.Part1;

public class FirstOrLast {
    public static boolean check(int[] arr) {
        return (arr[0] == 3) || (arr[arr.length - 1] == 3);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[8];
        fillArray(array);
        System.out.print("array = ");
        printArray(array);
        System.out.println(check(array));
    }
}
