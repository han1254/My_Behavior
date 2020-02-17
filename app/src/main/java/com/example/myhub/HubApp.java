package com.example.myhub;

import android.app.Application;
import android.content.Context;

import com.example.base.BaseApplication;
import com.example.base.nettype.netchange.NetChangeWatcherUtil;

/**
 * Time:2020/2/10 8:28
 * Author: han1254
 * Email: 1254763408@qq.com
 * Function:
 */
public class HubApp extends BaseApplication {

    private static Context context;
    private static Application mApplication;


    @Override
    public void onCreate() {
        super.onCreate();
        NetChangeWatcherUtil.getInstance().init(this);
        context = getApplicationContext();

        mApplication = this;
    }

    public static Context getAppContext() {
        return context;
    }


    public static Application getApplication() {
        return mApplication;
    }
}
