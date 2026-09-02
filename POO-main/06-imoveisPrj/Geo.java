
public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double umaLatitude, double umaLongitude){
        this.latitude = umaLatitude;
        this.longitude = umaLongitude;
    }

    @Override
    public String toString(){
        return String.format("(%d) /t %d", latitude, longitude);
    }
}
