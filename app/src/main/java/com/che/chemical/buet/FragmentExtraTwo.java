package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/19/2019.
 */

public class FragmentExtraTwo extends Fragment {
    View view;
    public FragmentExtraTwo() {
    }
    private WebView webView1019;
    String electiveche493text="<b><em><font color=\"#728C00\">PETROLEUM ENGINEERING</font></em></b>"+
            "<h3><b><strong>Petroleum Reservoir Engineering</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Origin of petroleum. Petroleum traps. Rock properties: porosity and permeability;" +
            " types and measurement techniques; Darcy’s law and its applications. Review of reservoir " +
            "fluid properties. Surface tension. Capillary phenomenon. Fluid saturations. Estimation of " +
            "reserves and drive mechanisms in reservoirs.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.extra_two_fragment,container,false);
        webView1019 = (WebView) view.findViewById(R.id.extra_two);
        webView1019.loadDataWithBaseURL(null,electiveche493text,"text/html","utf-8",null);
        return view;
    }
}
