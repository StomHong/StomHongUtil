package com.stomhong.base;

import android.app.Application;
import android.content.Context;

/**
 * @author StomHong
 * @since 2016-5-16
 */
public class App extends Application{

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext(){
        return sContext;
    }
}
