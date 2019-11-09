package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_three_sessional extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_three_sessional);

        tabLayout =(TabLayout) findViewById(R.id.three_sessional_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.three_sessional_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.three_sessional_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChetwentythree(),"Che 208");
        adapter.AddFragment(new FragmentEeetwentyfour(),"EEE 268");
        adapter.AddFragment(new FragmentChemtwentyfive(),"Chem 236");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
