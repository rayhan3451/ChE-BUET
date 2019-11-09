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

public class FragmentTwoQuestion2010 extends Fragment {
    View view;
    public FragmentTwoQuestion2010() {
    }
    private WebView webView1008;
    String electiveche453text="<b><em><font color=\"#FF00FF\">CHEMICAL ENGINEERING SCIENCE</font></em></b>"+
            "<h3><b><strong>Transport Phenomena</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Application of shell balances and equations of change for momentum, energy and mass " +
            "transfers. Laminar and turbulent flows. Multi-component systems. Analogy equations relating" +
            " momentum, energy and mass transfer.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2010_question_fragment,container,false);
        webView1008 = (WebView) view.findViewById(R.id.elective009 );
        webView1008.loadDataWithBaseURL(null,electiveche453text,"text/html","utf-8",null);
        return view;
    }
}
