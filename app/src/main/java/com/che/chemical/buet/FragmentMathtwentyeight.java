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

public class FragmentMathtwentyeight extends Fragment {
    View view;
    public FragmentMathtwentyeight() {
    }
    private WebView webView27;
    String mathtwentyeighttext="<h3><b><strong>Numerical Analysis and Statistics</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Numerical Analysis: Interpolation: Simple difference, Newton’s formulae for " +
            "forward and backward interpolation. Divided differences. Tables of divided differences." +
            " Relation between divided differences and simple differences. Newton’s general " +
            "interpolation formula. Lagrange’s interpolation formula. Inverse interpolation by " +
            "Lagrange’s formula and by successive approximations. Numerical differentiation of " +
            "Newton’s forward and backward formula. Numerical integration. General quadrature " +
            "formula for equidistant ordinates. Trapezoidal rule. Simpson’s rule. Weddle’s rule. " +
            "Calculation of errors. Relative study of three rules. Gauss’s quadrature formula. " +
            "Legendre polynomials. Newton’s Cotes formula. Principles of least squares. Curve " +
            "fitting. Solution of algebraic and transcendental equations by graphical method." +
            " Regula-Falsi method. Newton-Raphson method, Geometrical significance. Convergence of " +
            "iteration and Newton- Raphson methods. Newton-Raphson method and iteration method for" +
            " the solution of simultaneous equations. Solution of ordinary first order differential" +
            " equations by Picard’s and Euler’s method. Runge-Kutta’s methods for solving differential" +
            " equation.</em><p><br>"+

            "<p><em>Statistics: Frequency distribution. Mean, median, mode and other measures of " +
            "central tendency. Standard deviation and other measures of dispersion. Moments, skewness" +
            " and kurtosis. Elementary probability theory and discontinuous probability distribution, " +
            "e.g. binomial, Poison and negative binomial. Continuous probability distributions, e.g." +
            " normal and exponential. Characteristics of distribution. Hypothesis testing and " +
            "regression analysis.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.mathtwentyeight_fragment,container,false);
        webView27 = (WebView) view.findViewById(R.id.subtwentyeight);
        webView27.loadDataWithBaseURL(null,mathtwentyeighttext,"text/html","utf-8",null);

        return view;
    }
}
