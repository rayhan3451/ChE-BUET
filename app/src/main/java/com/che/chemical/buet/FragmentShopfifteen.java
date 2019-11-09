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

public class FragmentShopfifteen extends Fragment {
    View view;
    public FragmentShopfifteen() {
    }
    private WebView webView14;
    String shopfifteentext="<h3><b><strong>Workshop</strong></b></h3>"+
            "<h4><b><strong>1.50 credits</strong></b></h4>"+

            "<p>Workshop</p><br><br><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.shopfifteen_fragment,container,false);
        webView14 = (WebView) view.findViewById(R.id.subfifteen);
        webView14.loadDataWithBaseURL(null,shopfifteentext,"text/html","utf-8",null);

        return view;
    }
}
