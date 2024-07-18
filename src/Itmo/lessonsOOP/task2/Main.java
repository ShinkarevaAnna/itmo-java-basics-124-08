package Itmo.lessonsOOP.task2;

public class Main {
    public static void main(String[] args) {
        Printable client = new Client("Luis", "Hamilton", "LemanBrothers");
        Printable bankWorker = new BankWorker("Max", "Verstappen", "ABNAMRO");
        client.printInfo();
        bankWorker.printInfo();

    }
}

