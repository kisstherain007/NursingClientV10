package com.zpd.nursing.di;

import com.zpd.nursing.ui.LoginActivity;
import com.zpd.nursing.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by zhoubo on 2018/11/28.
 */
@Module
public interface ActivityBuilder {

    @ContributesAndroidInjector
    LoginActivity loginActivity();

    @ContributesAndroidInjector
    MainActivity mianActivity();
}
