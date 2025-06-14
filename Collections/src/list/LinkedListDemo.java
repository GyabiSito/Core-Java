package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        Object objects[]=new Object[1000000];

        for (int i=0;i<objects.length;i++){
            objects[i]=new Object();
        }
        List<Object> list=new ArrayList<Object>();
        long start=System.currentTimeMillis();
        for(Object object:objects){
            list.add(object);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
