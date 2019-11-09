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

public class FragmentChemfourteen extends Fragment {
    View view;
    public FragmentChemfourteen() {
    }
    private WebView webView13;
    String chemfourteentext="<h3><b><strong>Inorganic Analysis Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Complexometric titration. Analysis of water and some industrial products.</em></p><br><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chemfourteen_fragment,container,false);
        webView13 = (WebView) view.findViewById(R.id.subfourteen);
        webView13.loadDataWithBaseURL(null,chemfourteentext,"text/html","utf-8",null);
        return view;
    }
}
