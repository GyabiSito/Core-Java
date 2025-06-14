import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class random {
    public static void main(String[] args) {
        RandomGenerator rg = RandomGeneratorFactory.getDefault().create();
        System.out.println(rg.getClass());
        int i=0;
        while (i < 10) {
            int num=rg.nextInt(20);
            System.out.println(num);
            i++;
        }
    }
}
