import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter f2 = formatter.ofPattern("h B");

        System.out.println(now.format(formatter));
        System.out.println(now.format(f2));
    }

}
