import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {

//        Double d = 128312321.21321;
//        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
//
//        System.out.println(nf.format(d));
//


        long l = 1231231212;
        NumberFormat nf=NumberFormat.getInstance(Locale.US);
        NumberFormat nf2=NumberFormat.getInstance(Locale.UK);
        nf.setMinimumFractionDigits(4);
        nf2.setMinimumFractionDigits(2);
        System.out.println(nf.format(l));
        System.out.println(nf2.format(l));
    }
}
