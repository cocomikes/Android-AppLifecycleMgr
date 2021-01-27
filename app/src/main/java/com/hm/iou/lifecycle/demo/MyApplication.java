package com.hm.iou.lifecycle.demo;

import android.app.Application;
import android.content.Context;

import com.hm.lifecycle.api.ApplicationLifecycleManager;

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        ApplicationLifecycleManager.init();
        ApplicationLifecycleManager.attachBaseContext(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        ApplicationLifecycleManager.onCreate(this);
    }
}
