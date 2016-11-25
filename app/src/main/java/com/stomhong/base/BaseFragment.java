package com.stomhong.base;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Fragment基类
 *
 *
 */
public abstract class BaseFragment extends Fragment {

    private Context mContext;

    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public final void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public final View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = LayoutInflater.from(mContext).inflate(getRootView(),null);
        initView(view);
        initData();
        initEvent();
        return view;
    }

    protected abstract void initEvent();

    protected abstract void initData();

    protected abstract void initView(View view);

    public Context getContext(){
        return mContext;
    }
    protected abstract int getRootView();

}
