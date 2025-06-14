package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSet {
    public static void main(String[] args) {
        Random rand = new Random();

//        HashSet<Integer> set = new HashSet<Integer>();
//        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            int number=rand.nextInt(100);
            set.add(number);
            System.out.println(number);
        }
        System.out.println("HashSet: " + set);


    }
}
