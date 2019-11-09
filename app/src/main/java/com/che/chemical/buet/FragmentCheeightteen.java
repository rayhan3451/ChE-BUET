package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/25/2018.
 */

public class FragmentCheeightteen extends Fragment {
    View view;
    public FragmentCheeightteen() {
    }
    private WebView webView17;
    String cheeightteen="<h3><b><strong>Materials and Energy Balance</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Review of material balance involving recycle and purging operations. " +
            "Operations involving vaporization, humidification, psychrometry and phase diagrams. " +
            "Energy balance involving change of phases. Enthalpy-composition diagrams. Heats of " +
            "formation and reaction: effects of temperature and pressure. Material balances with " +
            "chemical reactions and multiple components including use of algebraic techniques." +
            " Energy balances on chemical process. Stoichiometry and unit operations in industrial" +
            " process.</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.cheeightteen_fragment,container,false);
        webView17 = (WebView) view.findViewById(R.id.subeightteen);
        webView17.loadDataWithBaseURL(null,cheeightteen,"text/html","utf-8",null);

        return view;
    }
}
