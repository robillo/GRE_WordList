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
public class AFragment extends Fragment {

    private RecyclerView recyclerview5;
    private RecyclerView.LayoutManager mLayoutManager;

    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        List<Data> data = fill_with_data();

        recyclerview5 = (RecyclerView) v.findViewById(R.id.recyclerview5);
        recyclerview5.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerview5.setLayoutManager(mLayoutManager);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getActivity().getApplication());
        recyclerview5.setAdapter(adapter);

        return v;
    }
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data(getResources().getString(R.string.w1),  getResources().getString(R.string.m1)  ));
        data.add(new Data(getResources().getString(R.string.w2),  getResources().getString(R.string.m2)  ));
        data.add(new Data(getResources().getString(R.string.w3),  getResources().getString(R.string.m3)  ));
        data.add(new Data(getResources().getString(R.string.w4),  getResources().getString(R.string.m4)  ));
        data.add(new Data(getResources().getString(R.string.w5),  getResources().getString(R.string.m5)  ));
        data.add(new Data(getResources().getString(R.string.w6),  getResources().getString(R.string.m6)  ));
        data.add(new Data(getResources().getString(R.string.w7),  getResources().getString(R.string.m7)  ));
        data.add(new Data(getResources().getString(R.string.w8),  getResources().getString(R.string.m8)  ));
        data.add(new Data(getResources().getString(R.string.w9),  getResources().getString(R.string.m9)  ));
        data.add(new Data(getResources().getString(R.string.w10), getResources().getString(R.string.m10)  ));
        data.add(new Data(getResources().getString(R.string.w11), getResources().getString(R.string.m11)  ));
        data.add(new Data(getResources().getString(R.string.w12), getResources().getString(R.string.m12)  ));
        data.add(new Data(getResources().getString(R.string.w13), getResources().getString(R.string.m13)  ));
        data.add(new Data(getResources().getString(R.string.w14), getResources().getString(R.string.m14)  ));
        data.add(new Data(getResources().getString(R.string.w15), getResources().getString(R.string.m15)  ));
        data.add(new Data(getResources().getString(R.string.w16), getResources().getString(R.string.m16)  ));
        data.add(new Data(getResources().getString(R.string.w17), getResources().getString(R.string.m17)  ));
        data.add(new Data(getResources().getString(R.string.w18), getResources().getString(R.string.m18)  ));
        data.add(new Data(getResources().getString(R.string.w19), getResources().getString(R.string.m19)  ));
        data.add(new Data(getResources().getString(R.string.w20), getResources().getString(R.string.m20)  ));
        data.add(new Data(getResources().getString(R.string.w21), getResources().getString(R.string.m21)  ));
        data.add(new Data(getResources().getString(R.string.w22), getResources().getString(R.string.m22)  ));
        data.add(new Data(getResources().getString(R.string.w23), getResources().getString(R.string.m23)  ));
        data.add(new Data(getResources().getString(R.string.w24), getResources().getString(R.string.m24)  ));
        data.add(new Data(getResources().getString(R.string.w25), getResources().getString(R.string.m25)  ));
        data.add(new Data(getResources().getString(R.string.w26), getResources().getString(R.string.m26)  ));
        data.add(new Data(getResources().getString(R.string.w27), getResources().getString(R.string.m27)  ));
        data.add(new Data(getResources().getString(R.string.w28), getResources().getString(R.string.m28)  ));
        data.add(new Data(getResources().getString(R.string.w29), getResources().getString(R.string.m29)  ));
        data.add(new Data(getResources().getString(R.string.w30), getResources().getString(R.string.m30)  ));
        data.add(new Data(getResources().getString(R.string.w31), getResources().getString(R.string.m31)  ));
        data.add(new Data(getResources().getString(R.string.w32), getResources().getString(R.string.m32)  ));
        data.add(new Data(getResources().getString(R.string.w33), getResources().getString(R.string.m33)  ));
        data.add(new Data(getResources().getString(R.string.w34), getResources().getString(R.string.m34)  ));
        data.add(new Data(getResources().getString(R.string.w35), getResources().getString(R.string.m35)  ));
        data.add(new Data(getResources().getString(R.string.w36), getResources().getString(R.string.m36)  ));
        data.add(new Data(getResources().getString(R.string.w37), getResources().getString(R.string.m37)  ));
        data.add(new Data(getResources().getString(R.string.w38), getResources().getString(R.string.m38)  ));
        data.add(new Data(getResources().getString(R.string.w39), getResources().getString(R.string.m39)  ));
        data.add(new Data(getResources().getString(R.string.w40), getResources().getString(R.string.m40)  ));
        data.add(new Data(getResources().getString(R.string.w41), getResources().getString(R.string.m41)  ));
        data.add(new Data(getResources().getString(R.string.w42), getResources().getString(R.string.m42)  ));
        data.add(new Data(getResources().getString(R.string.w43), getResources().getString(R.string.m43)  ));
        data.add(new Data(getResources().getString(R.string.w44), getResources().getString(R.string.m44)  ));
        data.add(new Data(getResources().getString(R.string.w45), getResources().getString(R.string.m45)  ));
        data.add(new Data(getResources().getString(R.string.w46), getResources().getString(R.string.m46)  ));
        data.add(new Data(getResources().getString(R.string.w47), getResources().getString(R.string.m47)  ));
        data.add(new Data(getResources().getString(R.string.w48), getResources().getString(R.string.m48)  ));
        data.add(new Data(getResources().getString(R.string.w49), getResources().getString(R.string.m49)  ));
        data.add(new Data(getResources().getString(R.string.w50), getResources().getString(R.string.m50)  ));
        data.add(new Data(getResources().getString(R.string.w51), getResources().getString(R.string.m51)  ));
        data.add(new Data(getResources().getString(R.string.w52), getResources().getString(R.string.m52)  ));
        data.add(new Data(getResources().getString(R.string.w53), getResources().getString(R.string.m53)  ));
        data.add(new Data(getResources().getString(R.string.w54), getResources().getString(R.string.m54)  ));
        data.add(new Data(getResources().getString(R.string.w55), getResources().getString(R.string.m55)  ));
        data.add(new Data(getResources().getString(R.string.w56), getResources().getString(R.string.m56)  ));
        data.add(new Data(getResources().getString(R.string.w57), getResources().getString(R.string.m57)  ));
        data.add(new Data(getResources().getString(R.string.w58), getResources().getString(R.string.m58)  ));
        data.add(new Data(getResources().getString(R.string.w59), getResources().getString(R.string.m59)  ));
        data.add(new Data(getResources().getString(R.string.w60), getResources().getString(R.string.m60)  ));
        data.add(new Data(getResources().getString(R.string.w61), getResources().getString(R.string.m61)  ));
        data.add(new Data(getResources().getString(R.string.w62), getResources().getString(R.string.m62)  ));
        data.add(new Data(getResources().getString(R.string.w63), getResources().getString(R.string.m63)  ));
        data.add(new Data(getResources().getString(R.string.w64), getResources().getString(R.string.m64)  ));
        data.add(new Data(getResources().getString(R.string.w65), getResources().getString(R.string.m65)  ));
        data.add(new Data(getResources().getString(R.string.w66), getResources().getString(R.string.m66)  ));
        data.add(new Data(getResources().getString(R.string.w67), getResources().getString(R.string.m67)  ));
        data.add(new Data(getResources().getString(R.string.w68), getResources().getString(R.string.m68)  ));
        data.add(new Data(getResources().getString(R.string.w69), getResources().getString(R.string.m69)  ));
        data.add(new Data(getResources().getString(R.string.w70), getResources().getString(R.string.m70)  ));
        data.add(new Data(getResources().getString(R.string.w71), getResources().getString(R.string.m71)  ));
        data.add(new Data(getResources().getString(R.string.w72), getResources().getString(R.string.m72)  ));
        data.add(new Data(getResources().getString(R.string.w73), getResources().getString(R.string.m73)  ));
        data.add(new Data(getResources().getString(R.string.w74), getResources().getString(R.string.m74)  ));
        data.add(new Data(getResources().getString(R.string.w75), getResources().getString(R.string.m75)  ));
        data.add(new Data(getResources().getString(R.string.w76), getResources().getString(R.string.m76)  ));
        data.add(new Data(getResources().getString(R.string.w77), getResources().getString(R.string.m77)  ));
        data.add(new Data(getResources().getString(R.string.w78), getResources().getString(R.string.m78)  ));
        data.add(new Data(getResources().getString(R.string.w79), getResources().getString(R.string.m79)  ));
        data.add(new Data(getResources().getString(R.string.w80), getResources().getString(R.string.m80)  ));
        data.add(new Data(getResources().getString(R.string.w81), getResources().getString(R.string.m81)  ));
        return data;
    }

}
