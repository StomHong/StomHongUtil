package com.stomhong.weixin.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseBooleanArray;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.stomhong.R;
import com.stomhong.weixin.adapter.WorkAppManagerAdapter;

import java.util.List;

/**
 * 多布局ListView
 */
public class MultiItemListViewActivity extends AppCompatActivity {

    private ListView mListView_AppManager;
    private List<String> mList;
    private WorkAppManagerAdapter adapter;

    private List<Object> mData;
    private List<String> mNames;
    private SparseBooleanArray mArray;
    private LinearLayout mLienarLayout_Back;

    private String[] behaviorName = new String[]{"考勤签到", "拍照上传", "市场巡查", "合同签订", "任务接收", "任务推进"};
    private String[] storeName = new String[]{"采购管理", "商品调拨", "调拨审核", "仓库盘点", "库存核对"};
    private String[] basicName = new String[]{"客户管理", "商品管理", "销售订单", "企业文档", "知识考评"};
    private String[] financeName = new String[]{"欠条管理", "存款管理", "存货管理", "兑奖管理", "陈列管理", "返利管理", "积分管理"};
    private String[] officeName = new String[]{"公文通知", "工作日报", "请假流程", "报销流程", "促销流程", "其它流程"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutil_list_view);



    }
}
