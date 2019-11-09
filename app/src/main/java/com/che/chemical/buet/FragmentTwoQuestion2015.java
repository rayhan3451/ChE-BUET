package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/14/2019.
 */

public class FragmentTwoQuestion2015 extends Fragment {
    View view;
    public FragmentTwoQuestion2015() {
    }
    private WebView webView1003;
          String  electiveche437text="<b><em><font color=\"#0074D9\">CHEMICAL TECHNOLOGY</font></em></b>"+
            "<h3><b><strong>Refinery Engineering</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction. Origin, formation and composition of petroleum. Evaluation of crude oils." +
            " Refinery products and their uses. Analysis of petroleum products. Fractionation of petroleum." +
            " Production of lubricating oils and greases. Bitumen production. Reaction mechanism, kinetics " +
            "and technological aspects of some thermal and catalytic processes; thermal cracking, coking, " +
            "pyrolysis, catalytic cracking, hydrocracking, catalytic reforming, hydrogen treating, isomerisation," +
            " alkylation. Refinery flow sheeting, equipment, design, layout, safety and environmental " +
            "aspects. Discussion on ERL with emphasis on processing technology.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2015_question_fragment,container,false);
        webView1003 = (WebView) view.findViewById(R.id.elective004);
        webView1003.loadDataWithBaseURL(null,electiveche437text,"text/html","utf-8",null);

        return view;
    }
}
