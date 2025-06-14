import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem  extends Thread{
    static CopyOnWriteArrayList list = new CopyOnWriteArrayList();
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list.add("XD");
    }
    public static void main(String[] args) throws InterruptedException {
//        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        ArrayListProblem problem = new ArrayListProblem();
        problem.start();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> iterator = list.iterator();

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
