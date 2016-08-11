package com.appbusters.robinpc.delete;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Group2Fragment extends Fragment {

    private RecyclerView recyclerview2;
    private RecyclerView.LayoutManager mLayoutManager;


    public Group2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_group2, container, false);
        List<Data> data = fill_with_data();

        recyclerview2 = (RecyclerView) v.findViewById(R.id.recyclerview2);
        recyclerview2.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerview2.setLayoutManager(mLayoutManager);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getActivity().getApplication());
        recyclerview2.setAdapter(adapter);

        return v;
    }
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data(getResources().getString(R.string.w247), getResources().getString(R.string.m247)  ));
        data.add(new Data(getResources().getString(R.string.w248), getResources().getString(R.string.m248)  ));
        data.add(new Data(getResources().getString(R.string.w249), getResources().getString(R.string.m249)  ));
        data.add(new Data(getResources().getString(R.string.w250), getResources().getString(R.string.m250)  ));
        data.add(new Data(getResources().getString(R.string.w251), getResources().getString(R.string.m251)  ));
        data.add(new Data(getResources().getString(R.string.w252), getResources().getString(R.string.m252)  ));
        data.add(new Data(getResources().getString(R.string.w253), getResources().getString(R.string.m253)  ));
        data.add(new Data(getResources().getString(R.string.w254), getResources().getString(R.string.m254)  ));
        data.add(new Data(getResources().getString(R.string.w255), getResources().getString(R.string.m255)  ));
        data.add(new Data(getResources().getString(R.string.w256), getResources().getString(R.string.m256)  ));
        data.add(new Data(getResources().getString(R.string.w257), getResources().getString(R.string.m257)  ));
        data.add(new Data(getResources().getString(R.string.w258), getResources().getString(R.string.m258)  ));
        data.add(new Data(getResources().getString(R.string.w259), getResources().getString(R.string.m259)  ));
        data.add(new Data(getResources().getString(R.string.w260), getResources().getString(R.string.m260)  ));
        data.add(new Data(getResources().getString(R.string.w261), getResources().getString(R.string.m261)  ));
        data.add(new Data(getResources().getString(R.string.w262), getResources().getString(R.string.m262)  ));
        data.add(new Data(getResources().getString(R.string.w263), getResources().getString(R.string.m263)  ));
        data.add(new Data(getResources().getString(R.string.w264), getResources().getString(R.string.m264)  ));
        data.add(new Data(getResources().getString(R.string.w265), getResources().getString(R.string.m265)  ));
        data.add(new Data(getResources().getString(R.string.w266), getResources().getString(R.string.m266)  ));
        data.add(new Data(getResources().getString(R.string.w267), getResources().getString(R.string.m267)  ));
        data.add(new Data(getResources().getString(R.string.w268), getResources().getString(R.string.m268)  ));
        data.add(new Data(getResources().getString(R.string.w269), getResources().getString(R.string.m269)  ));
        data.add(new Data(getResources().getString(R.string.w270), getResources().getString(R.string.m270)  ));
        data.add(new Data(getResources().getString(R.string.w271), getResources().getString(R.string.m271)  ));
        data.add(new Data(getResources().getString(R.string.w272), getResources().getString(R.string.m272)  ));
        data.add(new Data(getResources().getString(R.string.w273), getResources().getString(R.string.m273)  ));
        data.add(new Data(getResources().getString(R.string.w274), getResources().getString(R.string.m274)  ));
        data.add(new Data(getResources().getString(R.string.w275), getResources().getString(R.string.m275)  ));
        data.add(new Data(getResources().getString(R.string.w276), getResources().getString(R.string.m276)  ));
        data.add(new Data(getResources().getString(R.string.w277), getResources().getString(R.string.m277)  ));
        data.add(new Data(getResources().getString(R.string.w278), getResources().getString(R.string.m278)  ));
        data.add(new Data(getResources().getString(R.string.w279), getResources().getString(R.string.m279)  ));
        data.add(new Data(getResources().getString(R.string.w280), getResources().getString(R.string.m280)  ));
        data.add(new Data(getResources().getString(R.string.w281), getResources().getString(R.string.m281)  ));
        data.add(new Data(getResources().getString(R.string.w282), getResources().getString(R.string.m282)  ));
        data.add(new Data(getResources().getString(R.string.w283), getResources().getString(R.string.m283)  ));
        data.add(new Data(getResources().getString(R.string.w284), getResources().getString(R.string.m284)  ));
        data.add(new Data(getResources().getString(R.string.w285), getResources().getString(R.string.m285)  ));
        data.add(new Data(getResources().getString(R.string.w286), getResources().getString(R.string.m286)  ));
        data.add(new Data(getResources().getString(R.string.w287), getResources().getString(R.string.m287)  ));
        data.add(new Data(getResources().getString(R.string.w288), getResources().getString(R.string.m288)  ));
        data.add(new Data(getResources().getString(R.string.w289), getResources().getString(R.string.m289)  ));
        data.add(new Data(getResources().getString(R.string.w290), getResources().getString(R.string.m290)  ));
        data.add(new Data(getResources().getString(R.string.w291), getResources().getString(R.string.m291)  ));
        data.add(new Data(getResources().getString(R.string.w292), getResources().getString(R.string.m292)  ));
        data.add(new Data(getResources().getString(R.string.w293), getResources().getString(R.string.m293)  ));
        data.add(new Data(getResources().getString(R.string.w294), getResources().getString(R.string.m294)  ));
        data.add(new Data(getResources().getString(R.string.w295), getResources().getString(R.string.m295)  ));
        data.add(new Data(getResources().getString(R.string.w296), getResources().getString(R.string.m296)  ));
        data.add(new Data(getResources().getString(R.string.w297), getResources().getString(R.string.m297)  ));
        data.add(new Data(getResources().getString(R.string.w298), getResources().getString(R.string.m298)  ));
        data.add(new Data(getResources().getString(R.string.w299), getResources().getString(R.string.m299)  ));
        data.add(new Data(getResources().getString(R.string.w300), getResources().getString(R.string.m300)  ));
        data.add(new Data(getResources().getString(R.string.w301), getResources().getString(R.string.m301)  ));
        data.add(new Data(getResources().getString(R.string.w302), getResources().getString(R.string.m302)  ));
        data.add(new Data(getResources().getString(R.string.w303), getResources().getString(R.string.m303)  ));
        data.add(new Data(getResources().getString(R.string.w304), getResources().getString(R.string.m304)  ));
        data.add(new Data(getResources().getString(R.string.w305), getResources().getString(R.string.m305)  ));
        data.add(new Data(getResources().getString(R.string.w306), getResources().getString(R.string.m306)  ));
        data.add(new Data(getResources().getString(R.string.w307), getResources().getString(R.string.m307)  ));
        data.add(new Data(getResources().getString(R.string.w308), getResources().getString(R.string.m308)  ));
        data.add(new Data(getResources().getString(R.string.w309), getResources().getString(R.string.m309)  ));
        data.add(new Data(getResources().getString(R.string.w310), getResources().getString(R.string.m310)  ));
        data.add(new Data(getResources().getString(R.string.w311), getResources().getString(R.string.m311)  ));
        data.add(new Data(getResources().getString(R.string.w312), getResources().getString(R.string.m312)  ));
        data.add(new Data(getResources().getString(R.string.w313), getResources().getString(R.string.m313)  ));
        data.add(new Data(getResources().getString(R.string.w314), getResources().getString(R.string.m314)  ));
        data.add(new Data(getResources().getString(R.string.w315), getResources().getString(R.string.m315)  ));
        data.add(new Data(getResources().getString(R.string.w316), getResources().getString(R.string.m316)  ));
        data.add(new Data(getResources().getString(R.string.w317), getResources().getString(R.string.m317)  ));
        data.add(new Data(getResources().getString(R.string.w318), getResources().getString(R.string.m318)  ));
        data.add(new Data(getResources().getString(R.string.w319), getResources().getString(R.string.m319)  ));
        data.add(new Data(getResources().getString(R.string.w320), getResources().getString(R.string.m320)  ));
        data.add(new Data(getResources().getString(R.string.w321), getResources().getString(R.string.m321)  ));
        data.add(new Data(getResources().getString(R.string.w322), getResources().getString(R.string.m322)  ));
        data.add(new Data(getResources().getString(R.string.w323), getResources().getString(R.string.m323)  ));
        data.add(new Data(getResources().getString(R.string.w324), getResources().getString(R.string.m324)  ));
        data.add(new Data(getResources().getString(R.string.w325), getResources().getString(R.string.m325)  ));
        data.add(new Data(getResources().getString(R.string.w326), getResources().getString(R.string.m326)  ));
        data.add(new Data(getResources().getString(R.string.w327), getResources().getString(R.string.m327)  ));
        data.add(new Data(getResources().getString(R.string.w328), getResources().getString(R.string.m328)  ));
        data.add(new Data(getResources().getString(R.string.w329), getResources().getString(R.string.m329)  ));
        data.add(new Data(getResources().getString(R.string.w330), getResources().getString(R.string.m330)  ));
        data.add(new Data(getResources().getString(R.string.w331), getResources().getString(R.string.m331)  ));
        data.add(new Data(getResources().getString(R.string.w332), getResources().getString(R.string.m332)  ));
        data.add(new Data(getResources().getString(R.string.w333), getResources().getString(R.string.m333)  ));
        data.add(new Data(getResources().getString(R.string.w334), getResources().getString(R.string.m334)  ));
        data.add(new Data(getResources().getString(R.string.w335), getResources().getString(R.string.m335)  ));
        data.add(new Data(getResources().getString(R.string.w336), getResources().getString(R.string.m336)  ));
        data.add(new Data(getResources().getString(R.string.w337), getResources().getString(R.string.m337)  ));
        data.add(new Data(getResources().getString(R.string.w338), getResources().getString(R.string.m338)  ));
        data.add(new Data(getResources().getString(R.string.w339), getResources().getString(R.string.m339)  ));
        data.add(new Data(getResources().getString(R.string.w340), getResources().getString(R.string.m340)  ));
        data.add(new Data(getResources().getString(R.string.w341), getResources().getString(R.string.m341)  ));
        data.add(new Data(getResources().getString(R.string.w342), getResources().getString(R.string.m342)  ));
        data.add(new Data(getResources().getString(R.string.w343), getResources().getString(R.string.m343)  ));
        data.add(new Data(getResources().getString(R.string.w344), getResources().getString(R.string.m344)  ));
        data.add(new Data(getResources().getString(R.string.w345), getResources().getString(R.string.m345)  ));
        data.add(new Data(getResources().getString(R.string.w346), getResources().getString(R.string.m346)  ));
        data.add(new Data(getResources().getString(R.string.w347), getResources().getString(R.string.m347)  ));
        data.add(new Data(getResources().getString(R.string.w348), getResources().getString(R.string.m348)  ));
        data.add(new Data(getResources().getString(R.string.w349), getResources().getString(R.string.m349)  ));
        data.add(new Data(getResources().getString(R.string.w350), getResources().getString(R.string.m350)  ));
        data.add(new Data(getResources().getString(R.string.w351), getResources().getString(R.string.m351)  ));
        data.add(new Data(getResources().getString(R.string.w352), getResources().getString(R.string.m352)  ));
        data.add(new Data(getResources().getString(R.string.w353), getResources().getString(R.string.m353)  ));
        data.add(new Data(getResources().getString(R.string.w354), getResources().getString(R.string.m354)  ));
        data.add(new Data(getResources().getString(R.string.w355), getResources().getString(R.string.m355)  ));
        data.add(new Data(getResources().getString(R.string.w356), getResources().getString(R.string.m356)  ));
        data.add(new Data(getResources().getString(R.string.w357), getResources().getString(R.string.m357)  ));
        data.add(new Data(getResources().getString(R.string.w358), getResources().getString(R.string.m358)  ));
        data.add(new Data(getResources().getString(R.string.w359), getResources().getString(R.string.m359)  ));
        data.add(new Data(getResources().getString(R.string.w360), getResources().getString(R.string.m360)  ));
        data.add(new Data(getResources().getString(R.string.w361), getResources().getString(R.string.m361)  ));
        data.add(new Data(getResources().getString(R.string.w362), getResources().getString(R.string.m362)  ));
        data.add(new Data(getResources().getString(R.string.w363), getResources().getString(R.string.m363)  ));
        data.add(new Data(getResources().getString(R.string.w364), getResources().getString(R.string.m364)  ));
        data.add(new Data(getResources().getString(R.string.w365), getResources().getString(R.string.m365)  ));
        data.add(new Data(getResources().getString(R.string.w366), getResources().getString(R.string.m366)  ));
        data.add(new Data(getResources().getString(R.string.w367), getResources().getString(R.string.m367)  ));
        data.add(new Data(getResources().getString(R.string.w368), getResources().getString(R.string.m368)  ));
        data.add(new Data(getResources().getString(R.string.w369), getResources().getString(R.string.m369)  ));
        data.add(new Data(getResources().getString(R.string.w370), getResources().getString(R.string.m370)  ));
        data.add(new Data(getResources().getString(R.string.w371), getResources().getString(R.string.m371)  ));
        data.add(new Data(getResources().getString(R.string.w372), getResources().getString(R.string.m372)  ));
        data.add(new Data(getResources().getString(R.string.w373), getResources().getString(R.string.m373)  ));
        data.add(new Data(getResources().getString(R.string.w374), getResources().getString(R.string.m374)  ));
        data.add(new Data(getResources().getString(R.string.w375), getResources().getString(R.string.m375)  ));
        data.add(new Data(getResources().getString(R.string.w376), getResources().getString(R.string.m376)  ));
        data.add(new Data(getResources().getString(R.string.w377), getResources().getString(R.string.m377)  ));
        data.add(new Data(getResources().getString(R.string.w378), getResources().getString(R.string.m378)  ));
        data.add(new Data(getResources().getString(R.string.w379), getResources().getString(R.string.m379)  ));
        data.add(new Data(getResources().getString(R.string.w380), getResources().getString(R.string.m380)  ));
        data.add(new Data(getResources().getString(R.string.w381), getResources().getString(R.string.m381)  ));
        data.add(new Data(getResources().getString(R.string.w382), getResources().getString(R.string.m382)  ));
        data.add(new Data(getResources().getString(R.string.w383), getResources().getString(R.string.m383)  ));
        data.add(new Data(getResources().getString(R.string.w384), getResources().getString(R.string.m384)  ));
        data.add(new Data(getResources().getString(R.string.w385), getResources().getString(R.string.m385)  ));
        data.add(new Data(getResources().getString(R.string.w386), getResources().getString(R.string.m386)  ));
        data.add(new Data(getResources().getString(R.string.w387), getResources().getString(R.string.m387)  ));
        data.add(new Data(getResources().getString(R.string.w388), getResources().getString(R.string.m388)  ));
        data.add(new Data(getResources().getString(R.string.w389), getResources().getString(R.string.m389)  ));
        data.add(new Data(getResources().getString(R.string.w390), getResources().getString(R.string.m390)  ));
        data.add(new Data(getResources().getString(R.string.w391), getResources().getString(R.string.m391)  ));
        data.add(new Data(getResources().getString(R.string.w392), getResources().getString(R.string.m392)  ));
        data.add(new Data(getResources().getString(R.string.w393), getResources().getString(R.string.m393)  ));
        data.add(new Data(getResources().getString(R.string.w394), getResources().getString(R.string.m394)  ));
        data.add(new Data(getResources().getString(R.string.w395), getResources().getString(R.string.m395)  ));
        data.add(new Data(getResources().getString(R.string.w396), getResources().getString(R.string.m396)  ));
        data.add(new Data(getResources().getString(R.string.w397), getResources().getString(R.string.m397)  ));
        data.add(new Data(getResources().getString(R.string.w398), getResources().getString(R.string.m398)  ));
        data.add(new Data(getResources().getString(R.string.w399), getResources().getString(R.string.m399)  ));
        data.add(new Data(getResources().getString(R.string.w400), getResources().getString(R.string.m400)  ));
        data.add(new Data(getResources().getString(R.string.w401), getResources().getString(R.string.m401)  ));
        data.add(new Data(getResources().getString(R.string.w402), getResources().getString(R.string.m402)  ));
        data.add(new Data(getResources().getString(R.string.w403), getResources().getString(R.string.m403)  ));
        data.add(new Data(getResources().getString(R.string.w404), getResources().getString(R.string.m404)  ));
        data.add(new Data(getResources().getString(R.string.w405), getResources().getString(R.string.m405)  ));
        data.add(new Data(getResources().getString(R.string.w406), getResources().getString(R.string.m406)  ));
        data.add(new Data(getResources().getString(R.string.w407), getResources().getString(R.string.m407)  ));
        data.add(new Data(getResources().getString(R.string.w408), getResources().getString(R.string.m408)  ));
        data.add(new Data(getResources().getString(R.string.w409), getResources().getString(R.string.m409)  ));
        data.add(new Data(getResources().getString(R.string.w410), getResources().getString(R.string.m410)  ));
        data.add(new Data(getResources().getString(R.string.w411), getResources().getString(R.string.m411)  ));
        data.add(new Data(getResources().getString(R.string.w412), getResources().getString(R.string.m412)  ));
        data.add(new Data(getResources().getString(R.string.w413), getResources().getString(R.string.m413)  ));
        data.add(new Data(getResources().getString(R.string.w414), getResources().getString(R.string.m414)  ));
        data.add(new Data(getResources().getString(R.string.w415), getResources().getString(R.string.m415)  ));
        data.add(new Data(getResources().getString(R.string.w416), getResources().getString(R.string.m416)  ));
        data.add(new Data(getResources().getString(R.string.w417), getResources().getString(R.string.m417)  ));
        data.add(new Data(getResources().getString(R.string.w418), getResources().getString(R.string.m418)  ));
        data.add(new Data(getResources().getString(R.string.w419), getResources().getString(R.string.m419)  ));
        data.add(new Data(getResources().getString(R.string.w420), getResources().getString(R.string.m420)  ));
        data.add(new Data(getResources().getString(R.string.w421), getResources().getString(R.string.m421)  ));
        data.add(new Data(getResources().getString(R.string.w422), getResources().getString(R.string.m422)  ));
        data.add(new Data(getResources().getString(R.string.w423), getResources().getString(R.string.m423)  ));
        data.add(new Data(getResources().getString(R.string.w424), getResources().getString(R.string.m424)  ));
        data.add(new Data(getResources().getString(R.string.w425), getResources().getString(R.string.m425)  ));
        data.add(new Data(getResources().getString(R.string.w426), getResources().getString(R.string.m426)  ));
        data.add(new Data(getResources().getString(R.string.w427), getResources().getString(R.string.m427)  ));
        data.add(new Data(getResources().getString(R.string.w428), getResources().getString(R.string.m428)  ));
        data.add(new Data(getResources().getString(R.string.w429), getResources().getString(R.string.m429)  ));
        data.add(new Data(getResources().getString(R.string.w430), getResources().getString(R.string.m430)  ));
        data.add(new Data(getResources().getString(R.string.w431), getResources().getString(R.string.m431)  ));
        data.add(new Data(getResources().getString(R.string.w432), getResources().getString(R.string.m432)  ));
        data.add(new Data(getResources().getString(R.string.w433), getResources().getString(R.string.m433)  ));
        data.add(new Data(getResources().getString(R.string.w434), getResources().getString(R.string.m434)  ));
        data.add(new Data(getResources().getString(R.string.w435), getResources().getString(R.string.m435)  ));
        data.add(new Data(getResources().getString(R.string.w436), getResources().getString(R.string.m436)  ));
        data.add(new Data(getResources().getString(R.string.w437), getResources().getString(R.string.m437)  ));
        data.add(new Data(getResources().getString(R.string.w438), getResources().getString(R.string.m438)  ));
        data.add(new Data(getResources().getString(R.string.w439), getResources().getString(R.string.m439)  ));
        data.add(new Data(getResources().getString(R.string.w440), getResources().getString(R.string.m440)  ));
        data.add(new Data(getResources().getString(R.string.w441), getResources().getString(R.string.m441)  ));
        return data;
    }

}
