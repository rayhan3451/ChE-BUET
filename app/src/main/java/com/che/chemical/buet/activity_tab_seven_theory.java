package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_seven_theory extends FragmentActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_seven_theory);

        tabLayout =(TabLayout) findViewById(R.id.seven_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.seven_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.seven_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChefifty(),"ChE 401");
        adapter.AddFragment(new FragmentChefiftyone(),"ChE 403");
        adapter.AddFragment(new FragmentChefiftytwo(),"ChE 405");
        adapter.AddFragment(new FragmentElectivefiftythree(),"Elective VI");
        adapter.AddFragment(new FragmentElectivefiftyfour(),"Elective VII");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
