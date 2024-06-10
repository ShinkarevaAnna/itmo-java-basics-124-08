package Itmo.lessons4.Part1;

public class Share {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr3 = new int[80];
        int[] arr5 = new int[80];
        int[] arr35 = new int[80];
        int j = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                arr3[j] = i;
                j++;
            }
        }
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                arr5[j] = i;
                j++;
            }
        }
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                arr35[j] = i;
                j++;
            }
        }

        System.out.println("Делится на 3: ");
        print(arr3);
        System.out.println("Делится на 5: ");
        print(arr5);
        System.out.println("Делится на 3 и на 5: ");
        print(arr35);
    }
}
