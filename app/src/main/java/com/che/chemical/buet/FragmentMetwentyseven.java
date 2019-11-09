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

public class FragmentMetwentyseven extends Fragment {
    View view;
    public FragmentMetwentyseven() {
    }
    private WebView webView26;
    String metwentyseventext="<h3><b><strong>Mechanics of Solids</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Stress analysis: statically indeterminate axially loaded member, axially loaded " +
            "member, thermal and centrifugal stress. Stresses in thin and thick walled cylinders " +
            "and spheres.</em></p><br>"+

            "<p><em>Beams: shear force and bending moment diagrams: Various types of stresses in " +
            "beams. Flexure formula: Deflection of beams, integration and area moment methods." +
            " Introduction to reinforced concrete beams and slabs.</em></p><br>"+

            "<p><em>Torsion formula: Angle of twist: Modulus of rupture. Helical, springs. Combined" +
            " stress. Principal stress. Mohr’s Circle: Columns: Fuler’s formula, intermediate column" +
            " formulas, the secant formula, Flexure formula of curved beams.</em></p><br>"+

            "<p><em>Introduction to experimental stress analysis techniques. Strain energy. Failure " +
            "theories.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.metwentyseven_fragment,container,false);
        webView26 = (WebView) view.findViewById(R.id.subtwentyseven);
        webView26.loadDataWithBaseURL(null,metwentyseventext,"text/html","utf-8",null);

        return view;
    }
}
