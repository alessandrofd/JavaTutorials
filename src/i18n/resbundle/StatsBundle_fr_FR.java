
import java.util.ListResourceBundle;

/**
 * Created by alessandro.dantas on 08/04/2014.
 */
public class StatsBundle_fr_FR extends ListResourceBundle {

    public Object[][] getContents() { return contents; }

    private Object[][] contents = {
        {"GDP", new Integer(20_000)},
        {"Population", new Integer(58_317_450)},
        {"Literacy", new Double(0.99)},
    };
}
