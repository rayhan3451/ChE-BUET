package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterFive extends FragmentActivity {
    private Button button8;
    private Button button9;
    private Button buttonQuestionFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_five);

        button8 = (Button) findViewById(R.id.semesterFiveTheory_Button);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterFive.this,activity_tab_five_theory.class);
                startActivity(intent);

            }
        });
        button9 = (Button) findViewById(R.id.semesterFiveSession_Button);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterFive.this,activity_tab_five_sessional.class);
                startActivity(intent);

            }
        });


    }
}
