package Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println("isPresent : " + empty.isPresent());
        Optional<String> optional = Optional.of("Hello");
        System.out.println("isPresent : " + optional.isPresent());
        System.out.println("Val " + optional.get());
        if (empty.isPresent()) {
            System.out.println(empty.get());
        }
        System.out.println(optional.filter((s) -> s.equals("Hello")));
        System.out.println(optional.filter((s) -> s.equals("ello")));

        System.out.println(optional.orElse("Default value   "));
        System.out.println(empty.orElse("Default value   "));

        optional.ifPresent(System.out::println);
        empty.ifPresent(System.out::println);
    }
}
