package com.zpd.nursing;

import android.app.Activity;
import android.app.Application;

import com.zpd.nursing.db.AppDatabase;
import com.zpd.nursing.di.AppInjector;
import com.zpd.nursing.util.AppExecutors;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by zhoubo on 2018/10/16.
 */

public class NursingClientApp extends Application implements HasActivityInjector{

    private static NursingClientApp instance;

    public static NursingClientApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        AppInjector.init(this);

        instance = this;
    }

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
