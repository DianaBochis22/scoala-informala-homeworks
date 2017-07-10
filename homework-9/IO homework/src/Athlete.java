import javafx.scene.shape.PathElement;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Diana Bochis on 08/02/2017.
 * Athlete class
 */
public class Athlete {

    int athleteNumber;
    String athleteName;
    String countryCode;
    double seconds;
    double minutes;
    Date skiTimeResult;
    String firstShootingRange;
    String secondShootingRange;
    String thirdShootingRange;

    public Athlete(Date skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public Athlete(int athleteNumber, String athleteName, String countryCode, double seconds, double minutes, Date skiTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.seconds = seconds;
        this.minutes = minutes;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    public Date getSkiTimeResult() {
        return skiTimeResult;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }


    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public void setFirstShootingRange(String firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public void setSecondShootingRange(String secondShootingRange) {
        this.secondShootingRange = secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    public void setThirdShootingRange(String thirdShootingRange) {
        this.thirdShootingRange = thirdShootingRange;
    }

    public double getSeconds() {
        return seconds;
    }



    public double getMinutes() {
        return minutes;
    }


    public void setSkiTimeResult(Date skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }
    DateFormat df = new SimpleDateFormat("mm:ss");
}
