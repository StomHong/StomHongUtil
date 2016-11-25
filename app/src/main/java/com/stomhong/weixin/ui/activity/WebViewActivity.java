package com.stomhong.weixin.ui.activity;

import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.stomhong.R;
import com.stomhong.base.BaseActivity;

public class WebViewActivity extends BaseActivity {

    private TextView mTitle;
    private WebView mWebView;

    @Override
    protected int setContentResId() {
        return R.layout.activity_web_view;
    }

    @Override
    protected void initResView(View v) {
        mTitle = (TextView) v.findViewById(R.id.id_tv_webview_title);
        mWebView = (WebView) v.findViewById(R.id.id_wv_webview);

        WebChromeClient wcc = new WebChromeClient() {
            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                Log.d("ANDROID_LAB", "..........................TITLE=" + title);
                mTitle.setText("ReceivedTitle:" + title);
            }
        };
        // 设置setWebChromeClient对象
        mWebView.setWebChromeClient(wcc);

        // 创建WebViewClient对象
        WebViewClient wvc = new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // 使用自己的WebView组件来响应Url加载事件，而不是使用默认浏览器器加载页面
                mWebView.loadUrl(url);
                // 消耗掉这个事件。Android中返回True的即到此为止吧,事件就会不会冒泡传递了，我们称之为消耗掉
                return true;
            }
        };
        mWebView.setWebViewClient(wvc);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://www.youdao.com/");

    }

    @Override
    protected void initResData() {

    }

    @Override
    protected void initResEvent() {

    }
}
