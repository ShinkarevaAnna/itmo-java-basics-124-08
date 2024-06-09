package Itmo.lesson3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree(){
        System.out.println("«Пустой конструктор без параметров сработал»");
    }
    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Tree(int age, Boolean isAlive, String name){
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Tree{ 'name= " + name + '\'' +
                ", age= " + age +
                ", isAlive= " + isAlive +
                '}';
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree(95, "Peter'sTree");
        Tree tree2 = new Tree(190, true, "Sequoia");
        System.out.println(tree2);
        System.out.println(tree1);
        System.out.println(tree);

    }
}
