package com.yj.njh.home.app;

import com.unokiwi.common.BuildConfig;
import com.unokiwi.common.app.ComApp;

/**
 * Created by niejiahuan on 18/2/7.
 */

public class App extends ComApp {
    @Override
    public void onCreate() {
        super.onCreate();
        setDeBug(BuildConfig.DEBUG);
    }
}
