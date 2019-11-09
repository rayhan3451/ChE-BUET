package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class activity_tab_four_theory extends FragmentActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_four_theory);

        tabLayout =(TabLayout) findViewById(R.id.four_theory_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.four_theory_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.four_theory_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentChetwentysix(),"ChE 205");
        adapter.AddFragment(new FragmentMetwentyseven(),"ME 243");
        adapter.AddFragment(new FragmentMathtwentyeight(),"Math 223");
        adapter.AddFragment(new FragmentChemtwentynine(),"Chem 221");
        adapter.AddFragment(new FragmentElectivethirty(),"Elective I");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
