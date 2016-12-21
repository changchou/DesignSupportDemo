package com.zhang.designsupportdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Mr.Z on 2016/11/11 0011.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    List<String> title;
    List<Fragment> fragments;

    /**
     * @param fm
     * @param title
     * @param fragments
     */
    public FragmentAdapter(FragmentManager fm, List<String> title, List<Fragment> fragments) {
        super(fm);
        this.title = title;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
