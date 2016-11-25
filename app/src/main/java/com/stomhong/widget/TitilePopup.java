package com.stomhong.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/**
 * @author StomHong on 2016/10/26.
 */

public class TitilePopup extends PopupWindow {

    public TitilePopup(Context context) {
        super(context);
    }

    public TitilePopup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TitilePopup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TitilePopup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
    }

    @Override
    public void setContentView(View contentView) {
        super.setContentView(contentView);
    }
}
