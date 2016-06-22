package com.example.computer.putaomovieday1.movie.resp;

import java.util.List;

/**
 * Created by Administrator on 2016/6/22.
 */
public class CinemaResp extends BaseResp {

    private List<Cinema> data;

    public List<Cinema> getData() {
        return data;
    }

    public void setData(List<Cinema> data) {
        this.data = data;
    }
}
