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

public class FragmentTwoQuestion2017 extends Fragment {
    View view;
    public FragmentTwoQuestion2017() {
    }
    private WebView webView1001;
    String electiveche433text="<b><em><font color=\"#0074D9\">CHEMICAL TECHNOLOGY</font></em></b>"+
            "<h3><b><strong>Polymers and Petrochemicals</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction, Prospect of polymer and petrochemical industries in Bangladesh. " +
            "Raw materials of polymers and petrochemicals. Petrochemicals: reaction mechanism, " +
            "kinetics, manufacturing technologies and uses of ammonia, methanol, oxochemicals," +
            " acetylene, vinylchloride, synthetic detergents, olefins, dienes, waxes and aromatics." +
            " Polymers: classification of polymeric materials and their chemical structure;" +
            " nomenclature for polymers; molecular weight and its measurement; polymerization" +
            " mechanisms and methods; reactor types; manufacture and technological properties of PE," +
            " PP, PVC, PVA, PTFE, nylons, polyesters and rubbers " +
            "(butadiene, isoprene, styrene).</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2017_question_fragment,container,false);
        webView1001 = (WebView) view.findViewById(R.id.elective002);
        webView1001.loadDataWithBaseURL(null,electiveche433text,"text/html","utf-8",null);

        return view;
    }
}
