package colllectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");

        System.out.println(list);
        Collections.sort(list,new MyComparator());
        System.out.println(list );

        int b=Collections.binarySearch(list,"A");
        System.out.println("Index of A is "+b);
    }
}
