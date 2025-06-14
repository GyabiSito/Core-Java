package SortingObjects;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        String s1=o1.name.toLowerCase();
        String s2=o2.name.toLowerCase();

        return s1.compareTo(s2);
    }
}
