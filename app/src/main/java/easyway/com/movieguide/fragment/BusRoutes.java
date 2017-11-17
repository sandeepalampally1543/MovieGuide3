package easyway.com.movieguide.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.activity.BusRouteForm;
import easyway.com.movieguide.activity.DetailsForm;
import easyway.com.movieguide.activity.SubjectInformation;
import easyway.com.movieguide.adapter.BusAdapter;
import easyway.com.movieguide.model.BusModel;
import easyway.com.movieguide.others.VerticalSpaceItemDecoration;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusRoutes extends Fragment {

    Context context;
    RecyclerView bus_rec;
    BusAdapter busAdapter;
    FloatingActionButton floatingActionButton;

    private static final int VERTICAL_ITEM_SPACE= 10;

    public static List<BusModel> list;

    public BusRoutes() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bus_routes, container, false);

        bus_rec = (RecyclerView) view.findViewById(R.id.bus_route);
        floatingActionButton = (FloatingActionButton) view.findViewById(R.id.bus_float);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        list = new ArrayList<>();
        busAdapter = new BusAdapter(getContext(), list);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        bus_rec.setLayoutManager(mLayoutManager);
        bus_rec.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        bus_rec.setItemAnimator(new DefaultItemAnimator());
        bus_rec.setAdapter(busAdapter);
        bus_rec.addItemDecoration(new VerticalSpaceItemDecoration(VERTICAL_ITEM_SPACE));


        preparerv();

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(getContext(),BusRouteForm.class));
            }
        });
    }

    public void preparerv()
    {
        int images[] = new int[]{R.drawable.schoolbus,R.drawable.schoolbus,R.drawable.schoolbus,R.drawable.schoolbus};
        String name[] = {"Route1","Route2","Route3","Route4"};
        String route[] = {"Jp Nagar,6th Phase","Jp Nagar,6th Phase","Jp Nagar,6th Phase","Jp Nagar,6th Phase"};

        BusModel product = new BusModel(route[0],name[0],images[0]);
        list.add(product);

        product = new BusModel(route[1],name[1],images[1]);
        list.add(product);

        product = new BusModel(route[2],name[2],images[2]);
        list.add(product);

        product = new BusModel(route[3],name[3],images[3]);
        list.add(product);

        busAdapter.notifyDataSetChanged();
    }
}