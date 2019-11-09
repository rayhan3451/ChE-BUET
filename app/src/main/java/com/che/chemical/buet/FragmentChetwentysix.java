package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/27/2018.
 */

public class FragmentChetwentysix extends Fragment {
    View view;
    public FragmentChetwentysix() {
    }
    private WebView webView25;
    String chetwentysixtext="<h3><b><strong>Fluid Mechanics</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Review of fluid statics and manometry. Concept of shear stress and " +
            "classification of fluids. Flow fluids in closed conduits; laminar and turbulent " +
            "flow; friction factor; frictional losses in pipes and fittings; expansion" +
            " contraction losses; pipeline with pump or turbine; series and parallel pipeline." +
            " Fluid flow measurements. Dimensional analysis. Microscopic balances; conservation" +
            " of mass and momentum; stresses in a fluid; symmetry of stresses; deformation;" +
            " Newtonian fluid and constitutive equation; Navier-Stokes equations in different" +
            " co-ordinate systems; solutions of Navier-Stokes equation. Macroscopic balance" +
            " and its applications. Introduction to turbulence, compressible flow and" +
            " multi-phase flow.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chetwentysix_fragment,container,false);
        webView25 = (WebView) view.findViewById(R.id.subtwentysix);
        webView25.loadDataWithBaseURL(null,chetwentysixtext,"text/html","utf-8",null);

        return view;
    }
}
