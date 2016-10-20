package com.hyphenate.easeuisimpledemo;

import com.hyphenate.easeui.controller.EaseUI;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class DemoApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        EaseUI.getInstance().init(this, null);
        MultiDex.install(this);
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    
}
