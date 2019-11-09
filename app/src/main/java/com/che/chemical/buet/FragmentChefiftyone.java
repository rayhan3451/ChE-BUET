package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/29/2018.
 */

public class FragmentChefiftyone extends Fragment {
    View view;
    public FragmentChefiftyone() {
    }
    private WebView webView50;
    String chefiftyonetext="<h3><b><strong>Process Control</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Basic concepts of chemical process control: incentives for process control; " +
            "design aspects; hardware elements. Modelling for control purposes; development of " +
            "mathematical models; linearization of nonlinear systems; input-output model; transfer " +
            "functions. Dynamic and static behavior of chemical processes: first, second and higher " +
            "order processes; transportation lag; systems in series. Analysis and design of feedback" +
            " control systems: concept of feedback control; feedback controllers and final control " +
            "elements; block diagrams; closed loop responses; concept of stability; stability testing." +
            " Frequency response analysts: Bode diagrams; Nyquist plots; Bode and Nyquist stability" +
            " criteria; control system design by frequency response analysis.</em></p><br>"+

            "<p><em>Analysis and design of advanced control systems: control of system with large dead" +
            " time or inverse response; multiple-loop control systems; feedforward and ratio control;" +
            " adaptive and inferential control. Design of control systems for multivariable processes: " +
            "synthesis of alternative control configurations for multiple-input and multiple-output " +
            "processes; interaction and decoupling of control loops. Design of control systems for " +
            "complete plants.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefiftyone_fragment,container,false);
        webView50 = (WebView) view.findViewById(R.id.subfiftyone);
        webView50.loadDataWithBaseURL(null,chefiftyonetext,"text/html","utf-8",null);

        return view;
    }
}
