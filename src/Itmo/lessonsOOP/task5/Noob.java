package Itmo.lessonsOOP.task5;

public class Noob extends Programmist {
    protected String name;

    @Override
    public void input() {
        System.out.println("input name");
        name = sc.nextLine();
    }
}

