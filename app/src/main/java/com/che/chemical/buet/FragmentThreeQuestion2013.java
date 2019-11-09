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

public class FragmentThreeQuestion2013 extends Fragment {
    View view;
    public FragmentThreeQuestion2013() {
    }
    private WebView webView1014;
    String electiveche475text="<b><em><font color=\"#2ECC40\">BIOCHEMICAL ENGINEERING</font></em></b>"+
            "<h3><b><strong>Biochemical Engineering II</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Design and analysis of biological reactors; ideal reactors reactor dynamics, " +
            "reactors with nonideal mixing, sterilization reactors, multiphase bioreactors. Biological " +
            "industries and their engineering problem. Transport phenomena in bioprocess systems: gas " +
            " liquid mass transfer in cellular systems, determination of oxygen transfer rates, forced " +
            "convection. Separation of cells and recovery of useful products. Bioprocess economics. " +
            "Instrumentation and control. Analysis of multiple interacting microbial populations. Mixed " +
            "microbial population in applications and natural systems. Biological wastewater treatment.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2013_question_fragment,container,false);
        webView1014 = (WebView) view.findViewById(R.id.elective015 );
        webView1014.loadDataWithBaseURL(null,electiveche475text,"text/html","utf-8",null);
        return view;
    }
}
