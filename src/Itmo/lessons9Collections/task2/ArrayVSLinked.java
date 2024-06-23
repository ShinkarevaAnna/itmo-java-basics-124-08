package Itmo.lessons9Collections.task2;

import java.util.*;

public class ArrayVSLinked {
    public static double randomElementSearch(List list) {
        double time = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            list.get((int) (Math.random() * 999999));
        }
        return System.currentTimeMillis() - time;
    }

    public static double fillList(Collection collection) {
        double time = System.currentTimeMillis();
        while (collection.size() <= 1000000) {
            collection.add(5);
        }
        return System.currentTimeMillis() - time;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList();
        LinkedList<Integer> linked = new LinkedList<>();
        double fillTimeArray = fillList(array);
        double fillTimeLinked = fillList(linked);
        double randomIndexTimeArray = randomElementSearch(array);
        double randomIndexTimeLinked = randomElementSearch(linked);
        System.out.println("Fill time array " + fillTimeArray + ". Fill time linked " + fillTimeLinked);
        System.out.println("Time random choice array is " + randomIndexTimeArray + ", linked is " + randomIndexTimeLinked);
    }
}
