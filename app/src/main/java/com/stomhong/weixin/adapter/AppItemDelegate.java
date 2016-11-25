package com.stomhong.weixin.adapter;

import com.stomhong.weixin.entity.AppManager;
import com.zhy.adapter.abslistview.ViewHolder;
import com.zhy.adapter.abslistview.base.ItemViewDelegate;

/**
 * @author StomHong on 2016/10/14.
 */

public class AppItemDelegate implements ItemViewDelegate<AppManager> {

    @Override
    public int getItemViewLayoutId() {
        return android.R.layout.simple_list_item_1;
    }

    @Override
    public boolean isForViewType(AppManager appManager, int i) {
        return appManager.isTitle();
    }

    @Override
    public void convert(ViewHolder viewHolder, AppManager appManager, int i) {

    }

}
