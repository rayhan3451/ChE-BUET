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

public class FragmentExtraOne extends Fragment {
    View view;
    public FragmentExtraOne() {
    }
    private WebView webView1018;
    String electiveche491text="<b><em><font color=\"#728C00\">PETROLEUM ENGINEERING</font></em></b>"+
            "<h3><b><strong>Natural Gas Engineering</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction to the natural gas industry in Bangladesh. Phase behavior of natural " +
            "gas. Water-hydrocarbon systems. Gas well deliverability and tests of natural gas wells. " +
            "Field processing of natural gas: dehydration and sweetening techniques; liquid hydrocarbon " +
            "recovery; selection of processing plant and equipment.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.extra_one_fragment,container,false);
        webView1018 = (WebView) view.findViewById(R.id.extra_one);
        webView1018.loadDataWithBaseURL(null,electiveche491text,"text/html","utf-8",null);
        return view;
    }
}
