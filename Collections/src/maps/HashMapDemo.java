package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("C", 3);
        map.put("D", 4);
        map.put("B", 2);
        map.put("A", 1);

        map.keySet().forEach(System.out::println);
    }
}
