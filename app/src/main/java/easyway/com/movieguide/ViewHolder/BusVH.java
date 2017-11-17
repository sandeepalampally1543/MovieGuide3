package easyway.com.movieguide.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import easyway.com.movieguide.R;

/**
 * Created by sandy's on 06-11-2017.
 */

public class BusVH extends RecyclerView.ViewHolder {

    public ImageView Images;
    public TextView busNumber,busRoute;
    public RelativeLayout relativeLayout;

    public BusVH(View itemView) {
        super(itemView);
        relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relative);
        Images = (ImageView) itemView.findViewById(R.id.imageView2);
        busNumber = (TextView) itemView.findViewById(R.id.textView);
        busRoute = (TextView) itemView.findViewById(R.id.textView2);
    }
}
