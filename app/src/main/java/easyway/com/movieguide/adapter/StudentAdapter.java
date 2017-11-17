package easyway.com.movieguide.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.ViewHolder.AttendenceVH;
import easyway.com.movieguide.ViewHolder.StudentVH;
import easyway.com.movieguide.activity.StudentProfile;
import easyway.com.movieguide.model.AttendenceModel;
import easyway.com.movieguide.model.StudentModel;

/**
 * Created by sandy's on 07-11-2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentVH> {

    Context context;
    List<StudentModel> list;

    public StudentAdapter(Context context,List<StudentModel> list)
    {
        this.context = context;
        this.list = list;
    }

    @Override
    public StudentVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_student,parent,false);
        return new StudentVH(view);
    }

    @Override
    public void onBindViewHolder(StudentVH holder, int position) {

        StudentModel model = list.get(position);
        holder.imageView1.setImageResource(model.getImgs());
        holder.textView1.setText(model.getName());
        holder.imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(context, StudentProfile.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
