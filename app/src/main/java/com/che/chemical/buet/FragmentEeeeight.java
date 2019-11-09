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

public class FragmentEeeeight extends Fragment {
    View view;
    public FragmentEeeeight() {
    }
    private WebView webView7;
    String eeeeighttext="<h3><b><strong>Electrical Engineering Fundamentals Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Laboratory experiments based on EEE 155.</em></p><br><br><br><br><br><br><br><br><br><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.eeeeight_fragment,container,false);
        webView7 = (WebView) view.findViewById(R.id.subeight);
        webView7.loadDataWithBaseURL(null,eeeeighttext,"text/html","utf-8",null);
        return view;
    }
}
