package Itmo.lessons2;

public class Prisoner {
    private String name;
    private int prisonerNumber;
    private double imprisonmentPeriod;
    private double alreadyServedTime;
    private int cameraNumber;
    private int floor;
    private Skills skills;
    private boolean isAlive;

    public Prisoner(){

    }
    public Prisoner(String name, double imprisonmentPeriod){
        this.name = name;
        this.imprisonmentPeriod = imprisonmentPeriod;

    }
    public Prisoner(String name, int prisonerNumber, double imprisonmentPeriod, double alreadyServedTime,
                    int cameraNumber, int floor, Skills skills, boolean isAlive) {
        this.name = name;
        this.prisonerNumber = prisonerNumber;
        this.imprisonmentPeriod = imprisonmentPeriod;
        this.alreadyServedTime = alreadyServedTime;
        this.cameraNumber = cameraNumber;
        this.floor = floor;
        this.skills = skills;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrisonerNumber() {
        return prisonerNumber;
    }

    public void setPrisonerNumber(int prisonerNumber) {
        this.prisonerNumber = prisonerNumber;
    }

    public double getImprisonmentPeriod() {
        return imprisonmentPeriod;
    }

    public void setImprisonmentPeriod(double imprisonmentPeriod) {
        this.imprisonmentPeriod = imprisonmentPeriod;
    }

    public double getAlreadyServedTime() {
        return alreadyServedTime;
    }

    public void setAlreadyServedTime(double alreadyServedTime) {
        this.alreadyServedTime = alreadyServedTime;
    }

    public int getCameraNumber() {
        return cameraNumber;
    }

    public void setCameraNumber(int cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Prisoner{" +
                "name='" + name + '\'' +
                ", prisonerNumber=" + prisonerNumber +
                ", imprisonmentPeriod=" + imprisonmentPeriod +
                ", alreadyServedTime=" + alreadyServedTime +
                ", cameraNumber=" + cameraNumber +
                ", floor=" + floor +
                ", skills=" + skills +
                ", isAlive=" + isAlive +
                '}';
    }
}
