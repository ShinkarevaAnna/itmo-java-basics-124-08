package Itmo.lessonThreads.TwoThreads.New;

public class ThreadsTwo extends Thread{
    private final Object lock;
    public ThreadsTwo(Object lock){
        this.lock = lock;
    }
    @Override
    public void run(){
        try {
            while (true) {
                System.out.println("Thread  " + Thread.currentThread().getName());
                synchronized (lock) {

                     lock.notify();
                    lock.wait();
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
