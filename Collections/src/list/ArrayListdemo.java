package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<String>();
        list.add("A");
        list.add(new String("B"));
        list.add('D');
        list.add(5);
        list.add(5.51);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
