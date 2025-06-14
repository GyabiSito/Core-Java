package random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        System.out.println("X " + x);
        int y = rand.nextInt(100);
        System.out.println("Y " + y);
    }
}
