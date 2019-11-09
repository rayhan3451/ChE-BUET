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

public class FragmentChefiftyfive extends Fragment{
    View view;
    public FragmentChefiftyfive() {
    }
    private WebView webView54;
    String chefiftyfivetext="<h3><b><strong>Chemical Engineering Laboratory V</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Laboratory work on fuel testing and based on ChE 401 and ChE 403.</em></p><br><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefiftyfive_fragment,container,false);
        webView54 = (WebView) view.findViewById(R.id.subfiftyfive);
        webView54.loadDataWithBaseURL(null,chefiftyfivetext,"text/html","utf-8",null);

        return view;
    }
}
