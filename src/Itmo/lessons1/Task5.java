package Itmo.lessons1;

import java.util.Scanner;

public class Task5 {
    public void outPutNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
