package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowercase {
    public static void main(String[] args) {

        List<String> l1=new ArrayList<String>();
        l1.add("SAPO");
        l1.add("GYM");

        List<String> l2=l1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println(l2);

    }
}
