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

public class FragmentOneQuestion2018 extends Fragment {
    View view;
    public FragmentOneQuestion2018() {
    }
    private WebView webView101;
    String electivemath321text="<h3><b><strong>Complex Variable, Bessel’s Function and Legendre Polynomials</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Complex Variable: Complex number system. General functions of a complex variable. Limits and continuity of a " +
            "function of complex variable and related theorems. Complex differentiation and the Cauchy-Riemann equations. Mapping " +
            "by elementary functions. Line integral of a complex function. Cauchy’s integral theorem. Cauchy’s integral formula. " +
            "Lioubille’s theorem. Taylor’s and Lauent’s theorem. Singular points. Residue. Cauchy’s residue theorem. Evaluation of " +
            "residues. Contour integration. Conformal mapping.</em></p><br>"+

            "<p><em>Bessel Function and Legendre polynomials: Solution of differential equations in series by the method of Frobenious." +
            " Bessel’s functions, Legendre’s polynomials and their properties.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.one_2018_question_fragment,container,false);
        webView101 = (WebView) view.findViewById(R.id.elective01);
        webView101.loadDataWithBaseURL(null,electivemath321text,"text/html","utf-8",null);
        return view;
    }
}
