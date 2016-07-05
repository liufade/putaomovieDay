package com.example.computer.putaomovieday1.movie.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.BaseActivity;

/**
 * 剧照大图显示
 */
public class ShowStillActivity extends BaseActivity {
    private TextView tv_still;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_still);
        String[] stills = getIntent().getStringArrayExtra("stills");
        int currentIndex = getIntent().getIntExtra("currentIndex", 0);
        tv_still=(TextView) findViewById(R.id.tv_still);
        tv_still.setText(stills[currentIndex]);

    }

}
