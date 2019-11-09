package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterSix extends FragmentActivity {
    private Button button10;
    private Button button11;
    private Button buttonQuestionSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_six);

        button10 = (Button) findViewById(R.id.semesterSixTheory_Button);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterSix.this,activity_tab_six_theory.class);
                startActivity(intent);

            }
        });

        button11 = (Button) findViewById(R.id.semesterSixSession_Button);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterSix.this,activity_tab_six_sessional.class);
                startActivity(intent);

            }
        });


    }
}
