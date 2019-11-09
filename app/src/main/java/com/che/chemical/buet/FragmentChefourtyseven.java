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

public class FragmentChefourtyseven extends Fragment {
    View view;
    public FragmentChefourtyseven() {
    }
    private WebView webView46;
    String chefourtyseventext="<h3><b><strong>Chemical Engineering Laboratory III</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Laboratory work based on ChE 301, ChE 303 and ChE 305.</em></p><br><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefourtyseven_fragment,container,false);
        webView46 = (WebView) view.findViewById(R.id.subfourtyseven);
        webView46.loadDataWithBaseURL(null,chefourtyseventext,"text/html","utf-8",null);

        return view;
    }
}
