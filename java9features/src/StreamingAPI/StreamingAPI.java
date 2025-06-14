package StreamingAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, null, 15, 23, 30, 32, 35, null);
//        System.out.println(list.stream().filter(x -> x % 5 == 0).collect(Collectors.toList()));
        System.out.println(list.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));
        System.out.println(list.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));
    }
}
