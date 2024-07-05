import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {


    @Test
    void testNumberFormat() {

        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(10000000.255);
        System.out.println(format);// hasil dari format ini akan sesuai dengan default Locale laptop
    }

    @Test
    void testNumberFormatIndo() {
        var indo = new Locale("id","ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indo);//jika kita ingin menggunakan locale sendiri kita bisa menambahkan parameter method getInstance dengan locale yang kita buat
        var formatIndo = numberFormat.format(10000000.255);//akan menampilkan hasil sesuai dengan number format indo
        System.out.println(formatIndo);
    }

    @Test
    void testNumberParseIndo() {

        var indo = new Locale("id","ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indo);

        try {
            var parseIndo = numberFormat.parse("10000000.255").doubleValue();
            System.out.println(parseIndo);
        }catch (ParseException exception){
            System.out.println("Error : "+exception.getMessage());
        }
    }
}
