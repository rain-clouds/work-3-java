import java.util.*;
public class City
{
    private
    String city_name;
//lista de locatii
    List <Location> locations;//sper ca e corect, sa revin pe asta

    public

    City(String city)//constructor
    {
        this.city_name=city;
    }
    //set- get- name
    public String getname()
    {
        return city_name;
    }
    public void setname(String new_name)
    {
        this.city_name=new_name;
    }

    //get locations
    public List<Location> get_locations() {
        return locations;
    }
    //add locations
    public void addLocations(String name) {
        this.locations.add(new Location(name));
    }

}
