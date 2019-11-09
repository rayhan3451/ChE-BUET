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

public class FragmentThreeQuestion2010 extends Fragment {
    View view;
    public FragmentThreeQuestion2010() {
    }
    private WebView webView1017;
    String electiveche485text="<b><em><font color=\"#dc143c\">ENVIRONMENTAL SCIENCE</font></em></b>"+
            "<h3><b><strong>Industrial Pollution Control</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Scope and purpose. Source and nature of pollutants in air and water. Air pollution: " +
            "measuring and estimating emission form sources; meteorological factors; methods of reducing " +
            "pollutants; physical combustion and catalytic combustion methods. Methods of gas cleaning: " +
            "electrostatic precipitation, filtration, scrubbing, sonic and ultra-sonic agglomeration." +
            " Industrial effluent treatment. Disposal of hazardous and toxic wastes. Radiological protection" +
            " principles. Pollution control of specific industries; tannery, pulp and paper, fertilizer," +
            " steel, refinery, metal finishing, food and pharmaceuticals.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2010_question_fragment,container,false);
        webView1017 = (WebView) view.findViewById(R.id.elective018 );
        webView1017.loadDataWithBaseURL(null,electiveche485text,"text/html","utf-8",null);
        return view;
    }
}
