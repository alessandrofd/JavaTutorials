

import java.util.ListResourceBundle;

/**
 * Created by alessandro.dantas on 08/04/2014.
 */
public class StatsBundle_ja_JP extends ListResourceBundle {

    public Object[][] getContents() { return contents; }

    private Object[][] contents = {
            {"GDP", new Integer(21_300)},
            {"Population", new Integer(125_449_703)},
            {"Literacy", new Double(0.99)},
    };
}
