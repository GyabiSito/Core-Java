package comparator;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
