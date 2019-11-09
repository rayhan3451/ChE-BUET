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

public class FragmentChemtwentyfive extends Fragment {
    View view;
    public FragmentChemtwentyfive() {
    }
    private WebView webView24;
    String chemtwentyfivetext="<h3><b><strong>Physical Chemistry Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Partition co-efficient. Equilibrium constant by distribution method; heat of\n" +
            "reaction by calorimetry; Heat of solution by solubility measurement.\n" +
            "Viscosity measurement. Determination of specific rate constant.\n" +
            "Measurement of equivalent conductance and solubility of sparingly soluble\n" +
            "salt.</em></p><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemtwentyfive_fragment,container,false);
        webView24 = (WebView) view.findViewById(R.id.subtwentyfive);
        webView24.loadDataWithBaseURL(null,chemtwentyfivetext,"text/html","utf-8",null);

        return view;
    }
}
