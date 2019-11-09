package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/27/2018.
 */

public class FragmentElectivethirty extends Fragment {
    View view;
    public FragmentElectivethirty() {
    }
    private WebView webView29;
    String electivethirtytext="<p><b><strong>(1) Hum 103 : Economics (3 credits)</strong></b></p>"+
            "<p><b><strong>(2) Hum 109 : Social Psychology (3 credits)</strong></b></h3><p>"+


            "<h3><b><strong>(1) Economics</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Definition of Economics. Economics and Engineering.</em></p><br>"+

            "<p><em>Principles of Economics.</em></p><br>"+

            "<p><em>Microeconomics: The theory of demand and supply and their elasticities. " +
            "Price determination. Nature of an economic theory, applicability of economic theories " +
            "to the problems of developing countries. Indifference curve technique. Marginal analysis." +
            " Production, production function, types of productivity. Rational region of production" +
            " of an engineering firm. Concepts of market and market structure. Cost analysis and cost" +
            " function. small scale production and large-scale production. Optimization. Theory of " +
            "distribution.</em></p><br>"+

            "<p><em>Macroeconomics: Savings, investment, employment. National income analysis. " +
            "Inflation. Monetary policy, Fiscal policy and trade policy with reference to Bangladesh.</em></p><br>"+

            "<p><em>Economics of development and planning.</em><p><br><br>"+

            "<h3><b><strong>(2) Social Psychology</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Introduction to social psychology. The nature of social psychology. Social factors" +
            " in perceptual-Cognitive Processes: Social perception; person perception; Social attitudes; " +
            "the nature of attitude; the formation of attitude; the change of attitude. Socialization:" +
            " process of social learning; factors in conscience formation; socialization and family structure." +
            " Status and communication. Emerging norms and conformity. Leadership. Public opinion, propaganda " +
            "and advertisement. Youths and Drugs: Youths in Bangladesh; sources of frustration among youths." +
            " drugs as a menace to society and to individuals.</em></p><br><br>"+

            "<b><font color=\"#0074D9\">1. The list of elective courses offered for each term will be made available for the students.</font></b><br><br>"+

            "<b><font color=\"#0074D9\">2. A maximum of 12.5 credits in Humanities will be counted for graduation.</font></b><br><br><br><br>";







    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.electivethirty_fragment,container,false);
        webView29 = (WebView) view.findViewById(R.id.subthirty);
        webView29.loadDataWithBaseURL(null,electivethirtytext,"text/html","utf-8",null);

        return view;
    }
}
