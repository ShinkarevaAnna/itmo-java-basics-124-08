package Itmo.lessonThreads.TwoThreads.TwoTreadsConsumerProducer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        ThreadName threadName = new ThreadName();
        BlockingQueue<String> q = new LinkedBlockingQueue<>();
        Producer p = new Producer(q, threadName.getThread1());
        Producer p1 = new Producer(q, threadName.getThread2());
        Consumer c = new Consumer(q);
        new Thread(p).start();
        new Thread(p1).start();
        new Thread(c).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p.stopThread();
        p1.stopThread();
        c.stopThread();
    }
}
