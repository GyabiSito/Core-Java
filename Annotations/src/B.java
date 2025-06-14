import java.util.ArrayList;
import java.util.List;

public class B {
    @SuppressWarnings({"deprecation","rawtypes"})
    public static void main(String[] args) {
        A a = new A();
        a.myMethod();
        System.out.println(a);


        List list=new ArrayList();
        System.out.println(list);
    }
}
