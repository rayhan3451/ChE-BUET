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

public class FragmentMefour extends Fragment {
    View view;
    public FragmentMefour() {
    }
    private WebView webView3;
    String mefourtext="<h3><b><strong>Engineering Mechanics</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Basic concepts of mechanics: Statics of particles and rigid bodies:" +
            " Centroids of lines: areas and volumes: Forces in trusses and frames." +
            " Friction: Moments of inertia of areas and masses. Relative motion Kinematics" +
            " of particles. Newton’s Second Law of motion. Principles of work and energy. " +
            "System of particles. Kinematics of rigid bodies. Kinematics of plane motion " +
            "of rigid bodies forces and acceleration.</em></p><br><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.mefour_fragment,container,false);
        webView3 = (WebView) view.findViewById(R.id.subfour);
        webView3.loadDataWithBaseURL(null,mefourtext,"text/html","utf-8",null);
        return view;
    }
}
