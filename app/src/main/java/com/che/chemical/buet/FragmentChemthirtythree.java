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

public class FragmentChemthirtythree extends Fragment {
    View view;
    public FragmentChemthirtythree() {
    }
    private WebView webView32;
    String chemthirtythreetext="<h3><b><strong>Organic Chemistry Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Detection of elements in organic compounds. Identification of functional groups." +
            " Preparation of different organic compounds. Separation, purification and characterization" +
            " of organic compounds.</em></p><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemthirtythree_fragment,container,false);
        webView32 = (WebView) view.findViewById(R.id.subthirtythree);
        webView32.loadDataWithBaseURL(null,chemthirtythreetext,"text/html","utf-8",null);

        return view;
    }
}
