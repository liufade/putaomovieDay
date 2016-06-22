package com.example.computer.putaomovieday1.movie.resp;

/**
 * Created by computer on 2016/6/21.
 */


public class movie {
//    /**名称 必选 说明*/private 类型 参数;
    /**影片id Y 　*/private Long movieid;
    /**影片名称 Y 　*/private String moviename;
    /**影片英文名称 N 　*/private String englishname;
    /**语言 N 　*/private String language;
    /**影片类型 N 　*/private String type;
    /**出产地区 N 　*/private String state;
    /**导演 N 　*/private String director;
    /**主演 N 　*/private String actors;
    /**片长 N 　*/private String length;
    /**一句话影评 N 　*/private String highlight;
    /**电影的首映日期 N 　　11位的long数据如：1426176000000*/private long releasedate;
    /**影片logo Y 　*/private String logo;
    /**影片评分 N 　*/private String generalmark;
    /**影片版本 N 　*/private String gcedition;


    public Long getMovieid() {
        return movieid;
    }

    public void setMovieid(Long movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public long getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(long releasedate) {
        this.releasedate = releasedate;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getGeneralmark() {
        return generalmark;
    }

    public void setGeneralmark(String generalmark) {
        this.generalmark = generalmark;
    }

    public String getGcedition() {
        return gcedition;
    }

    public void setGcedition(String gcedition) {
        this.gcedition = gcedition;
    }

    @Override
    public String toString() {
        return "movie{" +
                "movieid=" + movieid +
                ", moviename='" + moviename + '\'' +
                ", englishname='" + englishname + '\'' +
                ", language='" + language + '\'' +
                ", type='" + type + '\'' +
                ", state='" + state + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", length='" + length + '\'' +
                ", highlight='" + highlight + '\'' +
                ", releasedate=" + releasedate +
                ", logo='" + logo + '\'' +
                ", generalmark='" + generalmark + '\'' +
                ", gcedition='" + gcedition + '\'' +
                '}';
    }
}
