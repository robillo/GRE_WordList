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
public class Group3Fragment extends Fragment {

    private RecyclerView recyclerview1;
    private RecyclerView.LayoutManager mLayoutManager;


    public Group3Fragment() {
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


        data.add(new Data(getResources().getString(R.string.w442), getResources().getString(R.string.m442)  ));
        data.add(new Data(getResources().getString(R.string.w443), getResources().getString(R.string.m443)  ));
        data.add(new Data(getResources().getString(R.string.w444), getResources().getString(R.string.m444)  ));
        data.add(new Data(getResources().getString(R.string.w445), getResources().getString(R.string.m445)  ));
        data.add(new Data(getResources().getString(R.string.w446), getResources().getString(R.string.m446)  ));
        data.add(new Data(getResources().getString(R.string.w447), getResources().getString(R.string.m447)  ));
        data.add(new Data(getResources().getString(R.string.w448), getResources().getString(R.string.m448)  ));
        data.add(new Data(getResources().getString(R.string.w449), getResources().getString(R.string.m449)  ));
        data.add(new Data(getResources().getString(R.string.w450), getResources().getString(R.string.m450)  ));
        data.add(new Data(getResources().getString(R.string.w451), getResources().getString(R.string.m451)  ));
        data.add(new Data(getResources().getString(R.string.w452), getResources().getString(R.string.m452)  ));
        data.add(new Data(getResources().getString(R.string.w453), getResources().getString(R.string.m453)  ));
        data.add(new Data(getResources().getString(R.string.w454), getResources().getString(R.string.m454)  ));
        data.add(new Data(getResources().getString(R.string.w455), getResources().getString(R.string.m455)  ));
        data.add(new Data(getResources().getString(R.string.w456), getResources().getString(R.string.m456)  ));
        data.add(new Data(getResources().getString(R.string.w457), getResources().getString(R.string.m457)  ));
        data.add(new Data(getResources().getString(R.string.w458), getResources().getString(R.string.m458)  ));
        data.add(new Data(getResources().getString(R.string.w459), getResources().getString(R.string.m459)  ));
        data.add(new Data(getResources().getString(R.string.w460), getResources().getString(R.string.m460)  ));
        data.add(new Data(getResources().getString(R.string.w461), getResources().getString(R.string.m461)  ));
        data.add(new Data(getResources().getString(R.string.w462), getResources().getString(R.string.m462)  ));
        data.add(new Data(getResources().getString(R.string.w463), getResources().getString(R.string.m463)  ));
        data.add(new Data(getResources().getString(R.string.w464), getResources().getString(R.string.m464)  ));
        data.add(new Data(getResources().getString(R.string.w465), getResources().getString(R.string.m465)  ));
        data.add(new Data(getResources().getString(R.string.w466), getResources().getString(R.string.m466)  ));
        data.add(new Data(getResources().getString(R.string.w467), getResources().getString(R.string.m467)  ));
        data.add(new Data(getResources().getString(R.string.w468), getResources().getString(R.string.m468)  ));
        data.add(new Data(getResources().getString(R.string.w469), getResources().getString(R.string.m469)  ));
        data.add(new Data(getResources().getString(R.string.w470), getResources().getString(R.string.m470)  ));
        data.add(new Data(getResources().getString(R.string.w471), getResources().getString(R.string.m471)  ));
        data.add(new Data(getResources().getString(R.string.w472), getResources().getString(R.string.m472)  ));
        data.add(new Data(getResources().getString(R.string.w473), getResources().getString(R.string.m473)  ));
        data.add(new Data(getResources().getString(R.string.w474), getResources().getString(R.string.m474)  ));
        data.add(new Data(getResources().getString(R.string.w475), getResources().getString(R.string.m475)  ));
        data.add(new Data(getResources().getString(R.string.w476), getResources().getString(R.string.m476)  ));
        data.add(new Data(getResources().getString(R.string.w477), getResources().getString(R.string.m477)  ));
        data.add(new Data(getResources().getString(R.string.w478), getResources().getString(R.string.m478)  ));
        data.add(new Data(getResources().getString(R.string.w479), getResources().getString(R.string.m479)  ));
        data.add(new Data(getResources().getString(R.string.w480), getResources().getString(R.string.m480)  ));
        data.add(new Data(getResources().getString(R.string.w481), getResources().getString(R.string.m481)  ));
        data.add(new Data(getResources().getString(R.string.w482), getResources().getString(R.string.m482)  ));
        data.add(new Data(getResources().getString(R.string.w483), getResources().getString(R.string.m483)  ));
        data.add(new Data(getResources().getString(R.string.w484), getResources().getString(R.string.m484)  ));
        data.add(new Data(getResources().getString(R.string.w485), getResources().getString(R.string.m485)  ));
        data.add(new Data(getResources().getString(R.string.w486), getResources().getString(R.string.m486)  ));
        data.add(new Data(getResources().getString(R.string.w487), getResources().getString(R.string.m487)  ));
        data.add(new Data(getResources().getString(R.string.w488), getResources().getString(R.string.m488)  ));
        data.add(new Data(getResources().getString(R.string.w489), getResources().getString(R.string.m489)  ));
        data.add(new Data(getResources().getString(R.string.w490), getResources().getString(R.string.m490)  ));
        data.add(new Data(getResources().getString(R.string.w491), getResources().getString(R.string.m491)  ));
        data.add(new Data(getResources().getString(R.string.w492), getResources().getString(R.string.m492)  ));
        data.add(new Data(getResources().getString(R.string.w493), getResources().getString(R.string.m493)  ));
        data.add(new Data(getResources().getString(R.string.w494), getResources().getString(R.string.m494)  ));
        data.add(new Data(getResources().getString(R.string.w495), getResources().getString(R.string.m495)  ));
        data.add(new Data(getResources().getString(R.string.w496), getResources().getString(R.string.m496)  ));
        data.add(new Data(getResources().getString(R.string.w497), getResources().getString(R.string.m497)  ));
        data.add(new Data(getResources().getString(R.string.w498), getResources().getString(R.string.m498)  ));
        data.add(new Data(getResources().getString(R.string.w499), getResources().getString(R.string.m499)  ));
        data.add(new Data(getResources().getString(R.string.w500), getResources().getString(R.string.m500)  ));
        data.add(new Data(getResources().getString(R.string.w501), getResources().getString(R.string.m501)  ));
        data.add(new Data(getResources().getString(R.string.w502), getResources().getString(R.string.m502)  ));
        data.add(new Data(getResources().getString(R.string.w503), getResources().getString(R.string.m503)  ));
        data.add(new Data(getResources().getString(R.string.w504), getResources().getString(R.string.m504)  ));
        data.add(new Data(getResources().getString(R.string.w505), getResources().getString(R.string.m505)  ));
        data.add(new Data(getResources().getString(R.string.w506), getResources().getString(R.string.m506)  ));
        data.add(new Data(getResources().getString(R.string.w507), getResources().getString(R.string.m507)  ));
        data.add(new Data(getResources().getString(R.string.w508), getResources().getString(R.string.m508)  ));
        data.add(new Data(getResources().getString(R.string.w509), getResources().getString(R.string.m509)  ));
        data.add(new Data(getResources().getString(R.string.w510), getResources().getString(R.string.m510)  ));
        data.add(new Data(getResources().getString(R.string.w511), getResources().getString(R.string.m511)  ));
        data.add(new Data(getResources().getString(R.string.w512), getResources().getString(R.string.m512)  ));
        data.add(new Data(getResources().getString(R.string.w513), getResources().getString(R.string.m513)  ));
        data.add(new Data(getResources().getString(R.string.w514), getResources().getString(R.string.m514)  ));
        data.add(new Data(getResources().getString(R.string.w515), getResources().getString(R.string.m515)  ));
        data.add(new Data(getResources().getString(R.string.w516), getResources().getString(R.string.m516)  ));
        data.add(new Data(getResources().getString(R.string.w517), getResources().getString(R.string.m517)  ));
        data.add(new Data(getResources().getString(R.string.w518), getResources().getString(R.string.m518)  ));
        data.add(new Data(getResources().getString(R.string.w519), getResources().getString(R.string.m519)  ));
        data.add(new Data(getResources().getString(R.string.w520), getResources().getString(R.string.m520)  ));
        data.add(new Data(getResources().getString(R.string.w521), getResources().getString(R.string.m521)  ));
        data.add(new Data(getResources().getString(R.string.w522), getResources().getString(R.string.m522)  ));
        data.add(new Data(getResources().getString(R.string.w523), getResources().getString(R.string.m523)  ));
        data.add(new Data(getResources().getString(R.string.w524), getResources().getString(R.string.m524)  ));
        data.add(new Data(getResources().getString(R.string.w525), getResources().getString(R.string.m525)  ));
        data.add(new Data(getResources().getString(R.string.w526), getResources().getString(R.string.m526)  ));
        data.add(new Data(getResources().getString(R.string.w527), getResources().getString(R.string.m527)  ));
        data.add(new Data(getResources().getString(R.string.w528), getResources().getString(R.string.m528)  ));
        data.add(new Data(getResources().getString(R.string.w529), getResources().getString(R.string.m529)  ));
        data.add(new Data(getResources().getString(R.string.w530), getResources().getString(R.string.m530)  ));
        data.add(new Data(getResources().getString(R.string.w531), getResources().getString(R.string.m531)  ));
        data.add(new Data(getResources().getString(R.string.w532), getResources().getString(R.string.m532)  ));
        data.add(new Data(getResources().getString(R.string.w533), getResources().getString(R.string.m533)  ));
        data.add(new Data(getResources().getString(R.string.w534), getResources().getString(R.string.m534)  ));
        data.add(new Data(getResources().getString(R.string.w535), getResources().getString(R.string.m535)  ));
        data.add(new Data(getResources().getString(R.string.w536), getResources().getString(R.string.m536)  ));
        data.add(new Data(getResources().getString(R.string.w537), getResources().getString(R.string.m537)  ));
        data.add(new Data(getResources().getString(R.string.w538), getResources().getString(R.string.m538)  ));
        data.add(new Data(getResources().getString(R.string.w539), getResources().getString(R.string.m539)  ));
        data.add(new Data(getResources().getString(R.string.w540), getResources().getString(R.string.m540)  ));
        data.add(new Data(getResources().getString(R.string.w541), getResources().getString(R.string.m541)  ));
        data.add(new Data(getResources().getString(R.string.w542), getResources().getString(R.string.m542)  ));
        data.add(new Data(getResources().getString(R.string.w543), getResources().getString(R.string.m543)  ));
        data.add(new Data(getResources().getString(R.string.w544), getResources().getString(R.string.m544)  ));
        data.add(new Data(getResources().getString(R.string.w545), getResources().getString(R.string.m545)  ));
        data.add(new Data(getResources().getString(R.string.w546), getResources().getString(R.string.m546)  ));
        data.add(new Data(getResources().getString(R.string.w547), getResources().getString(R.string.m547)  ));
        data.add(new Data(getResources().getString(R.string.w548), getResources().getString(R.string.m548)  ));
        data.add(new Data(getResources().getString(R.string.w549), getResources().getString(R.string.m549)  ));
        data.add(new Data(getResources().getString(R.string.w550), getResources().getString(R.string.m550)  ));
        data.add(new Data(getResources().getString(R.string.w551), getResources().getString(R.string.m551)  ));
        data.add(new Data(getResources().getString(R.string.w552), getResources().getString(R.string.m552)  ));
        data.add(new Data(getResources().getString(R.string.w553), getResources().getString(R.string.m553)  ));
        data.add(new Data(getResources().getString(R.string.w554), getResources().getString(R.string.m554)  ));
        data.add(new Data(getResources().getString(R.string.w555), getResources().getString(R.string.m555)  ));
        data.add(new Data(getResources().getString(R.string.w556), getResources().getString(R.string.m556)  ));
        data.add(new Data(getResources().getString(R.string.w557), getResources().getString(R.string.m557)  ));
        data.add(new Data(getResources().getString(R.string.w558), getResources().getString(R.string.m558)  ));
        data.add(new Data(getResources().getString(R.string.w559), getResources().getString(R.string.m559)  ));
        data.add(new Data(getResources().getString(R.string.w560), getResources().getString(R.string.m560)  ));
        data.add(new Data(getResources().getString(R.string.w561), getResources().getString(R.string.m561)  ));
        data.add(new Data(getResources().getString(R.string.w562), getResources().getString(R.string.m562)  ));
        data.add(new Data(getResources().getString(R.string.w563), getResources().getString(R.string.m563)  ));
        data.add(new Data(getResources().getString(R.string.w564), getResources().getString(R.string.m564)  ));
        data.add(new Data(getResources().getString(R.string.w565), getResources().getString(R.string.m565)  ));
        data.add(new Data(getResources().getString(R.string.w566), getResources().getString(R.string.m566)  ));
        data.add(new Data(getResources().getString(R.string.w567), getResources().getString(R.string.m567)  ));
        data.add(new Data(getResources().getString(R.string.w568), getResources().getString(R.string.m568)  ));
        data.add(new Data(getResources().getString(R.string.w569), getResources().getString(R.string.m569)  ));
        data.add(new Data(getResources().getString(R.string.w570), getResources().getString(R.string.m570)  ));
        data.add(new Data(getResources().getString(R.string.w571), getResources().getString(R.string.m571)  ));
        data.add(new Data(getResources().getString(R.string.w572), getResources().getString(R.string.m572)  ));
        data.add(new Data(getResources().getString(R.string.w573), getResources().getString(R.string.m573)  ));
        data.add(new Data(getResources().getString(R.string.w574), getResources().getString(R.string.m574)  ));
        data.add(new Data(getResources().getString(R.string.w575), getResources().getString(R.string.m575)  ));
        data.add(new Data(getResources().getString(R.string.w576), getResources().getString(R.string.m576)  ));
        data.add(new Data(getResources().getString(R.string.w577), getResources().getString(R.string.m577)  ));
        data.add(new Data(getResources().getString(R.string.w578), getResources().getString(R.string.m578)  ));
        data.add(new Data(getResources().getString(R.string.w579), getResources().getString(R.string.m579)  ));
        data.add(new Data(getResources().getString(R.string.w580), getResources().getString(R.string.m580)  ));
        data.add(new Data(getResources().getString(R.string.w581), getResources().getString(R.string.m581)  ));
        data.add(new Data(getResources().getString(R.string.w582), getResources().getString(R.string.m582)  ));
        data.add(new Data(getResources().getString(R.string.w583), getResources().getString(R.string.m583)  ));
        data.add(new Data(getResources().getString(R.string.w584), getResources().getString(R.string.m584)  ));
        data.add(new Data(getResources().getString(R.string.w585), getResources().getString(R.string.m585)  ));
        data.add(new Data(getResources().getString(R.string.w586), getResources().getString(R.string.m586)  ));
        data.add(new Data(getResources().getString(R.string.w587), getResources().getString(R.string.m587)  ));
        data.add(new Data(getResources().getString(R.string.w588), getResources().getString(R.string.m588)  ));
        data.add(new Data(getResources().getString(R.string.w589), getResources().getString(R.string.m589)  ));
        data.add(new Data(getResources().getString(R.string.w590), getResources().getString(R.string.m590)  ));
        data.add(new Data(getResources().getString(R.string.w591), getResources().getString(R.string.m591)  ));
        data.add(new Data(getResources().getString(R.string.w592), getResources().getString(R.string.m592)  ));
        data.add(new Data(getResources().getString(R.string.w593), getResources().getString(R.string.m593)  ));
        data.add(new Data(getResources().getString(R.string.w594), getResources().getString(R.string.m594)  ));
        data.add(new Data(getResources().getString(R.string.w595), getResources().getString(R.string.m595)  ));
        data.add(new Data(getResources().getString(R.string.w596), getResources().getString(R.string.m596)  ));
        data.add(new Data(getResources().getString(R.string.w597), getResources().getString(R.string.m597)  ));
        data.add(new Data(getResources().getString(R.string.w598), getResources().getString(R.string.m598)  ));
        data.add(new Data(getResources().getString(R.string.w599), getResources().getString(R.string.m599)  ));
        data.add(new Data(getResources().getString(R.string.w600), getResources().getString(R.string.m600)  ));
        data.add(new Data(getResources().getString(R.string.w601), getResources().getString(R.string.m601)  ));
        data.add(new Data(getResources().getString(R.string.w602), getResources().getString(R.string.m602)  ));
        data.add(new Data(getResources().getString(R.string.w603), getResources().getString(R.string.m603)  ));
        data.add(new Data(getResources().getString(R.string.w604), getResources().getString(R.string.m604)  ));
        data.add(new Data(getResources().getString(R.string.w605), getResources().getString(R.string.m605)  ));
        data.add(new Data(getResources().getString(R.string.w606), getResources().getString(R.string.m606)  ));
        data.add(new Data(getResources().getString(R.string.w607), getResources().getString(R.string.m607)  ));
        data.add(new Data(getResources().getString(R.string.w608), getResources().getString(R.string.m608)  ));
        data.add(new Data(getResources().getString(R.string.w609), getResources().getString(R.string.m609)  ));
        data.add(new Data(getResources().getString(R.string.w610), getResources().getString(R.string.m610)  ));
        data.add(new Data(getResources().getString(R.string.w611), getResources().getString(R.string.m611)  ));
        data.add(new Data(getResources().getString(R.string.w612), getResources().getString(R.string.m612)  ));
        data.add(new Data(getResources().getString(R.string.w613), getResources().getString(R.string.m613)  ));
        return data;
    }

}
