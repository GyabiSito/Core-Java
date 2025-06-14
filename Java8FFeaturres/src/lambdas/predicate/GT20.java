package lambdas.predicate;

import java.util.function.Predicate;

public class GT20 {
    public static void main(String[] args) {
        Predicate<Integer> p = i->(i>20);
        System.out.println(p.test(19));
        System.out.println(p.test(20));
        System.out.println(p.test(21));
    }
}
