package Itmo.lessons6.task3;

public class Main {
    public static void main(String[] args) {
        Car truck = new Truck(23, "Iveco", 'r', 86, 8, 35);
        truck.outPut();
        Truck truck1 = new Truck(24,"MAN", 'g', 67, 6, 25);
        truck1.newWheels(10);
    }
}
