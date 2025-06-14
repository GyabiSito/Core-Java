package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<User, String> map = new WeakHashMap<>();
        User u = new User();
        map.put(u, "ASD");
        System.out.println(map);
        u = null;

        System.gc();
        Thread.sleep(2000);
        System.out.println(map);
    }
}
