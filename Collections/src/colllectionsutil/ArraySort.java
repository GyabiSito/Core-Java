package colllectionsutil;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] a={40,10,15,7, };

        System.out.println("BeforeSort");
        for (int eachElement:a){
            System.out.println(eachElement);
        }
        Arrays.sort(a);
        System.out.println("After");
        for (int eachElement:a){
            System.out.println(eachElement);
        }

        String[] s = {"V","A","Z","A"};

        Arrays.sort(s,new MyComparator());

        for (String eachElement:s){
            System.out.println(eachElement);
        }

        Arrays.asList(s).forEach(System.out::println);
    }
}
