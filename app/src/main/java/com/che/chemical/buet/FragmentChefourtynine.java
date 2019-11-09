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

public class FragmentChefourtynine extends Fragment {
    View view;
    public FragmentChefourtynine() {
    }
    private WebView webView48;
    String chefourtyninetext="<h3><b><strong>Computational Technique in Chemical Engineering</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Computational techniques in numerical methods of solution of algebraic and transcendental equations," +
            " integration and differential equations. Application to chemical engineering design and optimization problems.</em></p><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefourtynine_fragment,container,false);
        webView48 = (WebView) view.findViewById(R.id.subfourtynine);
        webView48.loadDataWithBaseURL(null,chefourtyninetext,"text/html","utf-8",null);

        return view;
    }
}
