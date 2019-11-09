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

public class FragmentChethirtyone extends Fragment {
    View view;
    public FragmentChethirtyone() {
    }
    private WebView webView30;
    String chethirtyonetext="<h3><b><strong>Materials and Energy Balance Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Problem solving class based on Material and Energy balance course.</em></p><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chethirtyone_fragment,container,false);
        webView30 = (WebView) view.findViewById(R.id.subthirtyone);
        webView30.loadDataWithBaseURL(null,chethirtyonetext,"text/html","utf-8",null);


        return view;
    }
}
