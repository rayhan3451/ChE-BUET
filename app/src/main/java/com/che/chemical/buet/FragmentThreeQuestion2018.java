package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/14/2019.
 */

public class FragmentThreeQuestion2018 extends Fragment {
    View view;
    public FragmentThreeQuestion2018() {
    }
    private WebView webView1009;
    String electiveche455text="<b><em><font color=\"#FF00FF\">CHEMICAL ENGINEERING SCIENCE</font></em></b>"+
            "<h3><b><strong>Mathematical Models in Chemical Engineering</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Classification of mathematical models. Fundamental features of models. General " +
            "methods of solution. Application to problems in staged operations,fluid mechanics, heat " +
            "transfer and reactor design. Parameter estimation. Design of experiments. Optimization techniques.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2018_question_fragment,container,false);
        webView1009 = (WebView) view.findViewById(R.id.elective010 );
        webView1009.loadDataWithBaseURL(null,electiveche455text,"text/html","utf-8",null);
        return view;
    }
}
