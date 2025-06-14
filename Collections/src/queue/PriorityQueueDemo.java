package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        System.out.println(queue.peek()); // NULL
//        System.out.println(queue.element());
        for (int i=0;i<10;i++){
            queue.offer(i);
        }
        System.out.println(queue); // 0,1,2...
        System.out.println(queue.poll()); //SACA Y RETORNA 0
        System.out.println(queue.remove()); // ELIMINA Y RETORNA 1
        System.out.println(queue); // 2,3....
    }
}
