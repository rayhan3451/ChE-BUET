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

public class FragmentHumthirteen extends Fragment {
    View view;
    public FragmentHumthirteen() {
    }
    private WebView webView12;
    String humthirteen="<h3><b><strong>English</strong></b></h3>"+
            "<h4><b><strong>2.00 credits, 2 hours/week</strong></b></h4>"+

            "<p><em>General discussion, Grammatical Problems, English phonetics. Reading skill, " +
            "Vocabulary Writing skill: Principles of effective writing, Organization in writing, " +
            "Planning and Development, Composition, Précis writing. General Strategies for The " +
            "Writing Process: Generating Ideas, Identifying Audiences and Purposes, Constructive" +
            " Arguments, Stating Problems, Drafting and Finalizing. Approaches to communication," +
            " Specific Applications of: Tenders and Quotations, Resume and Job Letters, Journal " +
            "Articles, Technical and Scientific Presentation.</em><p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.humthirteen_fragment,container,false);
        webView12 = (WebView) view.findViewById(R.id.subthirteen);
        webView12.loadDataWithBaseURL(null,humthirteen,"text/html","utf-8",null);
        return view;
    }
}
