package Itmo.lessonThreads.OneHundredThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HundredIncrementsThreads hundredIncrementsThreads = new HundredIncrementsThreads();
        hundredIncrementsThreads.incrementTreads();
    }
}


