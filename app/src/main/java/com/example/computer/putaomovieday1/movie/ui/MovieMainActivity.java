package com.example.computer.putaomovieday1.movie.ui;

import android.os.Bundle;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.adapter.SimplePagerAdapter;
import com.example.computer.putaomovieday1.common.core.BaseActivity;
import com.example.computer.putaomovieday1.common.core.BaseFragment;
import com.example.computer.putaomovieday1.movie.Adapter.SimpleFragmentVpAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by computer on 2016/6/22.
 */
public class MovieMainActivity extends BaseActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moive_main);
        mViewPager = (ViewPager) findViewById(R.id.movie_vp);

        //创建好Fragment
        List<BaseFragment> fragments = new ArrayList<>();
        fragments.add(new movieFragment());
        fragments.add(new cinemaFragment());
        fragments.add(new FindFrangment());
        //创建适配器，将fragments传入适配器中
        PagerAdapter adapter = new SimpleFragmentVpAdapter(getSupportFragmentManager(),fragments);
        //将适配器与ViewPager关联
        mViewPager.setAdapter(adapter);

    }


}