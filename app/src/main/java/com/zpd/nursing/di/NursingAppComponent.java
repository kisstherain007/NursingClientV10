package com.zpd.nursing.di;

import com.zpd.nursing.NursingClientApp;
import com.zpd.nursing.WebService;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by zhoubo on 2018/11/20.
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        NursingAppModule.class,
        AppModule.class
})
public interface NursingAppComponent {

    void inject(NursingClientApp clientApp);

    WebService getWebService();
}
