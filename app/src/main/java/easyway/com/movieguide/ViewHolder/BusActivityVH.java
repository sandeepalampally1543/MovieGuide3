package easyway.com.movieguide.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import easyway.com.movieguide.R;

/**
 * Created by sandy's on 10-11-2017.
 */

public class BusActivityVH extends RecyclerView.ViewHolder{

    public ImageView bus_image;
    public TextView route,driver_name,driver_mobile,bus_no;

    public BusActivityVH(View itemView) {
        super(itemView);
        bus_image = (ImageView) itemView.findViewById(R.id.imageView3);
        route = (TextView) itemView.findViewById(R.id.textView11);
        driver_name = (TextView) itemView.findViewById(R.id.textView12);
        driver_mobile = (TextView) itemView.findViewById(R.id.textView13);
        bus_no = (TextView) itemView.findViewById(R.id.textView14);
    }
}
