package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_two_theory extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_two_theory);

        tabLayout =(TabLayout) findViewById(R.id.two_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.two_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.two_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChenine(),"Che 111");
        adapter.AddFragment(new FragmentPhyten(),"Phy 155");
        adapter.AddFragment(new FragmentChemeleven(),"Chem 131");
        adapter.AddFragment(new FragmentMathtwelve(),"Math 123");
        adapter.AddFragment(new FragmentHumthirteen(),"Hum 125");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
