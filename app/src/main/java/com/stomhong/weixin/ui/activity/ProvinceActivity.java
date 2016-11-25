package com.stomhong.weixin.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.stomhong.R;
import com.stomhong.weixin.adapter.CommonAdapter;
import com.stomhong.weixin.adapter.ViewHolder;
import com.stomhong.weixin.entity.Province;
import com.stomhong.weixin.entity.Province.P;

import java.io.IOException;
import java.io.InputStream;

/**
 * 省级名称
 */
public class ProvinceActivity extends AppCompatActivity {
    private static final String TAG = ProvinceActivity.class.getSimpleName();
    private ListView mListView_Province;
    Province province;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);
        mListView_Province = (ListView) findViewById(R.id.lv_province);
        StringBuffer sb = new StringBuffer();

        InputStream is = null;
        try {
            is = getAssets().open("province_city.json");
            int len = -1;
            byte[] buf = new byte[1024];
            while ((len = is.read(buf)) != -1) {
                sb.append(new String(buf, 0, len, "utf-8"));
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
//        Type type = new TypeToken<Province>() {
//        }.getType();
        Log.d(TAG, sb.toString());
        province = gson.fromJson(sb.toString(), Province.class);
        CommonAdapter<P> adapter = new CommonAdapter<P>(this, province.getProvince(), android.R.layout.simple_list_item_1) {
            @Override
            public void convert(ViewHolder holder, P p) {
                holder.setText(android.R.id.text1, province.getProvince().get(holder.getPosition()).getName());
            }
        };
        mListView_Province.setAdapter(adapter);
        mListView_Province.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(ProvinceActivity.this, CityActivity.class);
                intent.putExtra("p", position);
                startActivity(intent);
            }
        });
    }
}
