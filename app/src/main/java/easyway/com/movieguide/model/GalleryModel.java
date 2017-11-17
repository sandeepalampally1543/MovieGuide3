package easyway.com.movieguide.model;

/**
 * Created by sandy's on 08-11-2017.
 */

public class GalleryModel {


    private int images;
    private String desc;

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



    public GalleryModel(int images,String desc )
    {
        this.images = images;
        this.desc = desc;
    }
}
