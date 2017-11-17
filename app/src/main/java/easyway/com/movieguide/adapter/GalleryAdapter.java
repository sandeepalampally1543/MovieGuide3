package easyway.com.movieguide.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.ViewHolder.GalleryVH;
import easyway.com.movieguide.model.GalleryModel;

/**
 * Created by sandy's on 08-11-2017.
 */

public class GalleryAdapter extends RecyclerView.Adapter<GalleryVH> {

    Context context;
    List<GalleryModel> list;
    int counter = 0;

    public GalleryAdapter(Context context, List<GalleryModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public GalleryVH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_gallery,parent,false);
        return new GalleryVH(view);
    }

    @Override
    public void onBindViewHolder(final GalleryVH holder, int position) {

        GalleryModel model = list.get(position);
        holder.imageView.setImageResource(model.getImages());
        holder.textView.setText(model.getDesc());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            counter++;
            holder.textView1.setText(Integer.toString(counter));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
