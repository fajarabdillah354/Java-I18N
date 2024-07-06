import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {


    @Test
    void testMessageFormat() {
        /*
        Sebenarnya ini belum termasuk I18N namun kita bisa mengubahnya dengan  memasukan pattern ke dalam resource bundle kita
         */
        String pattern = "hi {0}, selamat datang di {1}";
        var messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{//index pada pattern diambil dari array dibawah ini yang dimulai dari angka 0
                "fajar","Gotoxy Center"
        });
        System.out.println(format);
    }



    @Test
    void testMessageFormatIndo() {
        Locale indo = new Locale("id","ID");//Locale untuk indog
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message_id_ID",indo);//mengakses file resource agar bisa menggunakan value pada pattern yang telah dibuat disana
        String pattern = resourceBundle.getString("welcome.message");//nama key untuk pattern dalam resource bundle
        var messageFormat = new MessageFormat(pattern);//penggunaan class MessageFormat

        String format = messageFormat.format(new Object[]{//membuat index sebagai isi dari pattern yang telah dibuat, untuk value dari array ini boleh banyak
                "fajar","Gotoxy Center"
        });
        System.out.println(format);


        /*
        dengan demikian kita seakan2 membuat I18N padahal dibantu ResourceBundle
         */
    }

    @Test
    void testMessageFormatIndoType(){
        var indo = new Locale("id","ID");
        var resourceBundle = ResourceBundle.getBundle("message_id_ID",indo);
        var pattern = resourceBundle.getString("status");
        var messageFormat = new MessageFormat(pattern,indo);//
        String format = messageFormat.format(new Object[]{
                "fajar",new Date(),1000000
        });

        System.out.println(format);


    }



    @Test
    void testMessageFormatJapanType(){
        var japan = new Locale("ja","JP");
        var resourceBundle = ResourceBundle.getBundle("message_ja_JP",japan);
        var pattern = resourceBundle.getString("status");//mengakses key yang ada di file properties
        var messageFormat = new MessageFormat(pattern,japan);
        String format = messageFormat.format(new Object[]{
                "fajar",new Date(),1000000//saat membuat value dari index kita bisa mengisikan apa saja termasuk object sekalipun seperti object Date()
        });

        System.out.println(format);


    }
}
