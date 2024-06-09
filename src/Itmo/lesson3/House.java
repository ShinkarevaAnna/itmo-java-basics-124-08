package Itmo.lesson3;

import java.time.LocalDate;

public class House {
    private int numberFloors;
    private int yearConstruction;
    private String name;

    public int getNumberFloors(){
        return numberFloors;
    }
    public int getYearConstruction(){
        return yearConstruction;
    }
    public String getName(){
        return name;
    }
    public void setNumberFloors(int numberFloors){
        this.numberFloors = numberFloors;
    }
    public void setYearConstruction(int yearConstruction){
        this.yearConstruction = yearConstruction;
    }
    public void setName(String name){
        this. name = name;
    }
    public int ageHouse(int yearConstruction){
        this.yearConstruction = yearConstruction;
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int ageHouse = year - yearConstruction;
        return ageHouse;
    }
    @Override
    public String toString(){
        return " House{ name= '" + name + '\'' +
                ", numberFloors= " + numberFloors +
                ", yearConstruction= " + yearConstruction +
                '}';
    }
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.setName("Rancho");
        house1.setNumberFloors(3);
        house1.setYearConstruction(1984);
        house2.setName("EmpireStateBuilding");
        house2.setYearConstruction(1931);
        house2.setNumberFloors(102);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println("Age house1= " + house1.ageHouse(house1.getYearConstruction()));
        System.out.println("Age house2= " + house2.ageHouse(house2.getYearConstruction()));

    }
}
