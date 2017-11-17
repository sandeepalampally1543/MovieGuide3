package easyway.com.movieguide.model;

/**
 * Created by sandy's on 10-11-2017.
 */

public class BusActivityModel {

    private int bus_images;
    private String route,driver,mobile,bus_no;

    public BusActivityModel(int bus_images,String route,String driver,String mobile,String bus_no)
    {
        this.bus_images = bus_images;
        this.route = route;
        this.driver = driver;
        this.mobile = mobile;
        this.bus_no = bus_no;
    }
    public int getBus_images() {
        return bus_images;
    }

    public void setBus_images(int bus_images) {
        this.bus_images = bus_images;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBus_no() {
        return bus_no;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }
}
