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

public class FragmentTwoQuestion2016 extends Fragment {
    View view;
    public FragmentTwoQuestion2016() {
    }
    private WebView webView1002;
    String electiveche435text="<b><em><font color=\"#0074D9\">CHEMICAL TECHNOLOGY</font></em></b>"+
            "<h3><b><strong>Glass, Ceramics and Cement Technology</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Structural characteristics of ceramic materials, Kinetics of high temperature " +
            "reaction including sintering and vitrification. Melting crystallization and glass formations." +
            " Ceramic phase equilibrium diagrams. Non-equilibrium phases. Raw materials, manufacturing " +
            "processes and properties of glass, porcelain, refractories and whitewares. Glazing and decorating" +
            " of porcelain and stonewares. Firing methods and kilns for ceramic and whitewares. Furnaces " +
            "for glass manufacture. Raw materials, manufacturing processes and properties of cement. " +
            "Heat and mass balance around kiln.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2016_question_fragment,container,false);
        webView1002 = (WebView) view.findViewById(R.id.elective003);
        webView1002.loadDataWithBaseURL(null,electiveche435text,"text/html","utf-8",null);

        return view;
    }
}
