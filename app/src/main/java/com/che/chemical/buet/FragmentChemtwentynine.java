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

public class FragmentChemtwentynine extends Fragment {
    View view;
    public FragmentChemtwentynine() {
    }
    private WebView webView28;
    String chemtwentyninetext="<h3><b><strong>Organic Chemistry</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>The hybridization of carbon atom and covalent bonding. A comprehensive study " +
            "of aliphatic hydrocarbons with special reference to nomenclatures, method of preparation," +
            " properties and important uses. Types of reactions of aliphatic hydrocarbons and their " +
            "industrial applications. Structure, nomenclature, preparation, properties, reactions and" +
            " industrial applications of aliphatic hydrocarbon homologues. Aromatic compounds and " +
            "aromaticity; preparation, properties, reactions and industrial applications of benzene " +
            "and its derivatives. Heterocyclic compounds and their applications.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemtwentynine_fragment,container,false);
        webView28 = (WebView) view.findViewById(R.id.subtwentynine);
        webView28.loadDataWithBaseURL(null,chemtwentyninetext,"text/html","utf-8",null);

        return view;
    }
}
