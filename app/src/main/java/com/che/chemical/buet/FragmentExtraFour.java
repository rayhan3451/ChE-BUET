package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/19/2019.
 */

public class FragmentExtraFour extends Fragment {
    View view;
    public FragmentExtraFour() {
    }
    private WebView webView1021;
    String electiveche497text="<b><em><font color=\"#728C00\">PETROLEUM ENGINEERING</font></em></b>"+
            "<h3><b><strong>Transmission and Distribution of Natural gas</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Gas gathering systems. Flow calculations. Sizing of pipes for distribution systems." +
            " Network analysis. Construction, protection and maintenance of distribution systems. Economic factors.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.extra_four_fragment,container,false);
        webView1021 = (WebView) view.findViewById(R.id.extra_four);
        webView1021.loadDataWithBaseURL(null,electiveche497text,"text/html","utf-8",null);
        return view;
    }
}
