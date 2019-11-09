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

public class FragmentEeefive extends Fragment {
    View view;
    public FragmentEeefive() {
    }
    private WebView webView4;
    String eeefivetext="<h3><b><strong>Electrical Engineering Fundamentals</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Electrical units and standards. Electrical networks and circuits theorems," +
            " introduction to measuring instruments.</em></p><br>"+

            "<p><em>Alternating current, RLC series, parallel circuits, " +
            "magnetic concepts and magnetic circuits.</em></p><br><br><br><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.eeefive_fragment,container,false);
        webView4 = (WebView) view.findViewById(R.id.subfive);
        webView4.loadDataWithBaseURL(null,eeefivetext,"text/html","utf-8",null);
        return view;
    }
}
