import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {


    @Test
    void testMessageResource() {
        //parameter baseName adalah nama awal dari properties yang kitaa buat
        var resourceBundle = ResourceBundle.getBundle("message");// KITA HARUS BUAT OBJECT YANG MENGARAH KE RESOURCEBUNDLE kita

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }


    @Test
    void testMessageID() {
        Locale indonesia = new Locale("id","ID");
        var resourceBundle = ResourceBundle.getBundle("message_id_ID");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }


    @Test
    void testMessageJP() {
        Locale japan = new Locale("ja","JP");
        var resourceBundle = ResourceBundle.getBundle("message_ja_JP");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }
}
