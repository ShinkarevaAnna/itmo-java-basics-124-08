package Itmo.lessons4.Part1;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();
        boolean result = false;
        if ((num1 < num2) && (num2 < num3)) {
            result = true;
        }
        System.out.println("Результат:" + result);
    }
}
