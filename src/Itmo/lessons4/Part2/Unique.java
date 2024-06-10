package Itmo.lessons4.Part2;

public class Unique {
    public static int unique(int[] arr) {
        int unique = 8765432;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (unique == 8765432) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    } else if (arr[i] != arr[j] && j == arr.length - 1 && count == 0) {
                        unique = arr[i];
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 5, 2, 3};
        int unique = unique(array);
        System.out.println("First unique number is: " + unique);
    }
}

