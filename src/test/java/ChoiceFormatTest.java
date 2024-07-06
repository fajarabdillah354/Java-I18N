import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {

    /*
    Choice Format
    - ChoiceFormat class adalah yang digunakan untuk menyematkan data dengan range number, biasanya ini digunakan untuk kata plurals, misal jika 1 namanya file, jika banyak namanya files
    - pembuatan pattern untuk choice format sangat sederhana, cukup gunakan number#value atau number<value, dan URUTANNYA HARUS DARI KECIL KE BESAR, DAN DIPISAHKAN MENGGUNAKAN tanda |
    contoh :
    -1#Hutang | 0#Kosong | 1#Tersedia
    cara bacanya jika nilainya -1 maka value yang keluar Hutang, jika nilainya 0 value yang keluar Kosong, dan jika 1 valuenya yang keluar Tersedia
     */



    @Test
    void testChoiceFormatIndo() {

        var locale = new Locale("id","ID");
        var resourceBundle = ResourceBundle.getBundle("message_id_ID",locale);
        var pattern = resourceBundle.getString("balance");

        var choiceFormat = new MessageFormat(pattern,locale);
        System.out.println(choiceFormat.format(new Object[]{-1000000}));
        System.out.println(choiceFormat.format(new Object[]{0}));
        System.out.println(choiceFormat.format(new Object[]{1000000}));

    }

    @Test
    void testChoiceFormatAmerika() {

        var locale = new Locale("en","US");
        var resourceBundle = ResourceBundle.getBundle("message",locale);
        var pattern = resourceBundle.getString("balance");

        var choiceFormat = new MessageFormat(pattern,locale);
        System.out.println(choiceFormat.format(new Object[]{-1000000}));
        System.out.println(choiceFormat.format(new Object[]{0}));
        System.out.println(choiceFormat.format(new Object[]{1000000}));

    }
}
