import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {

        Locale l  =  Locale.getDefault();
        System.out.println(l.getCountry() + " " + l.getLanguage());
        System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());

        Locale.setDefault(Locale.UK);

        System.out.println(Locale.getDefault().getDisplayCountry() + " " + Locale.getDefault().getDisplayLanguage());

        String[] isoCountries = Locale.getISOCountries();

        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry);
        }

        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage);
        }








    }
}
