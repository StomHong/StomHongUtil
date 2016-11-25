package com.stomhong.util;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.stomhong.R;

/**
 * 梦想着封装一个好用的Dialog却一直不得。
 *
 * @author StomHong on 2016/9/22.
 */

public class DialogUtil{

    private static ClickListener mListener;
    //1.确定按钮
    //2.确定取消按钮

    //3.多个选项 显示在底部

    /**
     * 显示在中间的Dialog
     *
     * @param context
     * @return
     */
    public static void show(Context context,String name,String msg,int buttonNum) {
        View view = LayoutInflater.from(context).inflate(R.layout.alert_dialog, null);
        TextView positive = (TextView) view.findViewById(R.id.tv_positive);
        TextView negative = (TextView) view.findViewById(R.id.tv_negative);
        TextView textViewName = (TextView) view.findViewById(R.id.tv_name);
        TextView textViewMsg = (TextView) view.findViewById(R.id.tv_msg);
        if ("".equals(msg)){
            textViewMsg.setVisibility(View.GONE);
        }

        textViewName.setText(name);
        textViewMsg.setText(msg);
        final AlertDialog dialog = new AlertDialog.Builder(context, R.style.dialog1).create();
        dialog.setView(view);
        dialog.setCancelable(false);
        dialog.show();
        if (buttonNum == 1){
            negative.setVisibility(View.GONE);
            positive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
        }else if (buttonNum == 2){
            negative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
            positive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.positive();
                }
            });
        }
    }

    /**
     * 显示在中间的Dialog
     *
     * @param context
     * @return
     */
    public static View show(Context context,int layoutId) {
        View view = LayoutInflater.from(context).inflate(layoutId, null);
        TextView positive = (TextView) view.findViewById(R.id.tv_positive);
        final AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.setView(view);
        dialog.setCancelable(false);
        dialog.show();
        WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
        params.dimAmount = 0.3f;
        params.gravity = Gravity.BOTTOM;
        dialog.getWindow().setAttributes(params);
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        return view;
    }

    public static void setClickListener(ClickListener listener) {
        mListener = listener;
    }


    public interface ClickListener {
        void positive();
    }

}
