package com.example.mathieu.pokemon.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import android.support.v4.view.ViewPager;

import com.Core.PokemonCore;
import com.example.mathieu.pokemon.R;
import com.example.mathieu.pokemon.Fragment.ScreenSlidePageFragment;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class ScreenSlidePagerActivity extends FragmentActivity{

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static int NUM_PAGES = 5;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);

        NUM_PAGES = PokemonCore.getInstance().getAreaCount();

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);


    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();

//            PokemonCore core = PokemonCore.getInstance(this);
//
//            Area a = core.getAreaByPosition(position);
//
//            fragment.setArea(a);

            return fragment;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

}
