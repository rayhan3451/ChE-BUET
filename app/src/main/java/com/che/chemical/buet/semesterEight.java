package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterEight extends FragmentActivity {
    private Button button14;
    private Button button15;
    private Button buttonEightQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_eight);

        button14 = (Button) findViewById(R.id.semesterEightTheory_Button);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterEight.this,activity_tab_eight_theory.class);
                startActivity(intent);

            }
        });
        button15 = (Button) findViewById(R.id.semesterEightSession_Button);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterEight.this,activity_tab_eight_sessional.class);
                startActivity(intent);




            }
        });




    }
}
