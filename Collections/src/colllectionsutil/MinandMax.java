package colllectionsutil;

import java.util.Arrays;
import java.util.Collections;

public class MinandMax {
    public static void main(String[] args) {

        Integer[] numbers={1,2,3,5};
        Integer min= Collections.min(Arrays.asList(numbers));
        Integer max= Collections.max(Arrays.asList(numbers));
        System.out.println(min+" "+max);

    }
}
