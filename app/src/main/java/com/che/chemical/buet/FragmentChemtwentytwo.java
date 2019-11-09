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

public class FragmentChemtwentytwo extends Fragment {
    View view;
    public FragmentChemtwentytwo() {
    }
    private WebView webView21;
    String chemtwentytwotext="<h3><b><strong>Physical Chemistry II</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Chemical kinetics. Adsorption and adsorption isotherm. Catalysis. Molecular " +
            "spectroscopy. Rotational, vibrational and electronic spectra of molecules.</em></p><br>"+

            "<p><em>Phase equilibria: phase rule and its application. Electrolytic conduction. " +
            "Electrical properties of solution. Interionic attraction theory. Electrochemical cells." +
            " Thermodynamics of electrochemical cells. Application of emf measurements. Ionic equilibria." +
            " Buffer solution. Henderson equation and its application.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemtwentytwo_fragment,container,false);
        webView21 = (WebView) view.findViewById(R.id.subtwentytwo);
        webView21.loadDataWithBaseURL(null,chemtwentytwotext,"text/html","utf-8",null);

        return view;
    }
}
