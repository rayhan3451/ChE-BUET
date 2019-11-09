package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/29/2018.
 */

public class FragmentChefourtythree extends Fragment {
    View view;
    public FragmentChefourtythree() {
    }
    private WebView webView42;
    String chefourtythreetext="<h3><b><strong>Particle Technology</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Properties of particulate solids: particle size and shape: mean diameters; " +
            "screen analysis; analytical size distribution function; size distribution of feed" +
            " and products of crystallizers and size reduction equipment. Bulk properties of " +
            "particulates; Mohr stress diagram; storage of solids; bin design. Fluid-solid momentum" +
            " transport: flow past a sphere; drag coefficient; terminal setting velocity; pressure " +
            "drop in packed beds; fluidization and sedimentation; slurry transport and pneumatic " +
            "conveying. Fluid-solid separation based on momentum transport; classification, " +
            "pretreatment of solid-liquid mixture, theory of coagulation, flocculation and flotation;" +
            " gravity thickening. Filtration; filtration operations and basic equations for " +
            "incompressible and compressible cakes; deep bed, pressure, vacuum and centrifugal " +
            "filtration; filter media; filter aids; cake washing and dewatering; optimum design " +
            "of semi-continuous filtration equipment.</em></p><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefourtythree_fragment,container,false);
        webView42 = (WebView) view.findViewById(R.id.subfourtythree);
        webView42.loadDataWithBaseURL(null,chefourtythreetext,"text/html","utf-8",null);

        return view;
    }
}
