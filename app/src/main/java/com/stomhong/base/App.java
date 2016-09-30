package com.stomhong.base;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * @author StomHong
 * @since 2016-5-16
 */
public class App extends Application{

    private static List<Activity> mActivities;

    @Override
    public void onCreate() {
        super.onCreate();
        mActivities = new ArrayList<>();
    }

    /**
     * 每打开一个新Activity都将它加入集合里
     *
     * @param activity
     */
    public static void add(Activity activity){
        boolean isExist = false;
        for (Activity act : mActivities){
            if (act == activity){
                isExist = true;
                break;
            }
        }
        if (!isExist)
            mActivities.add(activity);
    }

    /**
     * 关闭所有打开的Activity
     */
    public static void finishActivities(){
        for (Activity activity : mActivities){
            activity.finish();
        }
    }

    /**
     * 退出应用
     */
    public static void exitApp(){
        finishActivities();
    }
}
