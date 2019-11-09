package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/23/2018.
 */

public class FragmentPhysix extends Fragment {
    View view;
    public FragmentPhysix() {
    }
    private WebView webView5;
    String physixtext="<h3><b><strong>Physics Sessional</strong></b></h3>"+
            "<h4><b><strong>1.50 credits, 3 hours/week</strong></b></h4>"+
            "<p><b>1-W₂</b><br><em>Determination of the frequency of a tuning fork by Melde's apparatus.</em></p><br>"+
            "<p><b>2-W₃ </b><br><em>Determination of the Spring constant and the effective mass of a loaded spring.</em></p><br>"+
            "<p><b>3-H₂ </b><br><em>Determination of the pressure-coefficient of air by a constant volume air thermometer.</em></p><br>"+
            "<p><b>4-H₄</b><br><em>Determination of the thermal conductivity of a bad conductor by Lee's method.</em></p><br>"+
            "<p><b>5-O₄</b><br><em>Determination of the radius of curvature of a Plano-convex lens by the Newton's ring method.</em></p><br>"+
            "<p><b>6-O₅</b><br><em>Determination of the specific rotation of sugar solution by a polarimeter.</em></p><br>"+
            "<p><b>7-M₁ </b><br><em>Determination of the threshold frequency for the material of a photo-cathode and hence find the value of the Planck's \n" +
            "        constant.</em></p><br>"+
            "<p><b>8-W₄</b><br><em>Determination of the acceleration due to gravity 'g' by means of a compound pendulum.</em></p><br>"+
            "<p><b>9-H₅</b><br><em>To plot the thermo-electromotive force vs temperature (Calibration) curve for a given thermocouple.</em></p><br>"+
            "<p><b>10-H₆ </b><br><em>Determination of the melting point of a solid using the calibration curve obtained in experiment H₅.</em></p><br>"+
            "<p><b>11-H₇</b><br><em>Determination of the mechanical equivalent of heat by the electrical method.</em></p><br>"+
            "<p><b>12-E₃</b><br><em>To verify Biot-Savart law and Tangent law.</em></p><br>"+
            "<p><b>13-E₁ </b><br><em>Determination of unknown resistances and verification of the laws of resistances by P.O. (Post Office) Box.</em></p><br>"+
            "<p><b>14-E₅</b><br><em>Determination of the temperature coefficent of the resistance of the material of a wire.</em></p><br>"+
            "<p><b>15-M₂</b><br><em>Determination of the linear absorption coefficient and mass absorption coefficient of Aluminum using a <sup>137</sup>Cs radioactive source and\n" +
            "        verification of the inverse square law of gamma radiation.</em></p><br><br>";








    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.physix_fragment,container,false);
        webView5 = (WebView) view.findViewById(R.id.subsix);
        webView5.loadDataWithBaseURL(null,physixtext,"text/html","utf-8",null);
        return view;
    }
}
