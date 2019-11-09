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

public class FragmentThreeQuestion2011 extends Fragment {
    View view;
    public FragmentThreeQuestion2011() {
    }
    private WebView webView1016;
    String electiveche483text="<b><em><font color=\"#dc143c\">ENVIRONMENTAL SCIENCE</font></em></b>"+
            "<h3><b><strong>Environmental Science II</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Water pollution: pollution source; source control. Municipal water treatment:" +
            " primary, secondary and tertiary treatment; sludge treatment disposal. Wastewater treatment;" +
            " disposal and reuse. Solid waste management: functional elements; treatment, disposal, " +
            "conservation and recovery. Hazardous waste management.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.three_2011_question_fragment,container,false);
        webView1016 = (WebView) view.findViewById(R.id.elective017 );
        webView1016.loadDataWithBaseURL(null,electiveche483text,"text/html","utf-8",null);
        return view;
    }
}
