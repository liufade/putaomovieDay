package com.example.computer.putaomovieday1.movie.resp;

/**
 * Created by Administrator on 2016/7/4.
 * 电影详情的返回
 */
public class MovieDetailResp extends  BaseResp {

    private movie data;

    public movie getData() {
        return data;
    }

    public void setData(movie data) {
        this.data = data;
    }
}