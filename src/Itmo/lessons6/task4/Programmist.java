package Itmo.lessons6.task4;

import java.util.Scanner;

public class Programmist {
    protected int codingTime;

    public int inputCodingTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input coding time in years");
        codingTime = sc.nextInt();
        return codingTime;
    }
}

