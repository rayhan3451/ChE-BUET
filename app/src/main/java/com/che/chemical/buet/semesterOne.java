package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterOne extends FragmentActivity {
    private Button button;
    private Button button1;
    private Button buttonQuestionOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_one);

        button = (Button) findViewById(R.id.semesterOneTheory_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterOne.this,tab_one_theory.class);
                startActivity(intent);


            }
        });

        button1 = (Button) findViewById(R.id.semesterOneSession_Button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterOne.this,activity_tab_one_sessional.class);
                startActivity(intent);
            }
        });


    }
}
