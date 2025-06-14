import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 F to C, 2 C to F");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Fahrenheit");
                f = sc.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius: " + c);
                break;
            case 2:
                System.out.println("Enter temperature in Celcius");
                c = sc.nextDouble();
                f = ((9 * c) / 5) + 32;
                System.out.println("Fahrenheit: " + f);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
