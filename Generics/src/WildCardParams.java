import java.util.ArrayList;

public class WildCardParams {
    public static void main(String[] args) {
        WildCardParams w = new WildCardParams();
        w.myMethod(new ArrayList<A>());
    }
    public void myMethod(ArrayList<? super B> list) {
        list.add(null);
        list.add(new B());
    }
}
