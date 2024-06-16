package Itmo.lessons6.task1;

public class Main {
    public static void main(String[] args) {
        Human client = new Client("Andrew", "Kostin", "VTB");
        Human bankWorker = new BankWorker("Herman", "Gref", "SberBank");
        System.out.println(client);
        System.out.println(bankWorker);
    }
}
