package Itmo.lessons6.task3;

public class Truck extends Car {
    protected int quantityOfWheels;
    protected int maxWeight;

    public Truck(int weight, String model, char color, float speed, int quantityOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.quantityOfWheels = quantityOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int quantityOfWheels) {
        System.out.println(this.quantityOfWheels = quantityOfWheels);
    }
}


