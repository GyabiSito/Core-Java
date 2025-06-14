package Varr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorstDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,5,15,2);
        List<Integer> newList=list.stream().filter(x -> x % 2 == 0).collect(Collectors.toUnmodifiableList());
        newList.add(123);
    }
}
