/**
 * Created by Diana Bochis on 09/02/2017.
 * Small chronometer class.
 */
public class Chronometer {


    private long begin, end;

    public void start(){
        begin = System.currentTimeMillis();
    }

    public void stop(){
        end = System.currentTimeMillis();
    }
    public double getSeconds() {
        return (end - begin) / 1000.0;
    }
    public double getMinutes() {
        return (end - begin) / 60000.0;
    }
    public long getTime() {
        return end-begin;
    }


}
