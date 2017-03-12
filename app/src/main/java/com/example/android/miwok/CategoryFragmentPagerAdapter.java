package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/* == Created by Tom Gehrke on 3/11/2017. == */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    public CategoryFragmentPagerAdapter(FragmentManager categoryFragmentManager) {
        super(categoryFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            default:
                return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
