package easyway.com.movieguide.model;

/**
 * Created by sandy's on 06-11-2017.
 */

public class BusModel  {

    private int images;
    private String bus_route,bus_number;

    public BusModel(String bus_route, String bus_number, int images)
    {
        this.bus_number = bus_number;
        this.bus_route = bus_route;
        this.images = images;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        images = images;
    }

    public String getBus_route() {
        return bus_route;
    }

    public void setBus_route(String bus_route) {
        this.bus_route = bus_route;
    }

    public String getBus_number() {
        return bus_number;
    }

    public void setBus_number(String bus_number) {
        this.bus_number = bus_number;
    }
}
