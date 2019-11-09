package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_three_theory extends FragmentActivity{

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_three_theory);

        tabLayout =(TabLayout) findViewById(R.id.three_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.three_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.three_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentCheeightteen(),"Che 201");
        adapter.AddFragment(new FragmentCheninteen(),"Che 203");
        adapter.AddFragment(new FragmentEeetwenty(),"EEE 267");
        adapter.AddFragment(new FragmentMathtwentyone(),"Math 221");
        adapter.AddFragment(new FragmentChemtwentytwo(),"Chem 235");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
