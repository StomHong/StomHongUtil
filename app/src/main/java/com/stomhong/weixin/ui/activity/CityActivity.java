package com.stomhong.weixin.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;
import com.stomhong.R;
import com.stomhong.weixin.adapter.CommonAdapter;
import com.stomhong.weixin.adapter.ViewHolder;
import com.stomhong.weixin.entity.Province;

import java.io.IOException;
import java.io.InputStream;

/**
 * 市级名称
 */
public class CityActivity extends AppCompatActivity {

    Province province;
    private ListView mListView_City;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        mListView_City = (ListView) findViewById(R.id.lv_city);

        int position = getIntent().getIntExtra("p", 0);


        StringBuilder sb = new StringBuilder();
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
        province = gson.fromJson(sb.toString(), Province.class);
        CommonAdapter<String> adapter = new CommonAdapter<String>(this, province.getProvince().get(position).getCities(), android.R.layout.simple_list_item_1) {
            @Override
            public void convert(ViewHolder holder, String s) {
                holder.setText(android.R.id.text1, s);
            }
        };
        mListView_City.setAdapter(adapter);
    }
}
