package Itmo.lessonThreads.TenThreads;

public class TenTreads {

    public void printTenTread() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new NumberThread(i));
            System.out.println("Status thread " + i + " before start: " + thread.getState());
            thread.start();
            System.out.println("Status thread " + i + " after start: " + thread.getState());
        }
    }

    static class NumberThread implements Runnable {
        private int numberThread;

        public NumberThread(int numberThread) {
            this.numberThread = numberThread;
        }

        public int getNumberThread() {
            return numberThread;
        }

        @Override
        public void run() {
            System.out.println("Thread " + getNumberThread() + " start");
            for (int i = 0; i <= 100; i++) {
                System.out.println("I'm thread " + getNumberThread() + ", print number " + i);
            }
            System.out.println("Thread " + getNumberThread() + " finish");
        }
    }
}
