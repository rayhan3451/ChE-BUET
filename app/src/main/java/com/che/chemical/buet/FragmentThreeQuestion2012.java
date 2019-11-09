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

public class FragmentThreeQuestion2012 extends Fragment {
    View view;
    public FragmentThreeQuestion2012() {
    }
    private WebView webView1015;
    String electiveche481text="<b><em><font color=\"#dc143c\">ENVIRONMENTAL SCIENCE</font></em></b>"+
            "<h3><b><strong>Environmental Science I</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction to environmental engineering: environmental systems; environmental" +
            " legislations and regulations; environmental ethics; material balance approach. Hydrology " +
            " fundamentals: rainfall analysis; runoff analysis; groundwater and wells. Air pollution: " +
            "origin and fate of air pollutants, atmospheric dispersion; stationary and mobile sources; " +
            "source control. Noise pollution: noise effects; community noise sources and criteria; noise control.</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2012_question_fragment,container,false);
        webView1015 = (WebView) view.findViewById(R.id.elective016 );
        webView1015.loadDataWithBaseURL(null,electiveche481text,"text/html","utf-8",null);
        return view;
    }
}
