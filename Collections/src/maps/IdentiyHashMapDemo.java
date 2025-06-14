package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentiyHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> identiyHashMap = new IdentityHashMap<>();
        Integer id1 = 1;
        Integer id2 = 1;
        Integer id3 = 3;

        identiyHashMap.put(id1,"Bara");
        identiyHashMap.put(id2,"Asd");

        System.out.println(identiyHashMap);
    }
}
