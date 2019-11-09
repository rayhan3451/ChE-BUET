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

public class FragmentThreeQuestion2017 extends Fragment {
    View view;
    public FragmentThreeQuestion2017() {
    }
    private WebView webView1010;
    String electiveche457text="<b><em><font color=\"#FF00FF\">CHEMICAL ENGINEERING SCIENCE</font></em></b>"+
            "<h3><b><strong>Reactor design</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Review of homogeneous and heterogeneous systems. Reactor design for adiabatic and" +
            " nonadiabatic nonisothermal conditions. Reactor design for heterogeneous catalytic reactions. " +
            "Heat and mass transport processes. Experimental reactors and treatment of data. Design of " +
            "industrial reactors.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2017_question_fragment,container,false);
        webView1010 = (WebView) view.findViewById(R.id.elective011 );
        webView1010.loadDataWithBaseURL(null,electiveche457text,"text/html","utf-8",null);
        return view;
    }
}
