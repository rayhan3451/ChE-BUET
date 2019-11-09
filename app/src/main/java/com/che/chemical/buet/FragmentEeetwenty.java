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

public class FragmentEeetwenty extends Fragment {
    View view;
    public FragmentEeetwenty() {
    }
    private WebView webView19;
    String eeetwentytext="<h3><b><strong>Electrical and Electronic Technology</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Balanced three-phase circuits. Introduction to single-phase and three-phase" +
            " transformers. Principles of construction, operation and applications of DC generator," +
            " DC motor, synchronous generator, synchronous motor and induction motors.</em></p><br>"+


            "<p><em>Semiconductor diode, transistors, operational amplifiers (OPAMs), silicon-controlled " +
            "rectifiers (SCRs): principles of operation and applications. Oscilloscope, Transducers:" +
            " temperature, pressure, flow-rate, speed and torque measurements.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.eeetwenty_fragment,container,false);
        webView19 = (WebView) view.findViewById(R.id.subtwenty);
        webView19.loadDataWithBaseURL(null,eeetwentytext,"text/html","utf-8",null);

        return view;
    }
}
