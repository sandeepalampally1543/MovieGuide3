package easyway.com.movieguide.activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.adapter.BusActivityAdapter;
import easyway.com.movieguide.model.BusActivityModel;
import easyway.com.movieguide.model.GalleryModel;
import easyway.com.movieguide.others.VerticalSpaceItemDecoration;


public class BusRoute extends AppCompatActivity {

    private static final int VERTICAL_ITEM_SPACE= 10;
    Context context;
    Toolbar toolbar;
    private RecyclerView recyclerView;
    BusActivityAdapter busActivityAdapter;
    private FloatingActionButton floatingActionButton;
    public static List<BusActivityModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_route);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Bus Routes");

        list = new ArrayList<>();
        busActivityAdapter = new BusActivityAdapter(context, list);

        recyclerView = (RecyclerView) findViewById(R.id.recycler5);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.bus_route);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(busActivityAdapter);
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(VERTICAL_ITEM_SPACE));

        preparerv();
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(getApplicationContext(),DetailsForm.class));
            }
        });
    }

    public void preparerv() {
        int tl_execimg[] = new int[]{R.drawable.schoolbus};

        String route[] = {"Jp nagar","Jaya nagar","Vijaya nagar","SR nagar"};

        String driver[] = {"Driver Name:Mahesh", "Driver Name:Nikki", "Driver Name:Kajal", "Driver Name:john"};
        String mobile[] = {"Mobile No:9985214785", "Mobile No:9985214785", "Mobile No:9985214785", "Mobile No:9985214785"};
        String bus_no[] = {"BusNo:KA07AD1152", "BusNo:KA07AD1152", "BusNo:KA07AD1152", "BusNo:KA07AD1152"};

        BusActivityModel product = new BusActivityModel(tl_execimg[0], route[0], driver[0], mobile[0], bus_no[0]);
        list.add(product);

        product = new BusActivityModel(tl_execimg[0], route[1], driver[1], mobile[1], bus_no[1]);
        list.add(product);

        product = new BusActivityModel(tl_execimg[0], route[2], driver[2], mobile[2], bus_no[2]);
        list.add(product);

        product = new BusActivityModel(tl_execimg[0], route[3], driver[3], mobile[3], bus_no[3]);
        list.add(product);

        busActivityAdapter.notifyDataSetChanged();
    }

}