package com.stomhong.util;

import android.content.Context;
import android.widget.Toast;

/**
 * @author StomHong on 2016/9/22.
 */

public class ToastUtil {

    private static Toast toast;
    public static void show(Context context, String msg) {
        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
