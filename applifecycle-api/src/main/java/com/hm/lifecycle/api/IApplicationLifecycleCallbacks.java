package com.hm.lifecycle.api;

import android.content.Context;

/**
 * Created by hjy on 2018/10/23.
 */

public interface IApplicationLifecycleCallbacks {

    int MAX_PRIORITY = 10;
    int MIN_PRIORITY = 1;
    int NORM_PRIORITY = 5;

    void attachBaseContext(Context context);

    int getPriority();

    void onCreate(Context context);

    void onTerminate();

    void onLowMemory();

    void onTrimMemory(int level);
}