package Main;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

    public static void main(String[] args) {


        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getISO3Language());

        Locale enlocale = new Locale("en", "US");
        Locale frlocale = new Locale("fr", "FR");
        Locale eslocale = new Locale("es", "ES");
        System.out.println("English language (default)" + enlocale.getDisplayLanguage());
        System.out.println("French language" + enlocale.getDisplayLanguage(eslocale));
        System.out.println("Spanish language" + enlocale.getDisplayLanguage(eslocale));


        ResourceBundle bundle = ResourceBundle.getBundle("Main.MessageBundle",Locale.US);
        System.out.println("Mesage in " + Locale.US + " : " + bundle.getString("Greetings"));

        //changing the default locale to Indonasian
        Locale.setDefault(new Locale("in", "ID"));
        bundle = ResourceBundle.getBundle("Internationalisaton.MessageBundle");
        System.out.println("Mesage in " + Locale.getDefault() + " : " + bundle.getString("Greetings"));

//		printDate(Locale.US);
// 		printDate(Locale.UK);

    }
}