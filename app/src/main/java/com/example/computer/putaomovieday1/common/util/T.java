package com.example.computer.putaomovieday1.common.util;

import android.content.Context;
import android.widget.Toast;



/**
 * Toast公具类
 * Created by computer on 2016/6/21.
 */
public class T {
    /**
     * 显示一个时间短的toast
     */
    public  static void showShort(Context context,String string){
        Toast.makeText(context, string,Toast.LENGTH_SHORT).show();
    }
}
