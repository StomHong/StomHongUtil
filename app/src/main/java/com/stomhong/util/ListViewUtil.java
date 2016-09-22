package com.stomhong.util;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * @author StomHong on 2016/9/22.
 */

public class ListViewUtil {

    public static void setListViewHeightBaseOnChildren(ListView listview) {
        ListAdapter listAdapter = listview.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int itemHeight = 0;
        int count = listAdapter.getCount();
        for (int i = 0; i < count; i++) {
            View listItem = listAdapter.getView(i, null, listview);
            listItem.measure(0, 0);
            itemHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listview.getLayoutParams();
        //ListView的高度等于Item的高度加上分割线的高度
        params.height = itemHeight + (listview.getDividerHeight() * (count - 1));
        listview.setLayoutParams(params);
    }
}
