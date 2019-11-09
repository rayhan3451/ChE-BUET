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

public class FragmentChefiftytwo extends Fragment {
    View view;
    public FragmentChefiftytwo() {
    }
    private WebView webView51;
    String chefiftytwotext="<h3><b><strong>Process Design I</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction, process design developing and considerations. Cost estimation." +
            " Depreciation. Optimum design and economic design criteria. Design and costing of" +
            " process equipment: pumps, compressors, turbines,heat exchanger, mass transfer columns," +
            " vessels, reactors etc. Selection of materials for equipment and services, Computer " +
            "aided design.</em></p><br><br><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefiftytwo_fragment,container,false);
        webView51 = (WebView) view.findViewById(R.id.subfiftytwo);
        webView51.loadDataWithBaseURL(null,chefiftytwotext,"text/html","utf-8",null);

        return view;
    }
}
