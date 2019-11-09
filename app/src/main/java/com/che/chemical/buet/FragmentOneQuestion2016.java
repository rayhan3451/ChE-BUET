package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 1/13/2019.
 */

public class FragmentOneQuestion2016 extends Fragment {
    View view;
    public FragmentOneQuestion2016() {
    }
    private WebView webView103;
    String electivephy303text="<h3><b><strong>Electrical and Magnetic Properties</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><u>Free Electron Theory</u>: <em>Free electron theory of metals, density of states, Fermi-Energy," +
            " Explanation of electrical and thermal conductivity, specific heat, transport phenomena.</em></p><br>"+

            "<p><u>Band Theory of Solid</u>: <em>Crystal periodicity and Bloch function, Nearly free electron approximation. " +
            "Tight binding approximation, Band gap E-K curve. Classification of metal, insulators and semi-conductors.</em></p><br>"+

            "<p><u>Semiconductors</u>: <em>Intrinsic and impurity semiconductors. Transport property of semiconductors. Frequency dependent " +
            "conductivity. Contact phenomena, p-n junction. p-n-p and n-p-n type semiconductor junctions and their characteristic properties.</em></p><br>"+

            "<p><u>Superconductivity</u>:<em> Meissner effect. London’s theory. Type-I and Type-II superconductors. Thermodynamics of superconducting transitions." +
            " Coopers pair. BCS theory. High Tc superconductors.</em></p><br>"+

            "<p><u>Magnetism</u>:<em> Different types of magnetic materials. Para, Ferro-Ferri- and antiferro-magnetic materials. Weiss theory of ferro-magnetism. Exchange energy." +
            " Neel’s theory of antiferromagnetism. Domains and Domain wall’s Magnetic anisotropy. Magnetostriction.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.one_2016_question_fragment,container,false);
        webView103 = (WebView) view.findViewById(R.id.elective03);
        webView103.loadDataWithBaseURL(null,electivephy303text,"text/html","utf-8",null);
        return view;
    }
}
