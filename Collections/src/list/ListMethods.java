package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.add(2, 100);
        System.out.println(list);
        list.set(3, 300);
        System.out.println(list);

        List<Integer> list2=new ArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        if(list.contains(111)){
            System.out.println("List is contains 111");
        }else{
            System.out.println("List is not contains 111");
        }

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.remove(2);
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(list);


    }
}
