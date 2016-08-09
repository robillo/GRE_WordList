package com.appbusters.robinpc.delete;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
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
public class Group1Fragment extends Fragment {

    private RecyclerView recyclerview1;
    private RecyclerView.LayoutManager mLayoutManager;

    public Group1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_group1, container, false);
        List<Data> data = fill_with_data();

        recyclerview1 = (RecyclerView) v.findViewById(R.id.recyclerview1);
        recyclerview1.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerview1.setLayoutManager(mLayoutManager);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getActivity().getApplication());
        recyclerview1.setAdapter(adapter);

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
        data.add(new Data(getResources().getString(R.string.w105), getResources().getString(R.string.m105)  ));
        data.add(new Data(getResources().getString(R.string.w106), getResources().getString(R.string.m106)  ));
        data.add(new Data(getResources().getString(R.string.w107), getResources().getString(R.string.m107)  ));
        data.add(new Data(getResources().getString(R.string.w108), getResources().getString(R.string.m108)  ));
        data.add(new Data(getResources().getString(R.string.w109), getResources().getString(R.string.m109)  ));
        data.add(new Data(getResources().getString(R.string.w110), getResources().getString(R.string.m110)  ));
        data.add(new Data(getResources().getString(R.string.w111), getResources().getString(R.string.m111)  ));
        data.add(new Data(getResources().getString(R.string.w112), getResources().getString(R.string.m112)  ));
        data.add(new Data(getResources().getString(R.string.w113), getResources().getString(R.string.m113)  ));
        data.add(new Data(getResources().getString(R.string.w114), getResources().getString(R.string.m114)  ));
        data.add(new Data(getResources().getString(R.string.w115), getResources().getString(R.string.m115)  ));
        data.add(new Data(getResources().getString(R.string.w116), getResources().getString(R.string.m116)  ));
        data.add(new Data(getResources().getString(R.string.w117), getResources().getString(R.string.m117)  ));
        data.add(new Data(getResources().getString(R.string.w118), getResources().getString(R.string.m118)  ));
        data.add(new Data(getResources().getString(R.string.w119), getResources().getString(R.string.m119)  ));
        data.add(new Data(getResources().getString(R.string.w120), getResources().getString(R.string.m120)  ));
        data.add(new Data(getResources().getString(R.string.w121), getResources().getString(R.string.m121)  ));
        data.add(new Data(getResources().getString(R.string.w122), getResources().getString(R.string.m122)  ));
        data.add(new Data(getResources().getString(R.string.w123), getResources().getString(R.string.m123)  ));
        data.add(new Data(getResources().getString(R.string.w124), getResources().getString(R.string.m124)  ));
        data.add(new Data(getResources().getString(R.string.w125), getResources().getString(R.string.m125)  ));
        data.add(new Data(getResources().getString(R.string.w126), getResources().getString(R.string.m126)  ));
        data.add(new Data(getResources().getString(R.string.w127), getResources().getString(R.string.m127)  ));
        data.add(new Data(getResources().getString(R.string.w128), getResources().getString(R.string.m128)  ));
        data.add(new Data(getResources().getString(R.string.w129), getResources().getString(R.string.m129)  ));
        data.add(new Data(getResources().getString(R.string.w130), getResources().getString(R.string.m130)  ));
        data.add(new Data(getResources().getString(R.string.w131), getResources().getString(R.string.m131)  ));
        data.add(new Data(getResources().getString(R.string.w132), getResources().getString(R.string.m132)  ));
        data.add(new Data(getResources().getString(R.string.w133), getResources().getString(R.string.m133)  ));
        data.add(new Data(getResources().getString(R.string.w134), getResources().getString(R.string.m134)  ));
        data.add(new Data(getResources().getString(R.string.w135), getResources().getString(R.string.m135)  ));
        data.add(new Data(getResources().getString(R.string.w136), getResources().getString(R.string.m136)  ));
        data.add(new Data(getResources().getString(R.string.w137), getResources().getString(R.string.m137)  ));
        data.add(new Data(getResources().getString(R.string.w138), getResources().getString(R.string.m138)  ));
        data.add(new Data(getResources().getString(R.string.w139), getResources().getString(R.string.m139)  ));
        data.add(new Data(getResources().getString(R.string.w140), getResources().getString(R.string.m140)  ));
        data.add(new Data(getResources().getString(R.string.w141), getResources().getString(R.string.m141)  ));
        data.add(new Data(getResources().getString(R.string.w142), getResources().getString(R.string.m142)  ));
        data.add(new Data(getResources().getString(R.string.w143), getResources().getString(R.string.m143)  ));
        data.add(new Data(getResources().getString(R.string.w144), getResources().getString(R.string.m144)  ));
        data.add(new Data(getResources().getString(R.string.w145), getResources().getString(R.string.m145)  ));
        data.add(new Data(getResources().getString(R.string.w146), getResources().getString(R.string.m146)  ));
        data.add(new Data(getResources().getString(R.string.w147), getResources().getString(R.string.m147)  ));
        data.add(new Data(getResources().getString(R.string.w148), getResources().getString(R.string.m148)  ));
        data.add(new Data(getResources().getString(R.string.w149), getResources().getString(R.string.m149)  ));
        data.add(new Data(getResources().getString(R.string.w150), getResources().getString(R.string.m150)  ));
        data.add(new Data(getResources().getString(R.string.w151), getResources().getString(R.string.m151)  ));
        data.add(new Data(getResources().getString(R.string.w152), getResources().getString(R.string.m152)  ));
        data.add(new Data(getResources().getString(R.string.w153), getResources().getString(R.string.m153)  ));
        data.add(new Data(getResources().getString(R.string.w154), getResources().getString(R.string.m154)  ));
        data.add(new Data(getResources().getString(R.string.w155), getResources().getString(R.string.m155)  ));
        data.add(new Data(getResources().getString(R.string.w156), getResources().getString(R.string.m156)  ));
        data.add(new Data(getResources().getString(R.string.w157), getResources().getString(R.string.m157)  ));
        data.add(new Data(getResources().getString(R.string.w158), getResources().getString(R.string.m158)  ));
        data.add(new Data(getResources().getString(R.string.w159), getResources().getString(R.string.m159)  ));
        data.add(new Data(getResources().getString(R.string.w160), getResources().getString(R.string.m160)  ));
        data.add(new Data(getResources().getString(R.string.w161), getResources().getString(R.string.m161)  ));
        data.add(new Data(getResources().getString(R.string.w162), getResources().getString(R.string.m162)  ));
        data.add(new Data(getResources().getString(R.string.w163), getResources().getString(R.string.m163)  ));
        data.add(new Data(getResources().getString(R.string.w164), getResources().getString(R.string.m164)  ));
        data.add(new Data(getResources().getString(R.string.w165), getResources().getString(R.string.m165)  ));
        data.add(new Data(getResources().getString(R.string.w166), getResources().getString(R.string.m166)  ));
        data.add(new Data(getResources().getString(R.string.w167), getResources().getString(R.string.m167)  ));
        data.add(new Data(getResources().getString(R.string.w168), getResources().getString(R.string.m168)  ));
        data.add(new Data(getResources().getString(R.string.w169), getResources().getString(R.string.m169)  ));
        data.add(new Data(getResources().getString(R.string.w170), getResources().getString(R.string.m170)  ));
        data.add(new Data(getResources().getString(R.string.w171), getResources().getString(R.string.m171)  ));
        data.add(new Data(getResources().getString(R.string.w172), getResources().getString(R.string.m172)  ));
        data.add(new Data(getResources().getString(R.string.w173), getResources().getString(R.string.m173)  ));
        data.add(new Data(getResources().getString(R.string.w174), getResources().getString(R.string.m174)  ));
        data.add(new Data(getResources().getString(R.string.w175), getResources().getString(R.string.m175)  ));
        data.add(new Data(getResources().getString(R.string.w176), getResources().getString(R.string.m176)  ));
        data.add(new Data(getResources().getString(R.string.w177), getResources().getString(R.string.m177)  ));
        data.add(new Data(getResources().getString(R.string.w178), getResources().getString(R.string.m178)  ));
        data.add(new Data(getResources().getString(R.string.w179), getResources().getString(R.string.m179)  ));
        data.add(new Data(getResources().getString(R.string.w180), getResources().getString(R.string.m180)  ));
        data.add(new Data(getResources().getString(R.string.w181), getResources().getString(R.string.m181)  ));
        data.add(new Data(getResources().getString(R.string.w182), getResources().getString(R.string.m182)  ));
        data.add(new Data(getResources().getString(R.string.w183), getResources().getString(R.string.m183)  ));
        data.add(new Data(getResources().getString(R.string.w184), getResources().getString(R.string.m184)  ));
        data.add(new Data(getResources().getString(R.string.w185), getResources().getString(R.string.m185)  ));
        data.add(new Data(getResources().getString(R.string.w186), getResources().getString(R.string.m186)  ));
        data.add(new Data(getResources().getString(R.string.w187), getResources().getString(R.string.m187)  ));
        data.add(new Data(getResources().getString(R.string.w188), getResources().getString(R.string.m188)  ));
        data.add(new Data(getResources().getString(R.string.w189), getResources().getString(R.string.m189)  ));
        data.add(new Data(getResources().getString(R.string.w190), getResources().getString(R.string.m190)  ));
        data.add(new Data(getResources().getString(R.string.w191), getResources().getString(R.string.m191)  ));
        data.add(new Data(getResources().getString(R.string.w192), getResources().getString(R.string.m192)  ));
        data.add(new Data(getResources().getString(R.string.w193), getResources().getString(R.string.m193)  ));
        data.add(new Data(getResources().getString(R.string.w194), getResources().getString(R.string.m194)  ));
        data.add(new Data(getResources().getString(R.string.w195), getResources().getString(R.string.m195)  ));
        data.add(new Data(getResources().getString(R.string.w196), getResources().getString(R.string.m196)  ));
        data.add(new Data(getResources().getString(R.string.w197), getResources().getString(R.string.m197)  ));
        data.add(new Data(getResources().getString(R.string.w198), getResources().getString(R.string.m198)  ));
        data.add(new Data(getResources().getString(R.string.w199), getResources().getString(R.string.m199)  ));
        data.add(new Data(getResources().getString(R.string.w200), getResources().getString(R.string.m200)  ));
        data.add(new Data(getResources().getString(R.string.w201), getResources().getString(R.string.m201)  ));
        data.add(new Data(getResources().getString(R.string.w202), getResources().getString(R.string.m202)  ));
        data.add(new Data(getResources().getString(R.string.w203), getResources().getString(R.string.m203)  ));
        data.add(new Data(getResources().getString(R.string.w204), getResources().getString(R.string.m204)  ));
        data.add(new Data(getResources().getString(R.string.w205), getResources().getString(R.string.m205)  ));
        data.add(new Data(getResources().getString(R.string.w206), getResources().getString(R.string.m206)  ));
        data.add(new Data(getResources().getString(R.string.w207), getResources().getString(R.string.m207)  ));
        data.add(new Data(getResources().getString(R.string.w208), getResources().getString(R.string.m208)  ));
        data.add(new Data(getResources().getString(R.string.w209), getResources().getString(R.string.m209)  ));
        data.add(new Data(getResources().getString(R.string.w210), getResources().getString(R.string.m210)  ));
        data.add(new Data(getResources().getString(R.string.w211), getResources().getString(R.string.m211)  ));
        data.add(new Data(getResources().getString(R.string.w212), getResources().getString(R.string.m212)  ));
        data.add(new Data(getResources().getString(R.string.w213), getResources().getString(R.string.m213)  ));
        data.add(new Data(getResources().getString(R.string.w214), getResources().getString(R.string.m214)  ));
        data.add(new Data(getResources().getString(R.string.w215), getResources().getString(R.string.m215)  ));
        data.add(new Data(getResources().getString(R.string.w216), getResources().getString(R.string.m216)  ));
        data.add(new Data(getResources().getString(R.string.w217), getResources().getString(R.string.m217)  ));
        data.add(new Data(getResources().getString(R.string.w218), getResources().getString(R.string.m218)  ));
        data.add(new Data(getResources().getString(R.string.w219), getResources().getString(R.string.m219)  ));
        data.add(new Data(getResources().getString(R.string.w220), getResources().getString(R.string.m220)  ));
        data.add(new Data(getResources().getString(R.string.w221), getResources().getString(R.string.m221)  ));
        data.add(new Data(getResources().getString(R.string.w222), getResources().getString(R.string.m222)  ));
        data.add(new Data(getResources().getString(R.string.w223), getResources().getString(R.string.m223)  ));
        data.add(new Data(getResources().getString(R.string.w224), getResources().getString(R.string.m224)  ));
        data.add(new Data(getResources().getString(R.string.w225), getResources().getString(R.string.m225)  ));
        data.add(new Data(getResources().getString(R.string.w226), getResources().getString(R.string.m226)  ));
        data.add(new Data(getResources().getString(R.string.w227), getResources().getString(R.string.m227)  ));
        data.add(new Data(getResources().getString(R.string.w228), getResources().getString(R.string.m228)  ));
        data.add(new Data(getResources().getString(R.string.w229), getResources().getString(R.string.m229)  ));
        data.add(new Data(getResources().getString(R.string.w230), getResources().getString(R.string.m230)  ));
        data.add(new Data(getResources().getString(R.string.w231), getResources().getString(R.string.m231)  ));
        data.add(new Data(getResources().getString(R.string.w232), getResources().getString(R.string.m232)  ));
        data.add(new Data(getResources().getString(R.string.w233), getResources().getString(R.string.m233)  ));
        data.add(new Data(getResources().getString(R.string.w234), getResources().getString(R.string.m234)  ));
        data.add(new Data(getResources().getString(R.string.w235), getResources().getString(R.string.m235)  ));
        data.add(new Data(getResources().getString(R.string.w236), getResources().getString(R.string.m236)  ));
        data.add(new Data(getResources().getString(R.string.w237), getResources().getString(R.string.m237)  ));
        data.add(new Data(getResources().getString(R.string.w238), getResources().getString(R.string.m238)  ));
        data.add(new Data(getResources().getString(R.string.w239), getResources().getString(R.string.m239)  ));
        data.add(new Data(getResources().getString(R.string.w240), getResources().getString(R.string.m240)  ));
        data.add(new Data(getResources().getString(R.string.w241), getResources().getString(R.string.m241)  ));
        data.add(new Data(getResources().getString(R.string.w242), getResources().getString(R.string.m242)  ));
        data.add(new Data(getResources().getString(R.string.w243), getResources().getString(R.string.m243)  ));
        data.add(new Data(getResources().getString(R.string.w244), getResources().getString(R.string.m244)  ));
        data.add(new Data(getResources().getString(R.string.w245), getResources().getString(R.string.m245)  ));
        data.add(new Data(getResources().getString(R.string.w246), getResources().getString(R.string.m246)  ));
        return data;
    }

}
