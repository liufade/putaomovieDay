package com.example.computer.putaomovieday1.movie.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.BaseActivity;
import com.example.computer.putaomovieday1.common.core.BaseFragment;
import com.example.computer.putaomovieday1.movie.Adapter.viewpagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by computer on 2016/6/22.
 */
public class MovieMainActivity extends BaseActivity {
private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.movie_main_fragment);
        mViewPager= (ViewPager) findViewById(R.id.vp_fragment);
        List<BaseFragment> fragments=new ArrayList<>();
        fragments.add(new movieFragment());
        fragments.add(new cinemaFragment());
        PagerAdapter pagerAdapter=new viewpagerAdapter(getSupportFragmentManager(),fragments);
        mViewPager.setAdapter(pagerAdapter);
    }
}
