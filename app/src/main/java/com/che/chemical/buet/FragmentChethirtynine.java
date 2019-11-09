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

public class FragmentChethirtynine extends Fragment {
    View view;
    public FragmentChethirtynine() {
    }
    private WebView webView38;
    String chethirtyninetext="<h3><b><strong>Chemical Engineering Laboratory II</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Laboratory work based on ChE 301 and ChE 303.</em></p><br><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chethirtynine_fragment,container,false);
        webView38 = (WebView) view.findViewById(R.id.subthirtynine);
        webView38.loadDataWithBaseURL(null,chethirtyninetext,"text/html","utf-8",null);

        return view;
    }
}
