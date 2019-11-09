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

public class FragmentTwoQuestion2011 extends Fragment {
    View view;
    public FragmentTwoQuestion2011() {
    }
    private WebView webView1007;
    String electiveche451text="<b><em><font color=\"#FF00FF\">CHEMICAL ENGINEERING SCIENCE</font></em></b>"+
            "<h3><b><strong>Fuels and Combustion Science</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Energy situation and sources in Bangladesh. Classification and analysis of fuels." +
            " Essential properties of fuels. Purification and fuels processing. Storage and handling of " +
            "fuels (designing of systems and facilities). Energy saving devices. Design and sizing of " +
            "burners. Combustion chambers, furnaces and stack for different fuels. Kinetics of combustion." +
            " Evaluation of burner and furnace operations. Sampling and analysis of flue gases. Design and" +
            " operation of kilns and furnaces. Environmental consideration of energy use.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2011_question_fragment,container,false);
        webView1007 = (WebView) view.findViewById(R.id.elective008 );
        webView1007.loadDataWithBaseURL(null,electiveche451text,"text/html","utf-8",null);
        return view;
    }
}
