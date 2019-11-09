package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/23/2018.
 */

public class FragmentChemtwo extends Fragment {
    View view;
    public FragmentChemtwo() {
    }
    private WebView webView1;
    String chemtwotext="<h3><b>Inorganic Chemistry</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Modern concept of atomic structure; periodic table and its " +
            "application isotopes and application of radioactive isotopes; brief " +
            "discussion on noble gas; different types of chemical bonds, wave nature " +
            "of electron, advanced concept of chemical bonds, hybridization, " +
            "molecular structure; theories of coordination compounds, application of " +
            "stability of complex compounds. General treatment of the elements of different" +
            " groups. Modern theories of acids and bases.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemtwo_fragment,container,false);
        webView1 = (WebView) view.findViewById(R.id.subtwo);
        webView1.loadDataWithBaseURL(null,chemtwotext,"text/html","utf-8",null);


        return view;
    }
}
