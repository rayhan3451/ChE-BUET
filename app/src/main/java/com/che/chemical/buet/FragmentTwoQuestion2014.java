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

public class FragmentTwoQuestion2014 extends Fragment {
    View view;
    public FragmentTwoQuestion2014() {
    }
    private WebView webView1004;
    String electiveche439text="<b><em><font color=\"#0074D9\">CHEMICAL TECHNOLOGY</font></em></b>"+
            "<h3><b><strong>Polymer Processing</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction to processing principles: mechanical, electrical, thermal" +
            " and optical properties of polymeric materials with special reference to time-temperature" +
            " and environmental effects and testing standards. Formulation and compounding: principles" +
            " and practice, degradation and stabilization of polymers. Rheological properties of polymeric " +
            "melt-solutions and suspension, and their measurements. Flow in channels of simple cross-section." +
            " Basic heat transfer. Analysis of the principles of extrusion, injection molding, film blowing," +
            " calendaring, mixing etc. for sizing equipment, power requirements and understanding of process" +
            " performance. Processes and operations, planning of processing facilities, layout and maintenance." +
            " Health and safety measures.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2014_question_fragment,container,false);
        webView1004 = (WebView) view.findViewById(R.id.elective005);
        webView1004.loadDataWithBaseURL(null,electiveche439text,"text/html","utf-8",null);
        return view;
    }
}
