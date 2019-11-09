package com.che.chemical.buet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Mohammad Rayhan on 12/29/2018.
 */

public class FragmentElectivefiftyfour extends Fragment {
    View view;
    public FragmentElectivefiftyfour() {
    }
    private WebView webView53;
    String electivefiftyfourtext="<p><b><strong>With the consent of adviser the student will choose any approved*" +
            " 3rd level or above course, subject to fulfillment of the following requirements:</strong></b></p>"+

            "<p><b><strong>1. A student will choose any one of the chemical engineering specialization groups." +
            " From this group the student must collect 6 credits (2 courses).</strong></b></p>"+

            "<p><b><strong>2. Students, who choose Chemical Technology as their specialization group, must collect" +
            " at least 3 credits (1 course) from the Chemical Engineering Science group.</strong></b></p>"+

            "<p><b><strong>3. A student must have at least 3 credits (1 course) from the Chemical Technology group.</strong></b></p>"+

            "<p><b><strong>*A list of approved courses of other departments will be made available to the students.</strong></b></p><br><br>"+

            "<center><b><font color=\"#FF00FF\"><u>Here are the Courses for Elective III-VIII</u></font></b></center>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.electivefiftyfour_fragment,container,false);
        webView53 = (WebView) view.findViewById(R.id.subfiftyfour);
        webView53.loadDataWithBaseURL(null,electivefiftyfourtext,"text/html","utf-8",null);
        Button buttonQuestionOne = (Button) view.findViewById(R.id.elective_other);
        buttonQuestionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(),tab_one_question.class);
                startActivity(intent);
            }
        });

        Button buttonQuestionTwo = (Button) view.findViewById(R.id.semesterTwoQuestion_Button);
        buttonQuestionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(),tab_two_question.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
