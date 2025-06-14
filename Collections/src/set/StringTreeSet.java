package set;

import comparator.SBComparator;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    public static void main(String[] args) {
        Set<StringBuffer> set = new TreeSet<>(new SBComparator());
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("def"));
        set.add(new StringBuffer("xyz"));

        for (StringBuffer s : set) {
            System.out.println(s);
        }


    }
}
