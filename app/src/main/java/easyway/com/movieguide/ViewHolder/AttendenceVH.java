package easyway.com.movieguide.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import easyway.com.movieguide.R;

/**
 * Created by sandy's on 06-11-2017.
 */

public class AttendenceVH extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;
    public Button button;
    public AttendenceVH(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.tl_exec_img);
        textView = (TextView) itemView.findViewById(R.id.tl_exec_name);
        button = (Button) itemView.findViewById(R.id.button);
    }
}
