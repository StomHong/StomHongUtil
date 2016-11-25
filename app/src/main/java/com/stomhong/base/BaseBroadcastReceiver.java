package com.stomhong.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class BaseBroadcastReceiver extends BroadcastReceiver {
    public BaseBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
       context.startActivity(intent);
    }

    @Override
    public IBinder peekService(Context myContext, Intent service) {
        return super.peekService(myContext, service);
    }
}
