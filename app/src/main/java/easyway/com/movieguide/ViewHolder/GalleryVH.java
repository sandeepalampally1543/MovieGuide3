package easyway.com.movieguide.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import easyway.com.movieguide.R;

/**
 * Created by sandy's on 08-11-2017.
 */

public class GalleryVH extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;
    public Button button;
    public TextView textView1;
    public GalleryVH(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.circleImageView2);
        textView = (TextView) itemView.findViewById(R.id.textView9);
        button = (Button) itemView.findViewById(R.id.btn);
        textView1 = (TextView) itemView.findViewById(R.id.text2);
    }
}
