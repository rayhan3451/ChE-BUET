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

public class FragmentCheninteen extends Fragment {
    View view;
    public FragmentCheninteen() {
    }
    private WebView webView18;
    String cheninteen="<h3><b><strong>Chemical Engineering Thermodynamics</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction: the scope of thermodynamics; fundamental quantities; secondary " +
            "quantities. The first law and other basic concepts: Joule’s experiments; internal " +
            "energy; the first law of thermodynamics; the thermodynamic state and state functions; " +
            "extensive and intensive properties; enthalpy; steady state flow process; phase rule;" +
            " reversible and irreversible processes; heat capacity. Volumetric properties of pure " +
            "fluids: P-V-T behaviour of pure substances; ideal and non-ideal gas and equations of " +
            "state; applications of equations of state. Heat effects; heat capacities of gases as a" +
            " function of temperature; heat capacities of solids and liquids; heat effects accompanying" +
            " phase changes of pure substances; standard heat of reaction; effect of temperature on" +
            " the standard heat of reaction. The second law of thermodynamics; alternative statements" +
            " of the second law; heat engine; thermodynamic temperature scales; concept of entropy;" +
            " entropy changes and irreversibility. The third law of thermodynamics. Thermodynamics" +
            " properties; single phase and two-phase system; types of thermodynamic diagrams. " +
            "Conversion of heat into work by power cycles; vapor cycles; steam power plant; analysis" +
            " of the steam power plant (boiler, economizer, superheater, steam turbine); internal " +
            "combustion engines (Auto engine, diesel engine, gas turbine, jet engines).</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.cheninteen_fragment,container,false);
        webView18 = (WebView) view.findViewById(R.id.subninteen);
        webView18.loadDataWithBaseURL(null,cheninteen,"text/html","utf-8",null);

        return view;
    }
}
