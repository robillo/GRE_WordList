package com.appbusters.robinpc.delete;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DFragment extends Fragment {

    private RecyclerView recyclerview8;
    private RecyclerView.LayoutManager mLayoutManager;

    public DFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_d, container, false);
        List<Data> data = fill_with_data();

        recyclerview8 = (RecyclerView) v.findViewById(R.id.recyclerview8);
        recyclerview8.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerview8.setLayoutManager(mLayoutManager);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getActivity().getApplication());
        recyclerview8.setAdapter(adapter);

        return v;
    }
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data(getResources().getString(R.string.w82), getResources().getString(R.string.m82)  ));
        data.add(new Data(getResources().getString(R.string.w83), getResources().getString(R.string.m83)  ));
        data.add(new Data(getResources().getString(R.string.w84), getResources().getString(R.string.m84)  ));
        data.add(new Data(getResources().getString(R.string.w85), getResources().getString(R.string.m85)  ));
        data.add(new Data(getResources().getString(R.string.w86), getResources().getString(R.string.m86)  ));
        data.add(new Data(getResources().getString(R.string.w87), getResources().getString(R.string.m87)  ));
        data.add(new Data(getResources().getString(R.string.w88), getResources().getString(R.string.m88)  ));
        data.add(new Data(getResources().getString(R.string.w89), getResources().getString(R.string.m89)  ));
        data.add(new Data(getResources().getString(R.string.w90), getResources().getString(R.string.m90)  ));
        data.add(new Data(getResources().getString(R.string.w91), getResources().getString(R.string.m91)  ));
        data.add(new Data(getResources().getString(R.string.w92), getResources().getString(R.string.m92)  ));
        data.add(new Data(getResources().getString(R.string.w93), getResources().getString(R.string.m93)  ));
        data.add(new Data(getResources().getString(R.string.w94), getResources().getString(R.string.m94)  ));
        data.add(new Data(getResources().getString(R.string.w95), getResources().getString(R.string.m95)  ));
        data.add(new Data(getResources().getString(R.string.w96), getResources().getString(R.string.m96)  ));
        data.add(new Data(getResources().getString(R.string.w97), getResources().getString(R.string.m97)  ));
        data.add(new Data(getResources().getString(R.string.w98), getResources().getString(R.string.m98)  ));
        data.add(new Data(getResources().getString(R.string.w99), getResources().getString(R.string.m99)  ));
        data.add(new Data(getResources().getString(R.string.w100), getResources().getString(R.string.m100)  ));
        data.add(new Data(getResources().getString(R.string.w101), getResources().getString(R.string.m101)  ));
        data.add(new Data(getResources().getString(R.string.w102), getResources().getString(R.string.m102)  ));
        data.add(new Data(getResources().getString(R.string.w103), getResources().getString(R.string.m103)  ));
        data.add(new Data(getResources().getString(R.string.w104), getResources().getString(R.string.m104)  ));
        return data;
    }

}