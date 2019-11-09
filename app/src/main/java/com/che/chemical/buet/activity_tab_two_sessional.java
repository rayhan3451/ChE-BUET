package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_two_sessional extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_two_sessional);

        tabLayout =(TabLayout) findViewById(R.id.two_sessional_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.two_sessional_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.two_sessional_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChemfourteen(),"Chem 116");
        adapter.AddFragment(new FragmentShopfifteen(),"Shop 120");
        adapter.AddFragment(new FragmentMesixteen(),"ME 160");
        adapter.AddFragment(new FragmentHumseventeen(),"Hum 272");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
