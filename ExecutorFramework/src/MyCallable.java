import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int num;
    MyCallable(Integer num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " " + num);
        int sum=0;
        for (int i = 0; i < num; i++) {
            sum+=i;
        }
        return sum;
    }
}
