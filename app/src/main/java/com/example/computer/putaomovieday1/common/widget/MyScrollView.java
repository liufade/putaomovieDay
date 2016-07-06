package com.example.computer.putaomovieday1.common.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.android.volley.toolbox.ImageLoader;
import com.example.computer.putaomovieday1.common.adapter.SimplePagerAdapter;

import java.util.List;

/**
 * Created by computer on 2016/7/5.
 */
public class MyScrollView extends ScrollView{

    private IScrollChangeListener mScrollChangeListener;

    public MyScrollView(Context context) {
        super(context);
    }
    MyScrollView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);

    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mScrollChangeListener!=null){
            mScrollChangeListener.onScrollChanged(t-oldt,t);
        }
    }

    public IScrollChangeListener getmScrollChangeListener() {
        return mScrollChangeListener;
    }

    public void setmScrollChangeListener(IScrollChangeListener mScrollChangeListener) {
        this.mScrollChangeListener = mScrollChangeListener;
    }


}
