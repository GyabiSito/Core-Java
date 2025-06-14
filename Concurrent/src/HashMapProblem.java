import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapProblem extends Thread {
    static ConcurrentHashMap<String,String> list = new ConcurrentHashMap<String,String>();
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list.put("XD","asd");
    }
    public static void main(String[] args) throws InterruptedException {
//        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        HashMapProblem problem = new HashMapProblem();
        problem.start();
        list.put("A","asd");
        list.put("B","asd");
        list.put("C","asd");
        list.put("D","asd");

        Iterator<String> iterator = list.keySet().iterator();

        while (iterator.hasNext()) {
            Thread.sleep(2000);
            String letter=iterator.next();
            System.out.println(letter);
            if(letter.equals("A")){
                list.remove(letter);
            }
            System.out.println(list);
        }
    }
}
