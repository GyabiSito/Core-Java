package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("C", 3);
        map.put("B", 2);
        map.put("D", 4);
        map.put("A", 1);

        map.keySet().forEach(System.out::println);
    }
}
