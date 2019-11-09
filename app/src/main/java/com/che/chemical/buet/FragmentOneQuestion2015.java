package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/13/2019.
 */

public class FragmentOneQuestion2015 extends Fragment {
    View view;
    public FragmentOneQuestion2015() {
    }
    private WebView webView104;
    String electiveme347text="<h3><b><strong>Mechanical Design of Process Equipment</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Vessels: classification, fundamental principles and design equations, codes and" +
            " standards: Design of thin-walled cylinders and spherical shells under internal pressure:" +
            " Design of thin-walled cylindrical vessels under external pressures:</em></p><br>"+

            "<p><em>Design of vessels subject to combined loading: Vessels heads and supports:" +
            " Bolted flanged joints: High pressure vessels: Performance tests.</em></p><br>"+

            "<p><em>Shell and tube heat exchangers: general considerations and thickness of " +
            "various components. Pipeline: wall thickness and schedule number.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.one_2015_question_fragment,container,false);
        webView104 = (WebView) view.findViewById(R.id.elective04);
        webView104.loadDataWithBaseURL(null,electiveme347text,"text/html","utf-8",null);
        return view;
    }
}
