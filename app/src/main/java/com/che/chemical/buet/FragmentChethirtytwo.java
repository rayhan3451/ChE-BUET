package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/27/2018.
 */

public class FragmentChethirtytwo extends Fragment {
    View view;
    public FragmentChethirtytwo() {
    }
    private WebView webView31;
    String chethirtytwotext="<h3><b><strong>Chemical Engineering Laboratory I</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Laboratory work based on ChE 205.</em></p><br><br><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chethirtytwo_fragment,container,false);
        webView31 = (WebView) view.findViewById(R.id.subthirtytwo);
        webView31.loadDataWithBaseURL(null,chethirtytwotext,"text/html","utf-8",null);

        return view;
    }
}
