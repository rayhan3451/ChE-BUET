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

public class FragmentThreeQuestion2015 extends Fragment {
    View view;
    public FragmentThreeQuestion2015() {
    }
    private WebView webView1012;
    String electiveche471text="<b><em><font color=\"#2ECC40\">BIOCHEMICAL ENGINEERING</font></em></b>"+
            "<h3><b><strong>Biochemistry</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction: molecular logic of living system. Biomolecules and cells. Sugars, " +
            "polysaccharides, lipids-triglycerides, phospholipids, biological membranes. Proteins:" +
            " aminoacid sequences, primary, secondary, tertiary and quaternary structure; classification" +
            " of proteins. Enzymes mechanism: kinetics and inhibition. Nucleic acid: nucleotides. DNA," +
            " RNA composition and simple structure; replication, transcription and translation. Genetic" +
            " code and genetic engineering. Vitamins and coenzymes. Digestion of polysaccharides, lipids" +
            " and proteins. Metabolism and energy transfer; glycolysis and oxidative phosphorylation;" +
            " biological high-energy compounds. Oxidation of fatty acids and oxidative degradation of " +
            "amino acids. Photosynthetic phosphorylation. Interrelationship and control metabolism." +
            " Some inborn errors of metabolism.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2015_question_fragment,container,false);
        webView1012 = (WebView) view.findViewById(R.id.elective013 );
        webView1012.loadDataWithBaseURL(null,electiveche471text,"text/html","utf-8",null);
        return view;
    }
}
