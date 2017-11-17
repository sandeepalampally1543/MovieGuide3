package easyway.com.movieguide.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import easyway.com.movieguide.R;
import easyway.com.movieguide.adapter.GalleryAdapter;
import easyway.com.movieguide.adapter.StudentAdapter;
import easyway.com.movieguide.model.GalleryModel;
import easyway.com.movieguide.model.StudentModel;
import easyway.com.movieguide.others.VerticalSpaceItemDecoration;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gallery extends Fragment {

    RecyclerView recyclerView;
    GalleryAdapter galleryAdapter;
    private static final int VERTICAL_ITEM_SPACE= 10;


    public static List<GalleryModel> list;

    public Gallery() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyler4);
        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        list = new ArrayList<>();
        galleryAdapter = new GalleryAdapter(getContext(),list);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(galleryAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(galleryAdapter);

        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(VERTICAL_ITEM_SPACE));

        preparerv();
    }
    public void preparerv() {
        int tl_execimg[] = {R.drawable.akrit, R.drawable.divya, R.drawable.krupa, R.drawable.divya,
                R.drawable.akrit, R.drawable.akrit, R.drawable.akrit, R.drawable.divya, R.drawable.garima};
        String name[] = {"Sharuk added photos", "Divya added photos",
                "Krupa added photos", "Divya added photos", "Akrit added photos", "Akrit added photos", "Divya added photos",
                "Garima added photos", "Krupa added photos"};

        GalleryModel product = new GalleryModel(tl_execimg[0], name[0]);
        list.add(product);

        product = new GalleryModel(tl_execimg[1], name[1]);
        list.add(product);

        product = new GalleryModel(tl_execimg[2], name[2]);
        list.add(product);

        product = new GalleryModel(tl_execimg[3], name[3]);
        list.add(product);

        product = new GalleryModel(tl_execimg[4], name[4]);
        list.add(product);

        product = new GalleryModel(tl_execimg[5], name[5]);
        list.add(product);

        product = new GalleryModel(tl_execimg[6], name[6]);
        list.add(product);

        product = new GalleryModel(tl_execimg[7], name[7]);
        list.add(product);

        product = new GalleryModel(tl_execimg[8], name[8]);
        list.add(product);

        galleryAdapter.notifyDataSetChanged();
    }
}
