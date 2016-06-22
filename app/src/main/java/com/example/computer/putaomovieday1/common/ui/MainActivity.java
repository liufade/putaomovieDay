package com.example.computer.putaomovieday1.common.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.BaseActivity;
import com.example.computer.putaomovieday1.common.core.PMApplication;
import com.example.computer.putaomovieday1.common.util.T;
import com.example.computer.putaomovieday1.movie.ui.MovieMainActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, MovieMainActivity.class));

        final TextView helloVolley= (TextView) findViewById(R.id.helloVolley);

        String url="http://api.putao.so/sbiz/movie/cinema/list?citycode=%E4%B8%8A%E6%B5%B7";

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                helloVolley.setText(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                T.showShort(MainActivity.this,"加载出错了！");
            }
        });
        //将这个请求放到请求队列中
        PMApplication.getsIntance().getRequestQueue().add(stringRequest);

    }


}
