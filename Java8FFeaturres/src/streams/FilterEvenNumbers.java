package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        List<Integer> l2=numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(l2);

        long count = numbers.stream().filter(x -> x % 2 == 0).count();
        System.out.println("Even numbers: " + count);

        Comparator<Integer> comp=(i1,i2) -> i1.compareTo(i2);

        List<Integer> l3 = numbers.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(l3);

        Integer max= numbers.stream().max(comp).get();
        System.out.println("Max: " + max);
        Integer min= numbers.stream().min(comp).get();
        System.out.println("Min: " + min);


        numbers.stream().forEach(i-> System.out.println(i));


    }
}
