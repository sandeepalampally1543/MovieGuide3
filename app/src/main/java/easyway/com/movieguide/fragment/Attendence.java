package easyway.com.movieguide.fragment;


import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.adapter.AttendenceAdapter;
import easyway.com.movieguide.model.AttendenceModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class Attendence extends Fragment {

    RecyclerView recyclerView2;
    AttendenceAdapter attendenceAdapter;

    public static List<AttendenceModel> list;

    public Attendence() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_attendence, container, false);
        recyclerView2 = (RecyclerView) view.findViewById(R.id.recyler2);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        list = new ArrayList<>();
        attendenceAdapter = new AttendenceAdapter(getContext(), list);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView2.setLayoutManager(mLayoutManager);
        recyclerView2.addItemDecoration(new GridSpacingItemDecoration(3, dpToPx(8), true));
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setAdapter(attendenceAdapter);

        preparerv();
    }

    public void preparerv() {
        int tl_execimg[] = {R.drawable.akrit, R.drawable.divya, R.drawable.krupa, R.drawable.divya,
                R.drawable.akrit, R.drawable.akrit, R.drawable.akrit, R.drawable.divya, R.drawable.garima};
        String name[] = {"Sindu", "Akrit",
                "Sindu", "Divya", "Garima", "Akrit", "Krupa", "Kittu", "Chintu"};


        AttendenceModel product = new AttendenceModel(tl_execimg[0], name[0]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[1], name[1]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[2], name[2]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[3], name[3]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[4], name[4]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[5], name[5]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[6], name[6]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[7], name[7]);
        list.add(product);

        product = new AttendenceModel(tl_execimg[8], name[8]);
        list.add(product);

        attendenceAdapter.notifyDataSetChanged();
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
//    public  void openLeadFilterDialog(){
//        // custom dialog
//        final Dialog dialog = new Dialog(getContext());
//        dialog.setContentView(R.layout.attendence_dialog);
//
//        Window window = dialog.getWindow();
//        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
//        dialog.show();
//    }


}