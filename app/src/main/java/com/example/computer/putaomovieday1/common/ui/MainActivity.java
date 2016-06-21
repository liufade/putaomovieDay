package com.example.computer.putaomovieday1.common.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.BaseActivity;
import com.example.computer.putaomovieday1.common.core.PMApplication;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url="http://api.putao.so/sbiz/movie/cinema/list?citycode=%E4%B8%8A%E6%B5%B7";
        final TextView helloVolley= (TextView) findViewById(R.id.helloVolley);
        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                  helloVolley.setText(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("TAG", "onErrorResponse:出错了 ");
            }
        });
        PMApplication.getsIntance().getRequestQueue().add(stringRequest);

    }
}
