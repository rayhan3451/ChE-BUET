package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/24/2018.
 */

public class FragmentPhyten extends Fragment {
    View view;
    public FragmentPhyten() {
    }
    private WebView webView9;
    String phytentext="<h3><b><strong>Structure of matter, Electricity & magnetism and Modern Physics</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Structure of Matter: States of matter: solid, liquid and gas. Classification of solids:" +
            " amorphous, crystalline, ceramics and polymers. Atomic arrangement in solids. Different types " +
            "of bonds in solids: metallic, Vander Waals, covalent and ionic bond, packing in Solids, " +
            "Interatomic distance and forces of equilibrium, X-ray diffraction. Bragg’s law. plasticity " +
            "and elasticity. Distinction between metal, insulator and semi-conductor.</em></p><br>"+

            "<p><em><u>Electricity and magnetism:</u> Electric charge, Coulomb’s law. The electric field: calculation" +
            " of the electric field strength, E. A dipole in an electric flux and Gauss’s law. Some application " +
            "of Gauss’s law. Electric potential V. Relation between E and V. Electric potential energy. Capacitors." +
            " Capacitance, Dielectrics; An atomic view, Dielectrics and Gauss’s law; Current and resistance:" +
            " Current and current density, Ohm’s law. Resistivity: and atomic view, Ampere’s law, Faraday’s law," +
            " Lens’s law. Self-Inductance and Mutual Inductance, Magnetic properties of matter: magnetomotive force," +
            " magnetic field intensity. Permeability, Susceptibility, Classifications of magnetic materials, " +
            "Magnetization curves.</em></p><br>"+

            "<p><em><u>Modern Physics:</u> Michelson Morley’s experiment. Galilean transformation. Special theory of" +
            " relativity. Lorentz-transformation. Relative velocity. Length contraction. Time dilation." +
            " Mass-energy relation. Photoelectric effect. Compton effect, de-Broglie wave. Bohr’s atom model; " +
            "radioactive decay, half-life, mean life, isotopes. Nuclear binding energy, alpha, beta, gamma," +
            " decay.</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.phyten_fragment,container,false);
        webView9 = (WebView) view.findViewById(R.id.subten);
        webView9.loadDataWithBaseURL(null,phytentext,"text/html","utf-8",null);
        return view;
    }
}
