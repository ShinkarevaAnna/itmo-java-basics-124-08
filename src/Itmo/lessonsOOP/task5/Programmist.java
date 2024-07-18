package Itmo.lessonsOOP.task5;

import java.util.Scanner;

public class Programmist {
    protected int age;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("input age in years");
        age = sc.nextInt();
    }
}
