package com.che.chemical.buet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CardActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView semesterOne,semesterTwo,semesterThree,semesterFour,semesterFive,semesterSix,semesterSeven,semesterEight,chemical,builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        semesterOne =(CardView) findViewById(R.id.semesterOne);
        semesterTwo =(CardView)findViewById(R.id.semesterTwo);
        semesterThree =(CardView)findViewById(R.id.semesterThree);
        semesterFour =(CardView)findViewById(R.id.semesterFour);
        semesterFive =(CardView)findViewById(R.id.semesterFive);
        semesterSix =(CardView)findViewById(R.id.semesterSix);
        semesterSeven =(CardView)findViewById(R.id.semesterSeven);
        semesterEight =(CardView)findViewById(R.id.semesterEight);
        chemical =(CardView)findViewById(R.id.about_chemical);
        builder =(CardView)findViewById(R.id.about_builder);

        semesterOne.setOnClickListener(this);
        semesterTwo.setOnClickListener(this);
        semesterThree.setOnClickListener(this);
        semesterFour.setOnClickListener(this);
        semesterFive.setOnClickListener(this);
        semesterSix.setOnClickListener(this);
        semesterSeven.setOnClickListener(this);
        semesterEight.setOnClickListener(this);
        chemical.setOnClickListener(this);
        builder.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case  R.id.semesterOne : intent =new Intent(this,semesterOne.class);startActivity(intent);break;
            case R.id.semesterTwo : intent =new Intent(this,semesterTwo.class);startActivity(intent);break;
            case R.id.semesterThree :intent =new Intent(this,semesterThree.class);startActivity(intent);break;
            case R.id.semesterFour :intent =new Intent(this,semesterFour.class);startActivity(intent);break;
            case R.id.semesterFive :intent =new Intent(this,semesterFive.class);startActivity(intent);break;
            case R.id.semesterSix :intent =new Intent(this,semesterSix.class);startActivity(intent);break;
            case R.id.semesterSeven :intent =new Intent(this,semesterSeven.class);startActivity(intent);break;
            case R.id.semesterEight :intent =new Intent(this,semesterEight.class);startActivity(intent);break;
            case R.id.about_chemical :intent =new Intent(this,about_chemical.class);startActivity(intent);break;
            case R.id.about_builder :intent =new Intent(this,about_builder.class);startActivity(intent);break;
            default:break;



        }

    }
}
