import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateTime = new Date();
        System.out.println(dateTimeFormat.format(dateTime));

        String dateAsString="10-12-2025";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dateAsString=sdf.format(date);
        System.out.println(dateAsString);

    }
}
