package easyway.com.movieguide.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import easyway.com.movieguide.R;

/**
 * Created by sandy's on 07-11-2017.
 */

public class StudentVH extends RecyclerView.ViewHolder{

    public ImageView imageView1;
    public TextView textView1;

    public StudentVH(View itemView) {
        super(itemView);

        imageView1 = (ImageView) itemView.findViewById(R.id.student_img);
        textView1 = (TextView) itemView.findViewById(R.id.student_name);
    }
}
