/**
 * Created by Diana Bochis on 24/03/2017.
 */
public class Package {
    private double merchandiseValue;
    private String distance;

    public Package(double merchandiseValue, String distance) {
        this.merchandiseValue = merchandiseValue;
        this.distance = distance;
    }

    public double getMerchandiseValue() {
        return merchandiseValue;
    }

    public void setMerchandiseValue(double merchandiseValue) {
        this.merchandiseValue = merchandiseValue;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
