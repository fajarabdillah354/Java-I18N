import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;
import java.util.Locale;

public class TestLocale {

    @Test
    void testLocaleId() {
        String language = "id";
        String country = "ID";
        Locale locale = new Locale(language,country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());


        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());

    }

    @Test
    void testLocaleUs() {
        String language = "en";
        String country = "US";
        Locale locale = new Locale(language,country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());


        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());

    }



}
