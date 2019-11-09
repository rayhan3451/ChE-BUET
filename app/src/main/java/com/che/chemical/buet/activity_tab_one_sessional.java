package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_one_sessional extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_one_sessional);

        tabLayout =(TabLayout) findViewById(R.id.one_sessional_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.one_sessional_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.one_sessional_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentPhysix(),"Phy 102");
        adapter.AddFragment(new FragmentChemseven(),"Chem 112");
        adapter.AddFragment(new FragmentEeeeight(),"EEE 156");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
