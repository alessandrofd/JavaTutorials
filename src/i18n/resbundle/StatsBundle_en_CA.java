
import java.util.ListResourceBundle;

/**
 * Created by alessandro.dantas on 08/04/2014.
 */
public class StatsBundle_en_CA extends ListResourceBundle {

    public Object[][] getContents() { return contents; }

    private Object[][] contents = {
            {"GDP", new Integer(24400)},
            {"Population", new Integer(28802671)},
            {"Literacy", new Double(0.97)},
    };
}
