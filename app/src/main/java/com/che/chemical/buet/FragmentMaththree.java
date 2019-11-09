package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/23/2018.
 */

public class FragmentMaththree extends Fragment {
    View view;
    public FragmentMaththree() {
    }
    private WebView webView2;
    String maththreetext="<h3><b><strong>Differential Calculus and Coordinate Geometry</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><u>Differential Calculus</u>:<p>"+

            "<p><em>Continuity and differentiability of a function, Successive differentiation " +
            "of various types of function. Leibnitz theorem. Rolle’s theorem, Mean value " +
            "theorem and expansion of functions. Partial differentiation. tangent and normal " +
            "in the cases of cartesian and polar co-ordinates, Maximum and minimum, " +
            "Indeterminant forms.</em></p><br>"+

            "<p><u>Co-ordinate Geometry</u>:</p>"+

            "<p><em>Changes of axes: Transformation of co-ordinates, simplification of equation" +
            " of curves, Conic section (pair of straight line, system of circle, parabola," +
            " Ellipse, Hyperbola).</em></p><br><br>";



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.maththree_fragment,container,false);
        webView2 = (WebView) view.findViewById(R.id.subthree);
        webView2.loadDataWithBaseURL(null,maththreetext,"text/html","utf-8",null);
        return view;
    }
}
