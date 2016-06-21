package com.example.computer.putaomovieday1.common.core;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by computer on 2016/6/21.
 */
public class PMApplication extends Application{
    /**
     * volley请求队列
     */
    private RequestQueue requestQueue;
    private static PMApplication sIntance;
    /**
     * 获得当前运行时PMApplication实例对象
     */
    public static PMApplication getsIntance() {
        return sIntance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    sIntance=this;
        requestQueue= Volley.newRequestQueue(this);
    }
    /**
     * 获得Volley的Http的请求队列
     */
    public RequestQueue getRequestQueue(){
        return requestQueue;
    }
}
