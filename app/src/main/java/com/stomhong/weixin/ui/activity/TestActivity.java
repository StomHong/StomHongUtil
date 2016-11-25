package com.stomhong.weixin.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.stomhong.R;
import com.stomhong.util.DialogUtil;
import com.stomhong.util.ToastUtil;

/**
 * 用于各种测试
 */
public class TestActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.dialog).setOnClickListener(this);
        findViewById(R.id.toast).setOnClickListener(this);
        findViewById(R.id.toast).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dialog:
                DialogUtil.show(this,"温馨提示","是否退出",2);
                break;
            case R.id.toast:
                ToastUtil.show(getApplicationContext(), "这是测试文字");
                break;
            case R.id.province:
                break;
        }
    }
}
