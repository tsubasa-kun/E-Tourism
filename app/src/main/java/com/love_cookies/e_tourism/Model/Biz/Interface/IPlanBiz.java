package com.love_cookies.e_tourism.Model.Biz.Interface;

import com.love_cookies.cookie_library.Interface.CallBack;

/**
 * Created by xiekun on 2016/4/11 0011.
 *
 * 计划逻辑接口
 */
public interface IPlanBiz {
    void getWeather(String city, CallBack callBack);
    void getPlanList(CallBack callBack);
}