public class Location {
    private String locationName;
    private int locationCapacity; //Hacer una agregación de Location en Event

    public Location(String locationName, int locationCapacity){
        this.locationName = locationName;
        this.locationCapacity = locationCapacity;
    }

    public String getLocationName(){
        return locationName;
    }

    public int getLocationCapacity(){
        return locationCapacity;
    }

    public void setLocationName(String locationName){
        if(!locationName.equals("")){
            this.locationName = locationName;
        }
    }

    public void setLocationCapacity(int locationCapacity){
        this.locationCapacity = locationCapacity;
    }
}
