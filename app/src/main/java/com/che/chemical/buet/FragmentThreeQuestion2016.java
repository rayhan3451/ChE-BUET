package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/14/2019.
 */

public class FragmentThreeQuestion2016 extends Fragment {
    View view;
    public FragmentThreeQuestion2016() {
    }
    private WebView webView1011;
    String electiveche459text="<b><em><font color=\"#FF00FF\">CHEMICAL ENGINEERING SCIENCE</font></em></b>"+
            "<h3><b><strong>Materials Science</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Atomic bonding and crystal structure. Phase diagrams. Microstructures. Imperfection " +
            "in crystals. Phases and interfaces in material systems. Transport in materials. Phase " +
            "transformations. Annealing processes. Deformation of materials. Electrical, magnetic and " +
            "optical behaviour of materials. Fracture. Deterioration of materials, Electronic structure" +
            " and physical properties.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2016_question_fragment,container,false);
        webView1011 = (WebView) view.findViewById(R.id.elective012 );
        webView1011.loadDataWithBaseURL(null,electiveche459text,"text/html","utf-8",null);
        return view;
    }
}
