package Navigable;

import java.util.Arrays;
import java.util.TreeSet;

public class NavigableTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        System.out.println(treeSet);

        System.out.println(treeSet.ceiling(4));
        System.out.println(treeSet.higher(2));
        System.out.println(treeSet.floor(3));
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet);


        String[] letters = {"a", "b", "c", "d"};


    }
}
