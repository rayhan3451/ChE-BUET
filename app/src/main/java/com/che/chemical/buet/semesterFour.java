package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterFour extends FragmentActivity {
    private Button button6;
    private Button button7;
    private Button buttonFourQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_four);

        button6 = (Button) findViewById(R.id.semesterFourTheory_Button);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterFour.this,activity_tab_four_theory.class);
                startActivity(intent);
            }
        });

        button7 = (Button) findViewById(R.id.semesterFourSession_Button);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterFour.this,activity_tab_four_sessional.class);
                startActivity(intent);



            }
        });


    }
}
