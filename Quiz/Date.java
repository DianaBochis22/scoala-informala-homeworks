import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Diana Bochis on 24/03/2017.
 */

public class Date {
    private LocalDate date;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Date(String date) {
        this.date = LocalDate.parse(date,formatter);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date,formatter);
    }
}
