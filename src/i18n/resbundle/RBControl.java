import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by alessandro.dantas on 08/04/2014.
 */
public class RBControl {

    public static void main(String[] args) {
        test(Locale.CHINA);
        test(new Locale("zh", "HK"));
        test(Locale.TAIWAN);
        test(Locale.CANADA);
    }

    private static void test(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("RBControl", locale,
                new ResourceBundle.Control() {
                    @Override
                    public List<Locale> getCandidateLocales(String baseName, Locale locale) {
                        if (baseName == null)
                            throw new NullPointerException();
                        if (locale.equals(new Locale("zh", "HK"))) {
                            return Arrays.asList(
                                    locale,
                                    Locale.TAIWAN,
                                    Locale.ROOT);
                        } else if (locale.equals(Locale.TAIWAN)) {
                            return Arrays.asList(
                                    locale,
                                    Locale.ROOT);
                        }
                        return super.getCandidateLocales(baseName, locale);
                    }
                });
        System.out.println("locale: " + locale);
        System.out.println("\tregion: " + rb.getString("region"));
        System.out.println("\tlanguage: " + rb.getString("language"));
    }
}
