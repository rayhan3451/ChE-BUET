package com.che.chemical.buet;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesterThree extends FragmentActivity {
    private Button button4;
    private Button button5;
    private Button buttonThreeQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_three);

        button4 = (Button) findViewById(R.id.semesterThreeTheory_Button);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterThree.this, activity_tab_three_theory.class);
                startActivity(intent);
            }
        });

        button5 = (Button) findViewById(R.id.semesterThreeSession_Button);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesterThree.this,activity_tab_three_sessional.class);
                startActivity(intent);
            }
        });


    }

}
