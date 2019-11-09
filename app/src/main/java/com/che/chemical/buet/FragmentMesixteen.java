package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/24/2018.
 */

public class FragmentMesixteen extends Fragment {
    View view;
    public FragmentMesixteen() {
    }
    private WebView webView15;
    String mesixteentext="<h3><b><strong>Mechanical Engineering Drawing-I</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction: Instruments and their uses: First and Third Angle Projections:\n" +
            "Orthographic Drawings: Isometric Views: Missing lines and views:\n" +
            "Sectional views and conventional practices: Auxiliary views.</em></p><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.mesixteen_fragment,container,false);
        webView15 = (WebView) view.findViewById(R.id.subsixteen);
        webView15.loadDataWithBaseURL(null,mesixteentext,"text/html","utf-8",null);

        return view;
    }
}
