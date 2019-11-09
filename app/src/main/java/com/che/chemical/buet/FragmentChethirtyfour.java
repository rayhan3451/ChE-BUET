package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/28/2018.
 */

public class FragmentChethirtyfour extends Fragment {
    View view;
    public FragmentChethirtyfour() {
    }
    private WebView webView33;
    String chethirtyfourtext="<h3><b><strong>Heat Transfer</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Modes of heat transfer. Conduction: mechanism of thermal conduction in solids," +
            " liquids and gases; other thermal properties; steady state heat conduction in one " +
            "dimension; transient heat conduction. The basic equation of momentum and heat transport." +
            " Some approximate solutions of convection heat transfer. Dimensionless correlations for" +
            " forced and free convection. Heat transfer with phase change: boiling and condensation." +
            " Thermal radiation: black body radiation; exchange between infinite and finite surfaces" +
            " indifferent enclosures. Types of heat transfer equipment. Design of heat exchangers; " +
            "mean temperature difference in different flow arrangements; thermal and mechanical design;" +
            " materials of construction. Extended surfaces.</em></p><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chethirtyfour_fragment,container,false);
        webView33 = (WebView) view.findViewById(R.id.subthirtyfour);
        webView33.loadDataWithBaseURL(null,chethirtyfourtext,"text/html","utf-8",null);

        return view;
    }
}
