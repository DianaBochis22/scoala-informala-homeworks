import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Diana Bochis on 10/02/2017.
 * ski time result comparator class;
 */


public class CompareTime implements Comparator<Athlete> {

    public int compare(Athlete a, Athlete b) {
        if (a.getSkiTimeResult().before(b.getSkiTimeResult())) {
            return -1;
        } else if (a.getSkiTimeResult().after(b.getSkiTimeResult())) {
            return 1;
        } else {
            return 0;
        }

    }
}
