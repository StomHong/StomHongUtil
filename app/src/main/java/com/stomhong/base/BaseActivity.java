package com.stomhong.base;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.stomhong.R;

/**
 * 抽象类
 */
public abstract class BaseActivity extends AbsActivity {

    private static final String TAG = BaseActivity.class.getSimpleName();
    private View mContentView;
    private FrameLayout mContainerView;


    @Override
    protected int setContentId() {
        return R.layout.container_view;
    }

    @Override
    protected void initView() {
        super.initView();
        mContainerView = (FrameLayout) getContainerGroup().findViewById(R.id.fl_container_view);
        mContentView = LayoutInflater.from(this).inflate(setContentResId(),null);
        mContainerView.addView(mContentView);
        initResView(mContentView);
    }

    @Override
    protected void initData() {
        super.initData();
        initResData();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        initResEvent();
    }


    protected abstract int setContentResId();

    protected abstract void initResView(View v);

    protected abstract void initResData();

    protected abstract void initResEvent();
}
