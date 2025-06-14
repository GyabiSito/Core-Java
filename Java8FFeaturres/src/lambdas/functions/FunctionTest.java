package lambdas.functions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply("hello"));
        System.out.println(f.apply("world"));
    }
}
