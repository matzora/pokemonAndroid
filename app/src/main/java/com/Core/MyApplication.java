package com.Core;

import android.app.Application;
import android.content.Context;

/**
 * Created by Mathieu on 21/07/2016.
 */
public class MyApplication extends Application {

    private static MyApplication instance;
    public static MyApplication get() { return instance; }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
