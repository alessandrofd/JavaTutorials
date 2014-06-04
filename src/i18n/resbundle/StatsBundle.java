

import java.util.ListResourceBundle;

/**
 * Created by alessandro.dantas on 08/04/2014.
 */
public class StatsBundle extends ListResourceBundle {

    public Object[][] getContents() { return contents; }

    private Object[][] contents = {
            {"GDP", new Integer(0)},
            {"Population", new Integer(0)},
            {"Literacy", new Double(0.0)}
    };
}
