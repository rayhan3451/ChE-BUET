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

public class FragmentTwoQuestion2018 extends Fragment {
    View view;
    public FragmentTwoQuestion2018() {
    }
    private WebView webView1000;
        String electiveche431text="<b><em><font color=\"#0074D9\">CHEMICAL TECHNOLOGY</font></em></b>"+
                "<h3><b><strong>Food Preservation and Processing</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Food composition: carbohydrates, lipids, proteins, vitamins, minerals, pectic substances" +
            " in food. Flavour, aroma and natural pigment of food. Enzymes: classification and function of " +
            "enzymes. Food analysis: nutritive value of protein, carbohydrate, vitamins and minerals. Effect " +
            "of cooking and processing on the nutritive value. Food additives. Fundamentals of microbiology: " +
            "microbes in food and fermentation industries. Morphology, physiology and genetics of bacteria," +
            " moulds, yeasts, fungi, actinomycetes and algae. Principles of serology and immunology. Viruses." +
            " Growth and destruction of microorganisms; growth curve. Physical and chemical factors influencing " +
            "the destruction of microorganisms, energy metabolism of aerobic and anaerobic microbes. Nitrogen" +
            " fixation. Microorganism in natural products and their control; source and prevention, general " +
            "principles of food preservation. Microbiology of atmosphere, water, milk and milk products, fish, " +
            "fruit, vegetables, meat, poultry products and canned foods. Basic principles of food plant sanitation." +
            " Food poisoning.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.two_2018_question_fragment,container,false);
        webView1000 = (WebView) view.findViewById(R.id.elective001);
        webView1000.loadDataWithBaseURL(null,electiveche431text,"text/html","utf-8",null);

        return view;
    }
}
