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

public class FragmentOneQuestion2014 extends Fragment {
    View view;
    public FragmentOneQuestion2014() {
    }
    private WebView webView105;
    String electivemme391text="<h3><b><strong>Fundamental Metallurgy</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>History of the development of Metallurgy. Production of pig iron and steel." +
            " Extraction of copper and aluminum. Mechanical and Physical Properties of Metals. " +
            "Crystalline Structure of Metals. Metallography. Phase diagram of the Fe- C system. " +
            "Heat treatment of steel. Metal and metallic alloys such as cast iron, plain carbon steels," +
            " low alloy steels, stainless steels, copper and copper alloys, aluminum, lead, nickel alloys," +
            " titanium and titanium alloys. Numerical designation of alloy steels. High temperature alloys." +
            " Metal forming, non – destructive testing.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.one_2014_question_fragment,container,false);
        webView105 = (WebView) view.findViewById(R.id.elective05);
        webView105.loadDataWithBaseURL(null,electivemme391text,"text/html","utf-8",null);
        return view;
    }
}
