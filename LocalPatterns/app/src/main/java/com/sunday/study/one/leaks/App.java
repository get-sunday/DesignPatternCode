package com.sunday.study.one.leaks;

import android.app.Application;

public class App extends Application {

    public static boolean  isLogin = false;
    @Override
    public void onCreate() {
        super.onCreate();

    }
}
