package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/30/2018.
 */

public class FragmentChesixtythree extends Fragment {
    View view;
    public FragmentChesixtythree() {
    }
    private WebView webView62;
    String chesixtythreetext="<h3><b><strong>Process Design Sessional</strong></b></h3>"+
            "<h4><b><strong>3.50 credits, 3 hours/week in First term and\n" +
            "6 hours/week in Second term</strong></b></h4>"+

            "<p><em>Integrated design of a chemical plant considering related design considerations and cost estimation.</em></p><br>"+
            "<p><em>(A student will work for 3 hours per week in term 7 and 6 hours per week in term 8 for this course. " +
            "Credits will be given at the end of term 7 and term 8).</em></p><br><br><br><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chesixtythree_fragment,container,false);
        webView62 = (WebView) view.findViewById(R.id.subsixtythree);
        webView62.loadDataWithBaseURL(null,chesixtythreetext,"text/html","utf-8",null);

        return view;
    }
}
