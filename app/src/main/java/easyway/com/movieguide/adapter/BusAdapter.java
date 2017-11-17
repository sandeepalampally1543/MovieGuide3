package easyway.com.movieguide.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.ViewHolder.BusVH;
import easyway.com.movieguide.activity.BusRoute;
import easyway.com.movieguide.model.BusModel;

/**
 * Created by sandy's on 06-11-2017.
 */

public class BusAdapter extends RecyclerView.Adapter<BusVH> {

    Context context;
    List<BusModel> list;

    public BusAdapter(Context context, List<BusModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public BusVH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_route,parent,false);
        return new BusVH(view);

    }

    @Override
    public void onBindViewHolder(BusVH holder, int position) {

        BusModel busModel = list.get(position);
        holder.Images.setImageResource(busModel.getImages());
        holder.busRoute.setText(busModel.getBus_route());
        holder.busNumber.setText(busModel.getBus_number());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(context,BusRoute.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
