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

public class FragmentThreeQuestion2014 extends Fragment {
    View view;
    public FragmentThreeQuestion2014() {
    }
    private WebView webView1013;
    String electiveche473text="<b><em><font color=\"#2ECC40\">BIOCHEMICAL ENGINEERING</font></em></b>"+
            "<h3><b><strong>Biochemical Engineering I</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction to biochemical engineering and concept of biological catalysis," +
            " nature of microorganisms, their requirements and classification, industrially important" +
            " microorganisms. Kinetics of enzyme catalyzed reactions, Michaelis-Menten equation, " +
            "immobilized-enzyme technology, immobilized enzyme kinetics. Metabolic stoichiometry and" +
            " energetics. Molecular genetics and control systems. Batch fermentation: yield coefficients" +
            " for biomass and product formation, rates of reaction, growth, limiting substrate concentrations," +
            " Monod’s equation.</em></p><br><br>";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2014_question_fragment,container,false);
        webView1013 = (WebView) view.findViewById(R.id.elective014 );
        webView1013.loadDataWithBaseURL(null,electiveche473text,"text/html","utf-8",null);
        return view;
    }
}
