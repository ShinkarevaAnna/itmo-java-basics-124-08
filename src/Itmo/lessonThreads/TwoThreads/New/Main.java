package Itmo.lessonThreads.TwoThreads.New;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        ThreadsTwo threadsTwo1 = new ThreadsTwo(object);
        ThreadsTwo threadsTwo2 = new ThreadsTwo(object);
        threadsTwo1.start();
        threadsTwo2.start();


    }
}
