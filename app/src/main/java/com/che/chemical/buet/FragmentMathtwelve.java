package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/24/2018.
 */

public class FragmentMathtwelve extends Fragment {
    View view;
    public FragmentMathtwelve() {
    }
    private WebView webView11;
    String mathtwelvetext="<h3><b><strong>Integral Calculus and Differential Equation</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><u>Integral Calculus</u>:</p>"+

           "<p><em>Integration by methods of substitution. Integration by the method of successive " +
            "reduction. Definite integrals with properties. Improper integrals. Beta and Gamma function." +
            " Area under a plane curve in cartesian and polar co-ordinates. Area of the region enclosed" +
            " by the two curves in cartesian and polar co-ordinates. Arc lengths of curves in cartesian " +
            "and polar co-ordinates. Area and volumes of surface revolution.</em></p><br>"+

            "<p><u>Differential Equation</u>:<em> Solutions of first order differential equations by various" +
            " method. Solutions of general linear equations of second and higher orders with constant coefficients." +
            " Solution of homogeneous linear equations. Applications.<em></p><br>"+

            "<p><em>Solution of differential equations of the higher order when the dependent and " +
            "independent variables are absent. Solution of differential equation by the method" +
            " based on the factorization of the operators.</em><p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.mathtwelve_fragment,container,false);
        webView11 = (WebView) view.findViewById(R.id.subtwelve);
        webView11.loadDataWithBaseURL(null,mathtwelvetext,"text/html","utf-8",null);
        return view;
    }
}
