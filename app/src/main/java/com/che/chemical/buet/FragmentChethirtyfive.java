package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/28/2018.
 */

public class FragmentChethirtyfive extends Fragment {
    View view;
    public FragmentChethirtyfive() {
    }
    private WebView webView34;
    String chethirtyfivetext="<h3><b><strong>Mass Transfer I</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction to mass transfer processes. Phase equilibria. Equilibrium stage " +
            "concept. Solvent Extraction: liquid-liquid extraction in single and multiple contact " +
            "extractor with completely immiscible and partially miscible solvent; use of triangular" +
            " diagram for stage calculations; batch and continuous leaching and washing of solids. " +
            "Binary distillation: equilibrium flash and differential distillation; batch and continuous" +
            " distillation with reflux; use of enthalpy concentration diagram and simplified methods" +
            " for stage calculations. Gas-liquid absorption: analytical and graphical methods for stage" +
            " calculations. Tray hydraulics and design considerations. Tray efficiency.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chethirtyfive_fragment,container,false);
        webView34 = (WebView) view.findViewById(R.id.subthirtyfive);
        webView34.loadDataWithBaseURL(null,chethirtyfivetext,"text/html","utf-8",null);

        return view;
    }
}
