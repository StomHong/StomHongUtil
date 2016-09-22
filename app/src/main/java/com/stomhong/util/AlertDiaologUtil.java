package com.stomhong.util;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

/**
 *
 * @author StomHong on 2016/9/22.
 */

public class AlertDiaologUtil {

    public static View show(Context context,int viewId){
        View view = LayoutInflater.from(context).inflate(viewId,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(view);
        builder.show();
        return view;
    }

}
