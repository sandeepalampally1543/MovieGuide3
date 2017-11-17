package easyway.com.movieguide.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.ViewHolder.BusActivityVH;
import easyway.com.movieguide.model.BusActivityModel;

/**
 * Created by sandy's on 10-11-2017.
 */

public class BusActivityAdapter extends RecyclerView.Adapter<BusActivityVH> {

    Context context;
    List<BusActivityModel> list;

    public BusActivityAdapter(Context context,List<BusActivityModel> list) {

        this.context = context;
        this.list = list;
    }

    @Override
    public BusActivityVH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_bus_route,parent,false);
        return new BusActivityVH(view);
    }

    @Override
    public void onBindViewHolder(BusActivityVH holder, int position) {

        BusActivityModel model = list.get(position);
        holder.bus_image.setImageResource(model.getBus_images());
        holder.route.setText(model.getRoute());
        holder.driver_name.setText(model.getDriver());
        holder.driver_mobile.setText(model.getMobile());
        holder.bus_no.setText(model.getBus_no());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
