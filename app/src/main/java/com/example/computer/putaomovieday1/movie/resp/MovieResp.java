package com.example.computer.putaomovieday1.movie.resp;

import java.util.List;

/**
 * Created by Administrator on 2016/6/22.
 */
public class MovieResp extends BaseResp {

    private List<movie> data;

    public List<movie> getData() {
        return data;
    }

    public void setData(List<movie> data) {
        this.data = data;
    }
}
