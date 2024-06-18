package Itmo.lessons7;

public class Plane {
    private final double weightPlane = 680;
    public class Wind {
        double weightWind; //проверка работы функционала из разных полей класса

        public Wind(double weight) {
            this.weightWind = weight;
        }

        public double getWeightWind() {
            return weightWind;
        }

        public void setWeightWind(double weightWind) {
            this.weightWind = weightWind;
        }
        public double comparisonWeight(double weight1, double weight2){        //проверка работы функционала из разных полей класса
            return weight1/weight2;
        }
    }

    public void print(Plane.Wind plane) {
        System.out.println("Weight of wing " + plane.getWeightWind());
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane.Wind windRight = plane.new Wind(45);
        plane.print(windRight);
        windRight.setWeightWind(46);//немного развлекаюсь переустановкой значений
        Plane.Wind windLeft = plane.new Wind(66);
        plane.print(windLeft);
        windLeft.setWeightWind(67);//немного развлекаюсь переустановкой значений
        plane.print(windRight);
        plane.print(windLeft);
        //проверка работы функционала из разных полей класса
        System.out.println("plain weigh like " + windRight.comparisonWeight(plane.weightPlane, windRight.weightWind) + " right wings");
        System.out.println("plain weigh like " + windLeft.comparisonWeight(plane.weightPlane, windLeft.weightWind) + " left wings");
    }
}
