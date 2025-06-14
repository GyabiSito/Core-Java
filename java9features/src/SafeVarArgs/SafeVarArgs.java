package SafeVarArgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarArgs {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        List<String> list2=new ArrayList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        list2.add("F");
        SafeVarArgs.safeVarArgs(list,list2);

    }
    @SafeVarargs
    public static void safeVarArgs(List<String>...l){ // List<String>[]
        String name = (String)l[0].get(0);
        System.out.println(name);
    }
}
