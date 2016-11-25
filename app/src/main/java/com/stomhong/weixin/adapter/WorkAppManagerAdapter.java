package com.stomhong.weixin.adapter;

import android.content.Context;

import com.stomhong.weixin.entity.AppManager;
import com.zhy.adapter.abslistview.MultiItemTypeAdapter;

import java.util.List;

/**
 * @author StomHong on 2016/10/14.
 */

public class WorkAppManagerAdapter extends MultiItemTypeAdapter<AppManager> {

    public WorkAppManagerAdapter(Context context, List<AppManager> datas) {
        super(context, datas);
        addItemViewDelegate(new TitleItemDelegate());
        addItemViewDelegate(new TitleItemDelegate());
    }
}
