package Itmo.lessonThreads.TwoThreads.TwoTreads.OtherWay;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Object lock = new Object();
        executorService.execute(() -> {
            synchronized (lock) {
                while (true) {
                    System.out.println("Thread 1: " + Thread.currentThread().getName());
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notify();
                }
            }
        });

        executorService.execute(() -> {
            synchronized (lock) {
                while (true) {
                    try {
                        lock.notify();
                        System.out.println("Thread 2: " + Thread.currentThread().getName());
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
