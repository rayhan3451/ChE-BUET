package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/13/2019.
 */

public class FragmentOneQuestion2017 extends Fragment {
    View view;
    public FragmentOneQuestion2017() {
    }
    private WebView webView102;
    String electivemath323text= "<h3><b><strong>Fourier Analysis, Harmonic Functions and partial Differential Equation</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

                    "<p><em>Fourier Analysis: Real and complex form. Finite transform. Fourier integral." +
                    " Fourier transforms and their uses in solving boundary value problems.</em></p><br>"+

                    "<p><em>Harmonic functions: Definition of harmonics, Laplace equation in cartesian," +
                    " polar cylindrical and spherical co-ordinates. Solutions of these equations together " +
                    "with applications. Gravitational potential due to a ring. Steady-state temperature. " +
                    "Potential inside or outside of a sphere. Properties of harmonic functions.</em></p><br>"+

                    "<p><em>Partial differential Equation: Introduction. Equations of the linear and non-linear first order." +
                    " Standard forms. Linear equations of higher order. Equations of the second order with variable coefficients.</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.one_2017_question_fragment,container,false);
        webView102 = (WebView) view.findViewById(R.id.elective02);
        webView102.loadDataWithBaseURL(null,electivemath323text,"text/html","utf-8",null);
        return view;
    }
}
