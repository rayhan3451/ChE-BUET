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

public class FragmentChefourty extends Fragment {
    View view;
    public FragmentChefourty() {
    }
    private WebView webView39;
    String chefourtytext="<h3><b><strong>Chemical Process Analysis Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Process description and calculations of the following industries: Gaseous liquid," +
            " solid & secondary fuels. sulfur compounds (sulfuric acid), nitrogen compounds (ammonia," +
            " urea), lime & cement, chloro-alkali industries, air-conditioning & refrigeration " +
            "(humidification-dehumidification), ceramic industry, phosphorus industry " +
            "(phosphate fertilizer), soap & detergent, sugar industry, pulp & paper industry, " +
            "fermentation industry, petroleum & petrochemicals.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefourty_fragment,container,false);
        webView39 = (WebView) view.findViewById(R.id.subfourty);
        webView39.loadDataWithBaseURL(null,chefourtytext,"text/html","utf-8",null);

        return view;
    }
}
