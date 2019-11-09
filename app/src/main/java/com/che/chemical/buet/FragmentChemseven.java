package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/23/2018.
 */

public class FragmentChemseven extends Fragment {
    View view;
    public FragmentChemseven() {
    }
    private WebView webView6;
    String chemseventext="<h3><b><strong>Inorganic Analysis I Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Volumetric analysis: acid-base titration, oxidation-reduction titration " +
            "and iodometric titration, precipitation titration. Gravimetric analysis: estimation" +
            " of sulfate and zinc, Separation and estimation of iron and calcium, copper " +
            "and zinc from their mixtures.</em></p><br><br><br><br><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemseven_fragment,container,false);
        webView6 = (WebView) view.findViewById(R.id.subseven);
        webView6.loadDataWithBaseURL(null,chemseventext,"text/html","utf-8",null);
        return view;
    }
}
