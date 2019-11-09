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

public class FragmentPhyone extends Fragment {
    View view;
    public FragmentPhyone() {
    }
    private WebView webView;
    String phyonetext="<h3><b><strong>Physical Optics, Heat, Waves & Oscillation</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em><u>Physical Optics</u>: Theories of light. Huygen’s principle and construction. " +
            "Interference of light. Young’s double slit experiment. Fresnel bi-prism. " +
            "Newton’s rings. Interferometers. Diffraction of light. Fresnel and Fraunhoffer" +
            " diffraction. Diffraction by single slit. Diffraction by double slit. " +
            "Diffraction grating. Polarization, production and analysis of polarized " +
            "light. Optical activity. Optics of crystals.</em></p><br>"+

            "<p><em><u>Heat and Thermodynamics</u>: Temperature, Zeroth law of thermodynamics. " +
            "Thermometers-Constant volume. Platinum resistance, thermocouple. First law" +
            " of thermodynamics and its application, Molar specific heats of gases, Isothermal" +
            " and adiabatic relations, work done by a gas, kinetic theory of gases. Explanation " +
            "of gas laws, Kinetic interpretation of temperature, Equipartition of energy and " +
            "calculation of ratio of specific heats. Mean free path. Vander Waals equation of" +
            " state. Second law of thermodynamics: reversible irreversible processes, Carnot cycle," +
            " Efficiency, Carnot’s theorem, Entropy.</em></p><br>"+

            "<p><em><u>Waves and Oscillations</u>: Oscillations: S.H.M., Damped S.H. oscillations, Forced " +
            "oscillations, Resonance, Vibrations of membranes and columns, Combination and " +
            "composition of S.H. motions, Lissajous’ figures. Transverse and longitudinal nature" +
            " of waves. Travelling and standing waves. Intensity of a wave. Energy calculation of " +
            "progressive and stationary waves, phase velocity, group velocity, Sound waves: " +
            "Velocity of longitudinal wave in a gaseous medium. Doppler effect. Architectural " +
            "acoustics: Sabines formula, Requisites of a good auditorium.</em></p><br><br>";




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.phyone_fragment,container,false);
        webView = (WebView) view.findViewById(R.id.subone);
        webView.loadDataWithBaseURL(null,phyonetext,"text/html","utf-8",null);

        return view;
    }
}
