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

public class FragmentChefiftynine extends Fragment {
    View view;
    public FragmentChefiftynine() {
    }
    private WebView webView58;
    String chefiftyninetext="<h3><b><strong>Corrosion Engineering</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Different materials: Non-metals, metals and alloys. Corrosion and its mechanisms; " +
            "different forms of corrosion; their mechanisms and remedial measures. Methods of corrosion" +
            " prevention. Steels, stainless steels and some of the common alloys used in process industries.</em></p><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefiftynine_fragment,container,false);
        webView58 = (WebView) view.findViewById(R.id.subfiftynine);
        webView58.loadDataWithBaseURL(null,chefiftyninetext,"text/html","utf-8",null);

        return view;
    }
}
