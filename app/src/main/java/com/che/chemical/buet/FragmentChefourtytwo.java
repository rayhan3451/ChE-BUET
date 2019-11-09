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

public class FragmentChefourtytwo extends Fragment {
    View view;
    public FragmentChefourtytwo() {
    }
    private WebView webView41;
    String chefourtytwotext="<h3><b><strong>Mass Transfer II</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Basic mass transfer theories: diffusion of gases and liquids; diffusion through" +
            " stagnant layer and equimolar counter diffusion; mass transfer between gas and liquid " +
            "phases; two film and other theories; HTU and NTU concepts, Mass transfer coefficients." +
            " Continuous contact mass transfer; packed and spray column; gas absorption in packed " +
            "column; continuous liquid-liquid extraction in columns. Membrane Separation Process. " +
            "Multicomponent distillation: bubble and dewpoint calculations for multicomponent systems;" +
            " simplified methods for calculation of stages. Principles of simultaneous heat and mass " +
            "transfer in humidification-dehumidification, drying, evaporation and crystallisation " +
            "operations. Adsorption; principles; industrial application with special emphasis on ion" +
            " exchange and pressure swing adsorption.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefourtytwo_fragment,container,false);
        webView41 = (WebView) view.findViewById(R.id.subfourtytwo);
        webView41.loadDataWithBaseURL(null,chefourtytwotext,"text/html","utf-8",null);

        return view;
    }
}
