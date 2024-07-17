package Itmo.lessonThreads.TwoThreads.TwoTreadsConsumerProducer;

import java.util.concurrent.*;

public class Consumer implements Runnable {
    private final BlockingQueue queue;
    private boolean isRunning = true;

    Consumer(BlockingQueue q) {
        this.queue = q;
    }

    public void stopThread() {
        isRunning = false;

        synchronized (this) {
            notify();
        }
    }

    public void run() {
        try {
            while (isRunning == true) {
                synchronized (this) {
                    Thread.sleep(50);
                    System.out.println("consumer take " + queue.take());
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}

