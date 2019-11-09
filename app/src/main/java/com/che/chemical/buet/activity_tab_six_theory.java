package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_six_theory extends FragmentActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_six_theory);

        tabLayout =(TabLayout) findViewById(R.id.six_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.six_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.six_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChefourtytwo(),"ChE 305");
        adapter.AddFragment(new FragmentChefourtythree(),"ChE 309");
        adapter.AddFragment(new FragmentChefourtyfour(),"ChE 311");
        adapter.AddFragment(new FragmentElectivefourtyfive(),"Elective IV");
        adapter.AddFragment(new FragmentElectivefourtysix(),"Elective V");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
