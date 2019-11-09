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

public class FragmentChemeleven extends Fragment {
    View view;
    public FragmentChemeleven() {
    }
    private WebView webView10;
    String chemeleventext="<h3><b><strong>Physical Chemistry I</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Types of solutions, measures of composition. Solubility. Dilute solution " +
            "and colligative properties. Colloidal solution. Thermo-chemistry. Second law of " +
            "thermodynamics and its applications. Chemical equilibrium of homogeneous and " +
            "heterogeneous reactions. Thermodynamic treatment of equilibrium constant. Ionization " +
            "of water and pH scale.</em></p><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemeleven_fragment,container,false);
        webView10 = (WebView) view.findViewById(R.id.subeleven);
        webView10.loadDataWithBaseURL(null,chemeleventext,"text/html","utf-8",null);

        return view;
    }
}
