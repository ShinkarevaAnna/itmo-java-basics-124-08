package Itmo.lessonCollections.task1;

import java.util.*;

public class Duplicates {

    public static <T> Set<T> withoutDuplications(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(8);
        list.add(8);
        Duplicates duplicates = new Duplicates();
        System.out.println(duplicates.withoutDuplications(list));
    }
}