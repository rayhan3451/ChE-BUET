package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterTwo extends FragmentActivity {
    private Button button2;
    private Button button3;
    private Button buttonQuestionTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_two);
        button2 = (Button) findViewById(R.id.semesterTwoTheory_Button);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterTwo.this,activity_tab_two_theory.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.semesterTwoSession_Button);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterTwo.this,activity_tab_two_sessional.class);
                startActivity(intent);

            }
        });


    }
}
