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

public class FragmentChethirtysix extends Fragment {
    View view;
    public FragmentChethirtysix() {
    }
    private WebView webView35;
    String chethirtysixtext="<h3><b><strong>Chemical Engineering Thermodynamics II</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Solution thermodynamics: relationships among the thermodynamic properties for " +
            "systems of variable composition; partial molar properties; fugacity and fugacity " +
            "coefficients; fugacities in ideal solutions; property changes of mixing; activity and " +
            "activity coefficients; heat effects of mixing processes. Phase equilibria: nature and " +
            "criteria of equilibrium; phase rule and Duhem’s theorem; vapour-liquid equilibrium " +
            "calculations for miscible systems; Gibbs-Duhem equation. Chemical reaction equilibria:" +
            "the reaction coordinate; criteria of equilibrium for chemical reactions; equilibrium " +
            "constant; effect of temperature on equilibrium constants; phase rule and Duhem’s theorem " +
            "for reacting systems. Thermodynamics of flow processes; conservation of mass and energy;" +
            "mechanical energy balances; maximum velocity in pipe flow; metering and throttling processes;" +
            " nozzles; compressors; ejectors. Refrigeration and liquefaction; Carnot refrigeration cycle;" +
            " air-refrigeration cycle; vapour-compression cycles; comparison of refrigeration cycles " +
            "absorption refrigeration, heat pump; liquefaction processes. Thermodynamic analysis of " +
            "processes: ideal work; lost work; thermodynamic analysis of steady flow processes.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chethirtysix_fragment,container,false);
        webView35 = (WebView) view.findViewById(R.id.subthirtysix);
        webView35.loadDataWithBaseURL(null,chethirtysixtext,"text/html","utf-8",null);

        return view;
    }
}
