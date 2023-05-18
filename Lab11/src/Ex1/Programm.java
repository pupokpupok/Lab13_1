package Ex1;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Programm
{
    public static void main(String[] args)
    {
        Locale ru = new Locale("ru");
        Locale en = new Locale("en");
        printInfo(ru);
        printInfo(en);
    }
    public static void printInfo(Locale locale)
    {
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
}
