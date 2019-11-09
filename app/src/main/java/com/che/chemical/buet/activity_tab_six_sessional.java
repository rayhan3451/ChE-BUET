package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_six_sessional extends FragmentActivity{
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_six_sessional);

        tabLayout =(TabLayout) findViewById(R.id.six_sessional_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.six_sessional_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.six_sessional_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChefourtyseven(),"ChE 304");
        adapter.AddFragment(new FragmentChefourtyeight(),"ChE 306");
        adapter.AddFragment(new FragmentChefourtynine(),"ChE 310");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
