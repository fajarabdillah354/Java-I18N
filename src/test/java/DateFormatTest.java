import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {


    @Test
    void testDateFormat() {
        String pattern = "EEEE dd MMMM yyyy";//pattern Date yang ada di class SimpleDateFormat(sesuai java doc)
        var simpleFormat = new SimpleDateFormat(pattern);

        String format = simpleFormat.format(new Date());
        System.out.println(format);

        /*
        jika kita tidak memasukan locale sendiri maka default locale akan sesuai dengan laptop yaitu bahasa inggris
         */
    }


    @Test
    void testDateFormatIndo() {
        Locale indo = new Locale("id","ID");//jika kita ingin memaksa menggunakan locale sendiri
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", indo);

        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja","JP");

        var dateJapan = new SimpleDateFormat(pattern,japan);

        var format = dateJapan.format(new Date());
        System.out.println(format);

    }


    @Test
    void testDateParseJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja","JP");
        var parseJapan = new SimpleDateFormat(pattern,japan);

        try {
           Date format = parseJapan.parse("金曜日 05 7月 2024");
           System.out.println(format);
        }catch (ParseException exception){
            System.out.println("TERJADI ERROR : "+exception.getMessage());
        }

        /*
        jika menggunakan parse(mengkonversi string ke date) kita harus menggunakan try catch
         */

    }

    @Test
    void testDateParseIndo() {
        var pattern = "EEEE dd MMMM yyyy";
        var indog = new Locale("id","ID");
        var parseIndog = new SimpleDateFormat(pattern,indog);

        try{
            Date format = parseIndog.parse("Sabtu 30 Desember 2000");//Penulisan ini harus sesuai dengan format yang ada di pattern jika tidak akan exception
            System.out.println(format);
        }catch (ParseException exception){
            System.out.println("TERJADI ERROR : "+exception.getMessage());
        }
    }
}
