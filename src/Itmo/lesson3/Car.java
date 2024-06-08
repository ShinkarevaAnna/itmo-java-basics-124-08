package Itmo.lesson3;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car(){

    }
    public Car(String color){
        this.color = color;
    }

    public Car(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void print(Car car){
        System.out.println(car);
    }

    public static void main(String[] args){
        Car car1 = new Car("green", 2.5 );
        Car car2 = new Car("white");
        car1.print(car1);
        car2.print(car2);
    }
}
