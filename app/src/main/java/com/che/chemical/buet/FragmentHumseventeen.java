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

public class FragmentHumseventeen extends Fragment {
    View view;
    public FragmentHumseventeen() {
    }
    private WebView webView16;
    String humseventeen="<h3><b><strong>Developing English Skills (Sessional)</strong></b></h3>"+
            "<h4><b><strong>1.5 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Grammar, Vocabulary Building, Developing Reading Skill, Developing\n" +
            "Writing Skill, Listening Skill And Note Taking, Developing Speaking Skill.</em></p><br><br><br><br><br><br><br><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.humseventeen_fragment,container,false);
        webView16 = (WebView) view.findViewById(R.id.subseventeen);
        webView16.loadDataWithBaseURL(null,humseventeen,"text/html","utf-8",null);


        return view;
    }
}
