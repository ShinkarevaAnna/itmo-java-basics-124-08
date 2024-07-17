package Itmo.lessonThreads.OneHundredThreads;

public class HundredIncrementsThreads {
    Counter counter = new Counter();

    public synchronized void incrementTreads() throws InterruptedException {
        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("count " + counter.getCount());
    }
}