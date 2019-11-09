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

public class FragmentChemfourtyone extends Fragment {
    View view;
    public FragmentChemfourtyone() {
    }
    private WebView webView40;
    String chemfourtyonetext="<h3><b><strong>Instrumental Methods of Analysis</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Spectrophotometry. Potentiometric titration; pH-titration." +
            " Conductometric titration. Thin layer chromatography.</em></p><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemfourtyone_fragment,container,false);
        webView40 = (WebView) view.findViewById(R.id.subfourtyone);
        webView40.loadDataWithBaseURL(null,chemfourtyonetext,"text/html","utf-8",null);

        return view;
    }
}
