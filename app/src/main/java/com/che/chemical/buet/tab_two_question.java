package com.che.chemical.buet;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class tab_two_question extends FragmentActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_two_question);

        tabLayout =(TabLayout) findViewById(R.id.tab_two_question_tablayout_id);
        appBarLayout =(AppBarLayout) findViewById(R.id.tab_two_question_appbar_id);
        viewPager =(ViewPager) findViewById(R.id.tab_two_question_viewpager_id);
        OneViewPagerAdapter adapter =new OneViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentTwoQuestion2018(),"ChE 431");
        adapter.AddFragment(new FragmentTwoQuestion2017(),"ChE 433");
        adapter.AddFragment(new FragmentTwoQuestion2016(),"ChE 435");
        adapter.AddFragment(new FragmentTwoQuestion2015(),"ChE 437");
        adapter.AddFragment(new FragmentTwoQuestion2014(),"ChE 439");
        adapter.AddFragment(new FragmentTwoQuestion2013(),"ChE 441");
        adapter.AddFragment(new FragmentTwoQuestion2012(),"ChE 443");
        adapter.AddFragment(new FragmentTwoQuestion2011(),"ChE 451");
        adapter.AddFragment(new FragmentTwoQuestion2010(),"ChE 453");
        adapter.AddFragment(new FragmentThreeQuestion2018(),"ChE 455");
        adapter.AddFragment(new FragmentThreeQuestion2017(),"ChE 457");
        adapter.AddFragment(new FragmentThreeQuestion2016(),"ChE 459");
        adapter.AddFragment(new FragmentThreeQuestion2015(),"ChE 471");
        adapter.AddFragment(new FragmentThreeQuestion2014(),"ChE 473");
        adapter.AddFragment(new FragmentThreeQuestion2013(),"ChE 475");
        adapter.AddFragment(new FragmentThreeQuestion2012(),"ChE 481");
        adapter.AddFragment(new FragmentThreeQuestion2011(),"ChE 483");
        adapter.AddFragment(new FragmentThreeQuestion2010(),"ChE 485");
        adapter.AddFragment(new FragmentExtraOne(),"ChE 491");
        adapter.AddFragment(new FragmentExtraTwo(),"ChE 493");
        adapter.AddFragment(new FragmentExtraThree(),"ChE 495");
        adapter.AddFragment(new FragmentExtraFour(),"ChE 497");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
