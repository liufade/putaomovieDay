package com.example.computer.putaomovieday1.movie.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.computer.putaomovieday1.common.core.BaseFragment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by computer on 2016/6/22.
 */
public class viewpagerAdapter extends FragmentPagerAdapter {
    List<BaseFragment> fragments;

    public viewpagerAdapter(FragmentManager fm,List<BaseFragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


}

