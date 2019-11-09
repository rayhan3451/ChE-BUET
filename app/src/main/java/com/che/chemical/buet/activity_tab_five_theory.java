package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_five_theory extends FragmentActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_five_theory);

        tabLayout =(TabLayout) findViewById(R.id.five_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.five_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.five_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChethirtyfour(),"ChE 301");
        adapter.AddFragment(new FragmentChethirtyfive(),"ChE 303");
        adapter.AddFragment(new FragmentChethirtysix(),"ChE 307");
        adapter.AddFragment(new FragmentElectivethirtyseven(),"Elective II");
        adapter.AddFragment(new FragmentElectivethirtyeight(),"Elective III");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
