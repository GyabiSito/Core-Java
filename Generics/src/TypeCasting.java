import java.util.ArrayList;
import java.util.List;

public class TypeCasting {
    public static void main(String[] args) {

        String[] s = new String[10];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "123";
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("World");
        l.add("123");
        String name= (String) l.get(0);
        String name2= (String) l.get(1);
        String name3= (String) l.get(2);

    }
}
