package Itmo.lessonIntroduction;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();

        task1.wordsOut();
        System.out.println(task2.expressionResult1());
        System.out.println(task2.expressionResult2());
        task3.count();

        task4.multiplication();
        task5.outPutNumbers();
        task6.condition();
    }
}
