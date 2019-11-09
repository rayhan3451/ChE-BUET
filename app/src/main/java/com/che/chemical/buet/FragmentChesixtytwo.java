package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/30/2018.
 */

public class FragmentChesixtytwo extends Fragment {
    View view;
    public FragmentChesixtytwo() {
    }
    private WebView webView61;
    String chesixtytwotext="<h3><b><strong>Project/Thesis II</strong></b></h3>"+
            "<h4><b><strong>6.00 credits, 6 hours/week for two terms</strong></b></h4>"+

            "<p><em>With the assistance of a teacher the student will select a problem in any field " +
            "of chemical engineering. The problem must require experimental work and not be merely a " +
            "paper thesis and must be sufficiently limited in scope so that the student can expect to " +
            "attain a satisfactory solution in one year of work. The purpose of this course is to make" +
            " the student responsible for planning and carrying out an engineering project and presenting " +
            "his work as an acceptable engineering report.</em></p><br>"+

            "<p><em>(A student will work for 6 hours per week in term 7 and 6 hours per week in term 8 " +
            "for this course. Credits will be given at the end of term 7 and term 8).</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chesixtytwo_fragment,container,false);
        webView61 = (WebView) view.findViewById(R.id.subsixtytwo);
        webView61.loadDataWithBaseURL(null,chesixtytwotext,"text/html","utf-8",null);

        return view;
    }
}
