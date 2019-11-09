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

public class FragmentChefourtyfour extends Fragment {
    View view;
    public FragmentChefourtyfour() {
    }
    private WebView webView43;
    String chefourtyfourtext="<h3><b><strong>Special Topics in Unit Operations</strong></b></h3>"+
            "<h4><b><strong>4.00 credits, 4 hours/week</strong></b></h4>"+

            "<p><em>(The emphasis of the course is on equipment design and industrial practice) Mechanical" +
            " separation: gravity settlers; impingement separations; centrifugal separators and scrubbers.</em></p><br>"+

            "<p><em>Crushing and grinding. Solid handling machinery. Fluid moving machinery. Ejectors and vacuum systems." +
            " Pressure relieving devices. Mixing and agitation. Crystallization, drying and evaporation.</em></p><br><br>";



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefourtyfour_fragment,container,false);
        webView43 = (WebView) view.findViewById(R.id.subfourtyfour);
        webView43.loadDataWithBaseURL(null,chefourtyfourtext,"text/html","utf-8",null);

        return view;
    }
}
