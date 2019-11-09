package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_eight_theory extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_eight_theory);

        tabLayout =(TabLayout) findViewById(R.id.eight_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.eight_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.eight_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChefiftyeight(),"ChE 407");
        adapter.AddFragment(new FragmentChefiftynine(),"ChE 409");
        adapter.AddFragment(new FragmentChesixty(),"ChE 411");
        adapter.AddFragment(new FragmentElectivesixtyone(),"Elective VIII");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
