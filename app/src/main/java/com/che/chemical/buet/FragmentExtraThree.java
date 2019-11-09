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

public class FragmentExtraThree extends Fragment {
    View view;
    public FragmentExtraThree() {
    }
    private WebView webView1020;
    String electiveche495text="<b><em><font color=\"#728C00\">PETROLEUM ENGINEERING</font></em></b>"+
            "<h3><b><strong>Gas and Oil Well Drilling and Logging</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Gas and oil well drilling methods and equipment. Drilling fluids and their" +
            " properties. Cementing and well completion. Well logging; types of logging techniques;" +
            " interpretation of logging data.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.extra_three_fragment,container,false);
        webView1020 = (WebView) view.findViewById(R.id.extra_three);
        webView1020.loadDataWithBaseURL(null,electiveche495text,"text/html","utf-8",null);
        return view;
    }
}
