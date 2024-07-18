package Itmo.lessonArrays.Part1;

import java.util.Scanner;

public class Sum {
    public static boolean sum(int num1, int num2, int num3) {
        int sum = num1 + num2;
        return sum == num3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();
        System.out.println("Результат:" + sum(num1, num2, num3));
    }
}

