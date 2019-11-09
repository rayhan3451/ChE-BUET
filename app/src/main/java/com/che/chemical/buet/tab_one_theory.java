package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class tab_one_theory extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_one_theory);

        tabLayout =(TabLayout) findViewById(R.id.one_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.one_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.one_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentPhyone(),"Phy 111");
        adapter.AddFragment(new FragmentChemtwo(),"Chem 111");
        adapter.AddFragment(new FragmentMaththree(),"Math 121");
        adapter.AddFragment(new FragmentMefour(),"ME 141");
        adapter.AddFragment(new FragmentEeefive(),"EEE 155");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
