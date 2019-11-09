package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterSeven extends FragmentActivity {
    private Button button12;
    private Button button13;
    private Button buttonSevenQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_seven);

        button12 = (Button) findViewById(R.id.semesterSevenTheory_Button);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterSeven.this,activity_tab_seven_theory.class);
                startActivity(intent);



            }
        });

        button13 = (Button) findViewById(R.id.semesterSevenSession_Button);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterSeven.this,activity_tab_seven_sessional.class);
                startActivity(intent);


            }
        });


    }
}
