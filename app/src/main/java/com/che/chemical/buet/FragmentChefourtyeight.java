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

public class FragmentChefourtyeight extends Fragment {
    View view;
    public FragmentChefourtyeight() {
    }
    private WebView webView47;
    String chefourtyeight="<h3><b><strong>Chemical Engineering Laboratory IV</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Laboratory work based on ChE 309 and ChE 311</em></p><br><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefourtyeight_fragment,container,false);
        webView47 = (WebView) view.findViewById(R.id.subfourtyeight);
        webView47.loadDataWithBaseURL(null,chefourtyeight,"text/html","utf-8",null);

        return view;
    }
}
