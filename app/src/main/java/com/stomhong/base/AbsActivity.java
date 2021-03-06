package com.stomhong.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.stomhong.R;

/**
 * Activity抽象类
 *
 * @author StomHong
 * date 2016-5-17
 */
public abstract class AbsActivity extends Activity {

    public static final String TAG = AbsActivity.class.getSimpleName();
    private FrameLayout mContainerGroup;
    private Context sContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container_view);
        sContext = this;
        initView();
        initData();
        initEvent();
    }

    protected  void initView(){
        mContainerGroup = (FrameLayout) LayoutInflater.from(this).inflate(setContentId(),null);

    }

    protected  void initData(){

    }

    protected  void initEvent(){

    }

    public Context getContext() {
        return sContext;
    }

    protected FrameLayout getContainerGroup(){
        return mContainerGroup;
    }

    protected abstract int setContentId();
}
