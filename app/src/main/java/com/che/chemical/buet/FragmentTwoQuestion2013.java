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

public class FragmentTwoQuestion2013 extends Fragment {
    View view;
    public FragmentTwoQuestion2013() {
    }
    private WebView webView1005;
    String electiveche441text="<b><em><font color=\"#0074D9\">CHEMICAL TECHNOLOGY</font></em></b>"+
            "<h3><b><strong>Fertilizer, Pulp and Paper Technology</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>The world fertilizer market. Fertilizer industries in Bangladesh Nitrogen fertilizers" +
            " (ammonia, urea): raw materials, reaction kinetics, manufacturing processes, design considerations," +
            " status of production, comparative economics of different nitrogenous fertilizers. Phosphate" +
            " fertilizers (SSP, TSP): raw materials, reaction kinetics, manufacturing processes, design " +
            "considerations, comparative economics of different phosphate fertilizers. Manufacturing process " +
            "of different potash fertilizers and their uses. Complex and compound fertilizers and their economics." +
            " Waste disposal methods. The world pulp and paper market. Pulp and paper industries in Bangladesh." +
            " Types of raw materials, composition and chemical properties of wood. Preparation of raw material" +
            " for pulping. Comparative assessment of the different pulping processes. Kraft process: chemistry," +
            " digesters, black liquor recover unit. Bleaching, beating and sizing. Paper making. Waste disposal" +
            " methods.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2013_question_fragment,container,false);
        webView1005 = (WebView) view.findViewById(R.id.elective006 );
        webView1005.loadDataWithBaseURL(null,electiveche441text,"text/html","utf-8",null);
        return view;
    }
}
