package com.stomhong.base;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.Iterator;
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
     * @param activity 增加的Activity对象
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
     * 移除指定的Activity对象
     *
     * @param activity 移除的Activity对象
     */
    public static void remove(Activity activity) {
        Iterator<Activity> it = mActivities.iterator();
        while (it.hasNext()) {
            if (it.next() == activity) {
                it.remove();
            }
        }
    }

    /**
     * 关闭所有打开的Activity
     */
    public static void finishActivities(){
        for (Activity act : mActivities){
            act.finish();
        }
    }

    /**
     * 退出应用
     */
    public static void exitApp(){
        finishActivities();
    }
}
