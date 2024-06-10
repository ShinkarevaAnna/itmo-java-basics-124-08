package Itmo.lessons4.Part1;

public class IsFirstOrLast {
    public static boolean check(int[] arr) {
        boolean check = false;
        if (arr[0] == 3 || arr[arr.length - 1] == 3) {
            check = true;
        }
        return check;
    }

    public static void fillMassive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[8];
        fillMassive(array);
        System.out.print("array = ");
        print(array);
        System.out.println(check(array));
    }
}
