package com.love_cookies.e_tourism.View.Interface;

import com.love_cookies.e_tourism.Model.Bean.WeatherBean;

/**
 * Created by xiekun on 2016/4/12 0012.
 *
 * 周边页 View接口
 */
public interface ISurroundView {
    String getCity();
    void getWeather(String city);
    void setWeather(WeatherBean weatherBean);
    void getSurround(String keyword);
    void setSurround();
    void toDetail();
}