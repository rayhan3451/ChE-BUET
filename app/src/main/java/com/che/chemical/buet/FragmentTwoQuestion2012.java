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

public class FragmentTwoQuestion2012 extends Fragment {
    View view;
    public FragmentTwoQuestion2012() {
    }
    private WebView webView1006;
    String electiveche443text="<b><em><font color=\"#0074D9\">CHEMICAL TECHNOLOGY</font></em></b>"+
            "<h3><b><strong>Food and Sugar Technology</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction to food technology. Principles of major preservation methods: drying," +
            " chemical, thermal, low temperature and freezing and irradiation. Unit operations in food" +
            " processing and preservation: fluid flow, heat transfer, concentration by evaporation, " +
            "drying separation methods, mixing, size reduction and sterilization process. Calculations" +
            " in food engineering.Packaging in food industry. Technology for processing and preservation " +
            "for specific industries: cereals, fruits and vegetables, fish, milk and dairy products," +
            " oils and fats. Sugar technology: introduction, composition of cane and juice, manufacturing" +
            " of raw cane sugar, extraction of juices, purification of juices, treatment of mud water and " +
            "clarified juice, evaporation, heating, crystallization. Cane sugar refining: clarification," +
            " decolourization, crystallization and finishing. Microbiology in sugar manufacture and refining." +
            " Economics of sugar industry.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2012_question_fragment,container,false);
        webView1006 = (WebView) view.findViewById(R.id.elective007 );
        webView1006.loadDataWithBaseURL(null,electiveche443text,"text/html","utf-8",null);
        return view;
    }
}
