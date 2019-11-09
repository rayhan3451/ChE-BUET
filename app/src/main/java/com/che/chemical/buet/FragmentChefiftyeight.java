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

public class FragmentChefiftyeight extends Fragment {
    View view;
    public FragmentChefiftyeight() {
    }
    private WebView webView57;
    String chefiftyeighttext="<h3><b><strong>Process Design II</strong></b></h3>"+
            "<h4><b><strong>2.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Project definition. Technical specification. Design basis> Process licensing." +
            " Basic and detailed engineering. Codes and standards, engineering specifications. " +
            "Performance tests. Inspection. Procurement. Review and approval of engineering documents." +
            " Contract negotiation. Documentation.</em></p><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chefiftyeight_fragment,container,false);
        webView57 = (WebView) view.findViewById(R.id.subfiftyeight);
        webView57.loadDataWithBaseURL(null,chefiftyeighttext,"text/html","utf-8",null);

        return view;
    }
}
