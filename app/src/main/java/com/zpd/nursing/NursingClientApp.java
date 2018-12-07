package com.zpd.nursing;

import com.zpd.nursing.di.AppModule;
import com.zpd.nursing.di.DaggerNursingAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by zhoubo on 2018/10/16.
 */

public class NursingClientApp extends DaggerApplication {

    private static NursingClientApp instance;

    public static NursingClientApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerNursingAppComponent.builder().application(this).build();
    }

}
