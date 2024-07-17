package Itmo.lessonThreads.TwoThreads.TwoTreadsConsumerProducer;

import java.util.concurrent.*;

public class Producer implements Runnable {
    private final BlockingQueue<String> queue;
    private String nameThread;
    private static boolean isRunning = true;

    public Producer(BlockingQueue q, String name) {
        this.queue = q;
        this.nameThread = name;
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
                    queue.put(nameThread);
                    System.out.println("thread put " + nameThread);
                    Thread.sleep(40);

                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}


