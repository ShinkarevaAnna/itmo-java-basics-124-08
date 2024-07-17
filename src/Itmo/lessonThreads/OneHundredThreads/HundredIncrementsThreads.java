package Itmo.lessonThreads.OneHundredThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HundredIncrementsThreads {
    Counter counter = new Counter();

    public synchronized void incrementTreads() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
        }
        executorService.shutdown();

        executorService.awaitTermination(10, TimeUnit.MICROSECONDS);

        System.out.println("count " + counter.getCount());
    }
}

