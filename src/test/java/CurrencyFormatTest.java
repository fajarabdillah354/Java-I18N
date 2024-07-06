import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatTest {


    @Test
    void testCurrencyJapan() {
        Locale japan = new Locale("ja","JP");//kita harus membuat Locale kita dulu jika kita ingin jika tidak akan default ke bawaan laptop
        Currency currency = Currency.getInstance(japan);//harus menggunakan class Currency

        /*
        kita bisa menampilkan nama mata uang, code mata uang, dan simbol mata uang
         */
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(japan));
    }

    @Test
    void testCurrencyIndo() {
        Locale indo = new Locale("id","ID");
        Currency currency = Currency.getInstance(indo);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indo));//untuk method getSymbol() kita perlu masukan parameter locale agar mendapatkan simbol mata uang negaranya
    }


    @Test
    void testCurrencyFormatIndo() {
        var indo = new Locale("id","ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indo);
        var format = numberFormat.format(10000000.245);
        System.out.println(format);

        /*
        karna kita menggunakan locale INDONESIA maka format penulisan menggunakan indo yaitu untuk pemisah menggunakan titik(.)
         */
    }

    @Test
    void testCurrencyFormatJapan() {
        var japan = new Locale("ja","JP");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(japan);
        var format = numberFormat.format(10000000.245);
        System.out.println(format);

        /*
        karna kita menggunakan locale JAPAN maka format penulisan menggunakan indo yaitu untuk pemisah menggunakan titik(.)
         */
    }


    @Test
    void testCurrencyParseIndo() {
        var indo = new Locale("id","ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indo);//untuk format Currency kita menggunakan class NumberFormat() tidak menggunakan class Currency karna kita mengkonversi nilai uangnya

        try{// untuk kasus parse selalu menggunakan trycatch
            var parse = numberFormat.parse("Rp200.000,59").doubleValue();
            System.out.println(parse);
        }catch (ParseException exception){
            System.out.println("ERROR : "+exception.getMessage());
        }


    }
}
