package com.example.computer.putaomovieday1.common.util;

import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.PMApplication;
import com.example.computer.putaomovieday1.common.widget.PreferenceUtil;

/**
 * Created by computer on 2016/6/30.
 */
public class CityMgr {
    private static CityMgr ourInstance = new CityMgr();

    public static CityMgr getInstance() {
        return ourInstance;
    }

    private CityMgr() {
    }

    /**
     * 获得城市信息
     * @return
     */
    public String loadCity() {
        return PreferenceUtil.loadString(PreferenceUtil.KEY_HOME_CITY, PMApplication.getsIntance().getString(R.string.home_city_default));
    }

    /**
     * 保存城市信息
     * @param city
     */
    public void saveCity(String city) {
        PreferenceUtil.save(PreferenceUtil.KEY_HOME_CITY, city);
    }

}
