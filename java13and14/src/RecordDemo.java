public class RecordDemo {
    record Employee(String name, int salary) {}

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 20000);
        Employee emp2 = new Employee("Jane", 30000);
        Employee emp3 = new Employee("Bob", 40000);
        System.out.println(emp1.toString() + " " + emp2.toString() + " " + emp3.toString());
        System.out.println(emp1.name() + " " + emp2.name() + " " + emp3.name());
        System.out.println(emp1.hashCode() + " " + emp2.hashCode());
        System.out.println(emp1.salary() + " " + emp2.salary());
    }
}
