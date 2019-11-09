package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class tab_one_question extends FragmentActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_one_question);

        tabLayout =(TabLayout) findViewById(R.id.tab_one_question_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.tab_one_question_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.tab_one_question_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentOneQuestion2018(),"Math 321");
        adapter.AddFragment(new FragmentOneQuestion2017(),"Math 323");
        adapter.AddFragment(new FragmentOneQuestion2016(),"Phy 303");
        adapter.AddFragment(new FragmentOneQuestion2015(),"ME 347");
        adapter.AddFragment(new FragmentOneQuestion2014(),"MME 391");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
