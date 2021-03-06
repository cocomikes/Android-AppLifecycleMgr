package com.hm.iou.lifecycle.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.hm.iou.lifecycle.annotation.AppLifecycle;
import com.hm.lifecycle.api.IApplicationLifecycleCallbacks;

/**
 * Created by hjy on 2018/10/23.
 */
@AppLifecycle
public class ModuleAApplicationLifecycleCallbacks implements IApplicationLifecycleCallbacks {

    @Override
    public int getPriority() {
        return NORM_PRIORITY;
    }

    @Override
    public void attachBaseContext(@Nullable Context context) {
        Log.d("AppLifecycle", "attachBaseContext(): this is in ModuleAApplicationLifecycleCallbacks.");
    }

    @Override
    public void onCreate(@NonNull Context context) {
        Log.d("AppLifecycle", "onCreate(): this is in ModuleAApplicationLifecycleCallbacks.");
    }

    @Override
    public void onTerminate() {
        Log.d("AppLifecycle", "onTerminate(): this is in ModuleAApplicationLifecycleCallbacks.");
    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
