package com.example.computer.putaomovieday1.user.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.BaseFragment;
import com.example.computer.putaomovieday1.common.util.T;

/**
 *菜单页
 */
public class MenuFragment extends BaseFragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        return view;
    }


    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {

    }
}