package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/25/2018.
 */

public class FragmentEeetwentyfour extends Fragment {
    View view;
    public FragmentEeetwentyfour() {
    }
    private WebView webView23;
    String eeetwentyfourtext="<h3><b><strong>Electrical and Electronic Technology Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Laboratory experiments based on EEE 267(N).</em></p><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.eeetwentyfour_fragment,container,false);
        webView23 = (WebView) view.findViewById(R.id.subtwentyfour);
        webView23.loadDataWithBaseURL(null,eeetwentyfourtext,"text/html","utf-8",null);

        return view;
    }
}
