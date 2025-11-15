public class Location {
    private String locationName;
    private int locationCapacity; //Hacer una agregación de Location en Event

    public Location(String locationName, int locationCapacity){
        this.locationName = locationName;
        this.locationCapacity = locationCapacity;
    }
}
