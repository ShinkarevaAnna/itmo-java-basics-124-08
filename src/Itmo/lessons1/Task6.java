package Itmo.lessons1;

import java.util.Scanner;

public class Task6 {
    public void condition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int b = scanner.nextInt();

       if (b%2 == 0 && b>100) {
           System.out.println("Выход за пределы диапазона");
       } else if (b%2 == 0){
            System.out.println("Четное");
        } else {
           System.out.println("Нечетное");
       }
    }
}
