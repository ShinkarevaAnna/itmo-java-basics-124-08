package Itmo.lessons4.Part2;

public class Unique {
    public static Integer firstUniqueArrayValue(int[] arr) {
        Integer unique = null;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    } else if (arr[i] != arr[j] && j == arr.length - 1 && count == 0) {
                        unique = arr[i];
                        break;
                    } else if (count != 0 && j == arr.length-1 && i == arr.length-1){
                        System.out.println("no unique number");
                    }
                }
            if(unique != null){
                break;
            }
            }
        return unique;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 5, 2, 3};
        Integer unique = firstUniqueArrayValue(array);
        System.out.println("First unique number is: " + unique);
    }
}

