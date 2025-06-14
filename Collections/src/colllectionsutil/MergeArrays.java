package colllectionsutil;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        String a1[] = {"A", "B", "C", "D"};
        String a2[] = {"E", "F", "G", "H"};

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(a1));
        list.addAll(Arrays.asList(a2));
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
    }

}
