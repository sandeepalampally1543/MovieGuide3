package easyway.com.movieguide.model;

/**
 * Created by sandy's on 07-11-2017.
 */

public class StudentModel {

    private int imgs;
    private String name;

    public StudentModel(int imgs, String name)
    {
        this.imgs = imgs;
        this.name = name;
    }
    public int getImgs() {
        return imgs;
    }

    public void setImgs(int imgs) {
        this.imgs = imgs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
