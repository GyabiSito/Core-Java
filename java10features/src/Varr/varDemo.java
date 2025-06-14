package Varr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

public class varDemo {
//    var sapo="asd";

    public static void main(String[] args) {
        var x = 10;
        var map=new HashMap<String, Integer>();
        //for (Map.Entry<String,List<String>> entry:map.entrySet());
        for (var entry: map.entrySet()) {
            var value=entry.getValue();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
//        var s=null;

        Consumer<Integer> l = (i) ->{
            var z=10;
            System.out.println(i);
        };

        var list=new ArrayList<Integer>();
        list.add(10);
    }
}
