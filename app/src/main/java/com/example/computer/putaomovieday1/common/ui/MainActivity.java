package com.example.computer.putaomovieday1.common.ui;

import android.os.Bundle;

import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.BaseFragment;
import com.example.computer.putaomovieday1.user.ui.MenuFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    private BaseFragment mContent;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getSupportFragmentManager().putFragment(outState, "mContent", mContent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
        mContent = (BaseFragment) getSupportFragmentManager().getFragment(savedInstanceState, "mContent");
    }
    if (mContent == null) {
        mContent = new MainContentFragment();
    }

        // set the Above View
        setContentView(R.layout.content_frame);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, mContent)
                .commit();

        // set the Behind View
        setBehindContentView(R.layout.menu_frame);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.menu_frame, new MenuFragment())
                .commit();

        //侧滑时触摸的模式
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        //侧滑的偏移量
        getSlidingMenu().setBehindOffsetRes(R.dimen.slidingmenu_offset);


    }
}
