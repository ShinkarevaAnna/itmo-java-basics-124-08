package Itmo.lessonsOOP.task2;

public class BankWorker extends Human {
    private String bankName;

    public BankWorker(String name, String surname) {
        super(name, surname);
    }

    public BankWorker(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "BankWorker{ name ='" + getName() + "\'" +
                ", surname = '" + getSurname() + "\'" +
                ", bankName = '" + bankName + "\'" + "}";
    }

    @Override
    public void printInfo() {
        System.out.println(" BankWorker name = " + getName() + ", surname = " + getSurname() + ", bankName = " + bankName);
    }
}



