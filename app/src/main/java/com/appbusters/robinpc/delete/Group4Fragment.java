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
public class Group4Fragment extends Fragment {

    private RecyclerView recyclerview1;
    private RecyclerView.LayoutManager mLayoutManager;


    public Group4Fragment() {
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
        data.add(new Data(getResources().getString(R.string.w614), getResources().getString(R.string.m614)  ));
        data.add(new Data(getResources().getString(R.string.w615), getResources().getString(R.string.m615)  ));
        data.add(new Data(getResources().getString(R.string.w616), getResources().getString(R.string.m616)  ));
        data.add(new Data(getResources().getString(R.string.w617), getResources().getString(R.string.m617)  ));
        data.add(new Data(getResources().getString(R.string.w618), getResources().getString(R.string.m618)  ));
        data.add(new Data(getResources().getString(R.string.w619), getResources().getString(R.string.m619)  ));
        data.add(new Data(getResources().getString(R.string.w620), getResources().getString(R.string.m620)  ));
        data.add(new Data(getResources().getString(R.string.w621), getResources().getString(R.string.m621)  ));
        data.add(new Data(getResources().getString(R.string.w622), getResources().getString(R.string.m622)  ));
        data.add(new Data(getResources().getString(R.string.w623), getResources().getString(R.string.m623)  ));
        data.add(new Data(getResources().getString(R.string.w624), getResources().getString(R.string.m624)  ));
        data.add(new Data(getResources().getString(R.string.w625), getResources().getString(R.string.m625)  ));
        data.add(new Data(getResources().getString(R.string.w626), getResources().getString(R.string.m626)  ));
        data.add(new Data(getResources().getString(R.string.w627), getResources().getString(R.string.m627)  ));
        data.add(new Data(getResources().getString(R.string.w628), getResources().getString(R.string.m628)  ));
        data.add(new Data(getResources().getString(R.string.w629), getResources().getString(R.string.m629)  ));
        data.add(new Data(getResources().getString(R.string.w630), getResources().getString(R.string.m630)  ));
        data.add(new Data(getResources().getString(R.string.w631), getResources().getString(R.string.m631)  ));
        data.add(new Data(getResources().getString(R.string.w632), getResources().getString(R.string.m632)  ));
        data.add(new Data(getResources().getString(R.string.w633), getResources().getString(R.string.m633)  ));
        data.add(new Data(getResources().getString(R.string.w634), getResources().getString(R.string.m634)  ));
        data.add(new Data(getResources().getString(R.string.w635), getResources().getString(R.string.m635)  ));
        data.add(new Data(getResources().getString(R.string.w636), getResources().getString(R.string.m636)  ));
        data.add(new Data(getResources().getString(R.string.w637), getResources().getString(R.string.m637)  ));
        data.add(new Data(getResources().getString(R.string.w638), getResources().getString(R.string.m638)  ));
        data.add(new Data(getResources().getString(R.string.w639), getResources().getString(R.string.m639)  ));
        data.add(new Data(getResources().getString(R.string.w640), getResources().getString(R.string.m640)  ));
        data.add(new Data(getResources().getString(R.string.w641), getResources().getString(R.string.m641)  ));
        data.add(new Data(getResources().getString(R.string.w642), getResources().getString(R.string.m642)  ));
        data.add(new Data(getResources().getString(R.string.w643), getResources().getString(R.string.m643)  ));
        data.add(new Data(getResources().getString(R.string.w644), getResources().getString(R.string.m644)  ));
        data.add(new Data(getResources().getString(R.string.w645), getResources().getString(R.string.m645)  ));
        data.add(new Data(getResources().getString(R.string.w646), getResources().getString(R.string.m646)  ));
        data.add(new Data(getResources().getString(R.string.w647), getResources().getString(R.string.m647)  ));
        data.add(new Data(getResources().getString(R.string.w648), getResources().getString(R.string.m648)  ));
        data.add(new Data(getResources().getString(R.string.w649), getResources().getString(R.string.m649)  ));
        data.add(new Data(getResources().getString(R.string.w650), getResources().getString(R.string.m650)  ));
        data.add(new Data(getResources().getString(R.string.w651), getResources().getString(R.string.m651)  ));
        data.add(new Data(getResources().getString(R.string.w652), getResources().getString(R.string.m652)  ));
        data.add(new Data(getResources().getString(R.string.w653), getResources().getString(R.string.m653)  ));
        data.add(new Data(getResources().getString(R.string.w654), getResources().getString(R.string.m654)  ));
        data.add(new Data(getResources().getString(R.string.w655), getResources().getString(R.string.m655)  ));
        data.add(new Data(getResources().getString(R.string.w656), getResources().getString(R.string.m656)  ));
        data.add(new Data(getResources().getString(R.string.w657), getResources().getString(R.string.m657)  ));
        data.add(new Data(getResources().getString(R.string.w658), getResources().getString(R.string.m658)  ));
        data.add(new Data(getResources().getString(R.string.w659), getResources().getString(R.string.m659)  ));
        data.add(new Data(getResources().getString(R.string.w660), getResources().getString(R.string.m660)  ));
        data.add(new Data(getResources().getString(R.string.w661), getResources().getString(R.string.m661)  ));
        data.add(new Data(getResources().getString(R.string.w662), getResources().getString(R.string.m662)  ));
        data.add(new Data(getResources().getString(R.string.w663), getResources().getString(R.string.m663)  ));
        data.add(new Data(getResources().getString(R.string.w664), getResources().getString(R.string.m664)  ));
        data.add(new Data(getResources().getString(R.string.w665), getResources().getString(R.string.m665)  ));
        data.add(new Data(getResources().getString(R.string.w666), getResources().getString(R.string.m666)  ));
        data.add(new Data(getResources().getString(R.string.w667), getResources().getString(R.string.m667)  ));
        data.add(new Data(getResources().getString(R.string.w668), getResources().getString(R.string.m668)  ));
        data.add(new Data(getResources().getString(R.string.w669), getResources().getString(R.string.m669)  ));
        data.add(new Data(getResources().getString(R.string.w670), getResources().getString(R.string.m670)  ));
        data.add(new Data(getResources().getString(R.string.w671), getResources().getString(R.string.m671)  ));
        data.add(new Data(getResources().getString(R.string.w672), getResources().getString(R.string.m672)  ));
        data.add(new Data(getResources().getString(R.string.w673), getResources().getString(R.string.m673)  ));
        data.add(new Data(getResources().getString(R.string.w674), getResources().getString(R.string.m674)  ));
        data.add(new Data(getResources().getString(R.string.w675), getResources().getString(R.string.m675)  ));
        data.add(new Data(getResources().getString(R.string.w676), getResources().getString(R.string.m676)  ));
        data.add(new Data(getResources().getString(R.string.w677), getResources().getString(R.string.m677)  ));
        data.add(new Data(getResources().getString(R.string.w678), getResources().getString(R.string.m678)  ));
        data.add(new Data(getResources().getString(R.string.w679), getResources().getString(R.string.m679)  ));
        data.add(new Data(getResources().getString(R.string.w680), getResources().getString(R.string.m680)  ));
        data.add(new Data(getResources().getString(R.string.w681), getResources().getString(R.string.m681)  ));
        data.add(new Data(getResources().getString(R.string.w682), getResources().getString(R.string.m682)  ));
        data.add(new Data(getResources().getString(R.string.w683), getResources().getString(R.string.m683)  ));
        data.add(new Data(getResources().getString(R.string.w684), getResources().getString(R.string.m684)  ));
        data.add(new Data(getResources().getString(R.string.w685), getResources().getString(R.string.m685)  ));
        data.add(new Data(getResources().getString(R.string.w686), getResources().getString(R.string.m686)  ));
        data.add(new Data(getResources().getString(R.string.w687), getResources().getString(R.string.m687)  ));
        data.add(new Data(getResources().getString(R.string.w688), getResources().getString(R.string.m688)  ));
        data.add(new Data(getResources().getString(R.string.w689), getResources().getString(R.string.m689)  ));
        data.add(new Data(getResources().getString(R.string.w690), getResources().getString(R.string.m690)  ));
        data.add(new Data(getResources().getString(R.string.w691), getResources().getString(R.string.m691)  ));
        data.add(new Data(getResources().getString(R.string.w692), getResources().getString(R.string.m692)  ));
        data.add(new Data(getResources().getString(R.string.w693), getResources().getString(R.string.m693)  ));
        data.add(new Data(getResources().getString(R.string.w694), getResources().getString(R.string.m694)  ));
        data.add(new Data(getResources().getString(R.string.w695), getResources().getString(R.string.m695)  ));
        data.add(new Data(getResources().getString(R.string.w696), getResources().getString(R.string.m696)  ));
        data.add(new Data(getResources().getString(R.string.w697), getResources().getString(R.string.m697)  ));
        data.add(new Data(getResources().getString(R.string.w698), getResources().getString(R.string.m698)  ));
        data.add(new Data(getResources().getString(R.string.w699), getResources().getString(R.string.m699)  ));
        data.add(new Data(getResources().getString(R.string.w700), getResources().getString(R.string.m700)  ));
        data.add(new Data(getResources().getString(R.string.w701), getResources().getString(R.string.m701)  ));
        data.add(new Data(getResources().getString(R.string.w702), getResources().getString(R.string.m702)  ));
        data.add(new Data(getResources().getString(R.string.w703), getResources().getString(R.string.m703)  ));
        data.add(new Data(getResources().getString(R.string.w704), getResources().getString(R.string.m704)  ));
        data.add(new Data(getResources().getString(R.string.w705), getResources().getString(R.string.m705)  ));
        data.add(new Data(getResources().getString(R.string.w706), getResources().getString(R.string.m746)  ));
        data.add(new Data(getResources().getString(R.string.w707), getResources().getString(R.string.m707)  ));
        data.add(new Data(getResources().getString(R.string.w708), getResources().getString(R.string.m708)  ));
        data.add(new Data(getResources().getString(R.string.w709), getResources().getString(R.string.m709)  ));
        data.add(new Data(getResources().getString(R.string.w710), getResources().getString(R.string.m710)  ));
        data.add(new Data(getResources().getString(R.string.w711), getResources().getString(R.string.m711)  ));
        data.add(new Data(getResources().getString(R.string.w712), getResources().getString(R.string.m712)  ));
        data.add(new Data(getResources().getString(R.string.w713), getResources().getString(R.string.m713)  ));
        data.add(new Data(getResources().getString(R.string.w714), getResources().getString(R.string.m714)  ));
        data.add(new Data(getResources().getString(R.string.w715), getResources().getString(R.string.m715)  ));
        data.add(new Data(getResources().getString(R.string.w716), getResources().getString(R.string.m716)  ));
        data.add(new Data(getResources().getString(R.string.w717), getResources().getString(R.string.m717)  ));
        data.add(new Data(getResources().getString(R.string.w718), getResources().getString(R.string.m718)  ));
        data.add(new Data(getResources().getString(R.string.w719), getResources().getString(R.string.m719)  ));
        data.add(new Data(getResources().getString(R.string.w720), getResources().getString(R.string.m720)  ));
        data.add(new Data(getResources().getString(R.string.w721), getResources().getString(R.string.m721)  ));
        data.add(new Data(getResources().getString(R.string.w722), getResources().getString(R.string.m722)  ));
        data.add(new Data(getResources().getString(R.string.w723), getResources().getString(R.string.m723)  ));
        data.add(new Data(getResources().getString(R.string.w724), getResources().getString(R.string.m724)  ));
        data.add(new Data(getResources().getString(R.string.w725), getResources().getString(R.string.m725)  ));
        data.add(new Data(getResources().getString(R.string.w726), getResources().getString(R.string.m726)  ));
        data.add(new Data(getResources().getString(R.string.w727), getResources().getString(R.string.m727)  ));
        data.add(new Data(getResources().getString(R.string.w728), getResources().getString(R.string.m728)  ));
        data.add(new Data(getResources().getString(R.string.w729), getResources().getString(R.string.m729)  ));
        data.add(new Data(getResources().getString(R.string.w730), getResources().getString(R.string.m730)  ));
        data.add(new Data(getResources().getString(R.string.w731), getResources().getString(R.string.m731)  ));
        data.add(new Data(getResources().getString(R.string.w732), getResources().getString(R.string.m732)  ));
        data.add(new Data(getResources().getString(R.string.w733), getResources().getString(R.string.m733)  ));
        data.add(new Data(getResources().getString(R.string.w734), getResources().getString(R.string.m734)  ));
        data.add(new Data(getResources().getString(R.string.w735), getResources().getString(R.string.m735)  ));
        data.add(new Data(getResources().getString(R.string.w736), getResources().getString(R.string.m736)  ));
        data.add(new Data(getResources().getString(R.string.w737), getResources().getString(R.string.m737)  ));
        data.add(new Data(getResources().getString(R.string.w738), getResources().getString(R.string.m738)  ));
        data.add(new Data(getResources().getString(R.string.w739), getResources().getString(R.string.m739)  ));
        data.add(new Data(getResources().getString(R.string.w740), getResources().getString(R.string.m740)  ));
        data.add(new Data(getResources().getString(R.string.w741), getResources().getString(R.string.m741)  ));
        data.add(new Data(getResources().getString(R.string.w742), getResources().getString(R.string.m742)  ));
        data.add(new Data(getResources().getString(R.string.w743), getResources().getString(R.string.m743)  ));
        data.add(new Data(getResources().getString(R.string.w744), getResources().getString(R.string.m744)  ));
        data.add(new Data(getResources().getString(R.string.w745), getResources().getString(R.string.m745)  ));
        data.add(new Data(getResources().getString(R.string.w746), getResources().getString(R.string.m746)  ));
        data.add(new Data(getResources().getString(R.string.w747), getResources().getString(R.string.m747)  ));
        data.add(new Data(getResources().getString(R.string.w748), getResources().getString(R.string.m748)  ));
        data.add(new Data(getResources().getString(R.string.w749), getResources().getString(R.string.m749)  ));
        data.add(new Data(getResources().getString(R.string.w750), getResources().getString(R.string.m750)  ));
        data.add(new Data(getResources().getString(R.string.w751), getResources().getString(R.string.m751)  ));
        data.add(new Data(getResources().getString(R.string.w752), getResources().getString(R.string.m752)  ));
        data.add(new Data(getResources().getString(R.string.w753), getResources().getString(R.string.m753)  ));
        data.add(new Data(getResources().getString(R.string.w754), getResources().getString(R.string.m754)  ));
        data.add(new Data(getResources().getString(R.string.w755), getResources().getString(R.string.m755)  ));
        data.add(new Data(getResources().getString(R.string.w756), getResources().getString(R.string.m756)  ));
        data.add(new Data(getResources().getString(R.string.w757), getResources().getString(R.string.m757)  ));
        data.add(new Data(getResources().getString(R.string.w758), getResources().getString(R.string.m758)  ));
        data.add(new Data(getResources().getString(R.string.w759), getResources().getString(R.string.m759)  ));
        data.add(new Data(getResources().getString(R.string.w760), getResources().getString(R.string.m760)  ));
        data.add(new Data(getResources().getString(R.string.w761), getResources().getString(R.string.m761)  ));
        data.add(new Data(getResources().getString(R.string.w762), getResources().getString(R.string.m762)  ));
        data.add(new Data(getResources().getString(R.string.w763), getResources().getString(R.string.m763)  ));
        data.add(new Data(getResources().getString(R.string.w764), getResources().getString(R.string.m764)  ));
        data.add(new Data(getResources().getString(R.string.w765), getResources().getString(R.string.m765)  ));
        data.add(new Data(getResources().getString(R.string.w766), getResources().getString(R.string.m766)  ));
        data.add(new Data(getResources().getString(R.string.w767), getResources().getString(R.string.m767)  ));
        data.add(new Data(getResources().getString(R.string.w768), getResources().getString(R.string.m768)  ));
        data.add(new Data(getResources().getString(R.string.w769), getResources().getString(R.string.m769)  ));
        data.add(new Data(getResources().getString(R.string.w770), getResources().getString(R.string.m770)  ));
        data.add(new Data(getResources().getString(R.string.w771), getResources().getString(R.string.m771)  ));
        data.add(new Data(getResources().getString(R.string.w772), getResources().getString(R.string.m772)  ));
        data.add(new Data(getResources().getString(R.string.w773), getResources().getString(R.string.m773)  ));
        data.add(new Data(getResources().getString(R.string.w774), getResources().getString(R.string.m774)  ));
        data.add(new Data(getResources().getString(R.string.w775), getResources().getString(R.string.m775)  ));
        data.add(new Data(getResources().getString(R.string.w776), getResources().getString(R.string.m776)  ));
        data.add(new Data(getResources().getString(R.string.w777), getResources().getString(R.string.m777)  ));
        data.add(new Data(getResources().getString(R.string.w778), getResources().getString(R.string.m778)  ));
        data.add(new Data(getResources().getString(R.string.w779), getResources().getString(R.string.m779)  ));
        data.add(new Data(getResources().getString(R.string.w780), getResources().getString(R.string.m780)  ));
        data.add(new Data(getResources().getString(R.string.w781), getResources().getString(R.string.m781)  ));
        data.add(new Data(getResources().getString(R.string.w782), getResources().getString(R.string.m782)  ));
        data.add(new Data(getResources().getString(R.string.w783), getResources().getString(R.string.m783)  ));
        data.add(new Data(getResources().getString(R.string.w784), getResources().getString(R.string.m784)  ));
        data.add(new Data(getResources().getString(R.string.w785), getResources().getString(R.string.m785)  ));
        data.add(new Data(getResources().getString(R.string.w786), getResources().getString(R.string.m786)  ));
        data.add(new Data(getResources().getString(R.string.w787), getResources().getString(R.string.m787)  ));
        data.add(new Data(getResources().getString(R.string.w788), getResources().getString(R.string.m788)  ));
        data.add(new Data(getResources().getString(R.string.w789), getResources().getString(R.string.m789)  ));
        data.add(new Data(getResources().getString(R.string.w790), getResources().getString(R.string.m790)  ));
        data.add(new Data(getResources().getString(R.string.w791), getResources().getString(R.string.m791)  ));
        data.add(new Data(getResources().getString(R.string.w792), getResources().getString(R.string.m792)  ));
        data.add(new Data(getResources().getString(R.string.w793), getResources().getString(R.string.m793)  ));
        data.add(new Data(getResources().getString(R.string.w794), getResources().getString(R.string.m794)  ));
        data.add(new Data(getResources().getString(R.string.w795), getResources().getString(R.string.m795)  ));
        data.add(new Data(getResources().getString(R.string.w796), getResources().getString(R.string.m796)  ));
        data.add(new Data(getResources().getString(R.string.w797), getResources().getString(R.string.m797)  ));
        data.add(new Data(getResources().getString(R.string.w798), getResources().getString(R.string.m798)  ));
        data.add(new Data(getResources().getString(R.string.w799), getResources().getString(R.string.m799)  ));
        data.add(new Data(getResources().getString(R.string.w800), getResources().getString(R.string.m800)  ));

        return data;
    }

}
