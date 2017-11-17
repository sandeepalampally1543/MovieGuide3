package easyway.com.movieguide.adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.ViewHolder.AttendenceVH;
import easyway.com.movieguide.fragment.Attendence;
import easyway.com.movieguide.model.AttendenceModel;

/**
 * Created by sandy's on 06-11-2017.
 */

public class AttendenceAdapter extends RecyclerView.Adapter<AttendenceVH> {

    Context context;
    List<AttendenceModel> list;

    public AttendenceAdapter(Context context,List<AttendenceModel> list)
    {
        this.context = context;
        this.list = list;
    }
    @Override
    public AttendenceVH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_attendence,parent,false);
        return new AttendenceVH(view);
    }

    @Override
    public void onBindViewHolder(AttendenceVH holder, int position) {

        AttendenceModel model = list.get(position);
        holder.imageView.setImageResource(model.getImgs());
        holder.textView.setText(model.getName());
//        holder.button.setBottom(model.getButton());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.attendence_dialog);
                dialog.setTitle("Attendence");
                Window window = dialog.getWindow();
                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
