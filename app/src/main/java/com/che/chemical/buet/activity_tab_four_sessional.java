package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_four_sessional extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_four_sessional);

        tabLayout =(TabLayout) findViewById(R.id.four_sessional_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.four_sessional_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.four_sessional_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChethirtyone(),"ChE 202");
        adapter.AddFragment(new FragmentChethirtytwo(),"ChE 206");
        adapter.AddFragment(new FragmentChemthirtythree(),"Chem 222");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
