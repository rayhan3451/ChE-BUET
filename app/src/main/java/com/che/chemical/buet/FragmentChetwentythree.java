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

public class FragmentChetwentythree extends Fragment {
    View view;
    public FragmentChetwentythree() {
    }
    private WebView webView22;
    String chetwentythree="<h3><b><strong>Computer Programming and Applications</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>An introductory course in Computer Programming and its applications to\n" +
            "simple problems in Chemical Engineering.</em></p><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chetwentythree_fragment,container,false);
        webView22 = (WebView) view.findViewById(R.id.subtwentythree);
        webView22.loadDataWithBaseURL(null,chetwentythree,"text/html","utf-8",null);

        return view;
    }
}
