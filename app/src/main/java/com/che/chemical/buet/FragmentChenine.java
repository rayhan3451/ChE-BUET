package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/24/2018.
 */

public class FragmentChenine extends Fragment {
    View view;
    public FragmentChenine() {
    }
    private WebView webView8;
    String cheninetext="<h3><b><strong>Elements of Chemical Engineering</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Scope of chemical engineering, Principles of chemical engineering calculations:" +
            " systems of units, basic concepts of dimensional analysis, process variables, basis " +
            "of calculation, conservation of mass and energy. Material balance: overall component " +
            "balance, recycle and bypass, simple reactive systems and combustion reactions. Energy" +
            " balance; forms of energy and the First Law of Thermodynamics, thermodynamic data and " +
            "tables, energy balance on closed and open systems. Application of mass and energy balance " +
            "to real processes. Measurements of process variables; fluid statics and manometry, flow" +
            " measurement, temperature measurement.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chenine_fragment,container,false);
        webView8 = (WebView) view.findViewById(R.id.subnine);
        webView8.loadDataWithBaseURL(null,cheninetext,"text/html","utf-8",null);
        return view;
    }
}
