package Itmo.lessons6.task2;

public class Client extends Human {
    protected String bankName;
    public Client(String name, String surname) {
        super(name, surname);
    }
    public Client(String name, String surname, String bankName){
        super(name,surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Client{ name ='" + getName() + "\'" +
                ", surname = '" + getSurname() + "\'" +
                ", bankName = '" + bankName + "\'" + "}";
    }


    @Override
    public void printInfo() {
        System.out.println(" Client name = " + getName() + ", surname = " + getSurname() + ", bankName = " + bankName);
    }
}