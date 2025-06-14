package SortingObjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>(new EmployeeNameComparator());
        employees.add(new Employee(100, "E1"));
        employees.add(new Employee(101, "E2"));
        employees.add(new Employee(102, "E3"));
        employees.add(new Employee(103, "E4"));
        employees.add(new Employee(100, "E5"));

        for (Employee employee : employees) {
            System.out.println(employee.id + " " + employee.name);
        }
    }
}
