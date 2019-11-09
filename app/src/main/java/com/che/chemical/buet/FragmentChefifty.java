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

public class FragmentChefifty extends Fragment {
    View view;
    public FragmentChefifty() {
    }
    private WebView webView49;
    String chefiftytext="<h3><b><strong>Reaction Engineering</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Kinetics of homogeneous reactions: variables affecting rate; elementary and " +
            "non-elementary reactions. Thermodynamics of chemical reactions: temperature and pressure" +
            " effects. Basic concepts in chemical kinetics: determination of the reaction rate expression;" +
            "molecular interpretations of kinetic phenomena; multiple reactions; autocatalytic reactions." +
            " Basic concepts in reactor design: types of reactors; ideal reactors; recycle reactor; " +
            "autocatalytic reactors; isothermal operation; treatment of multiple reactions; temperature" +
            " and energy effects in chemical reactors; optimum temperature progression. Kinetics of " +
            "heterogeneous reactions; mechanism of catalysis; types of catalysis; operation and properties" +
            " of catalysts.</em></p><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefifty_fragment,container,false);
        webView49 = (WebView) view.findViewById(R.id.subfifty);
        webView49.loadDataWithBaseURL(null,chefiftytext,"text/html","utf-8",null);

        return view;
    }
}
