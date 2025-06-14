package set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(5);
            list.add(num);
        }
        System.out.println(list);
        Set<Integer> set = new HashSet<Integer>(list);
        System.out.println("Set: " + set);
    }
}
