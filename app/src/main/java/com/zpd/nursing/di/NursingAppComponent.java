package com.zpd.nursing.di;

import android.app.Application;

import com.zpd.nursing.NursingClientApp;
import com.zpd.nursing.WebService;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by zhoubo on 2018/11/20.
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        NursingAppModule.class,
        AppModule.class,
        ActivityBuilder.class
})
public interface NursingAppComponent extends AndroidInjector<NursingClientApp>{

//    @Component.Builder
//    abstract class Builder extends AndroidInjector.Builder<NursingClientApp> {
//
//        @BindsInstance
//        abstract Builder application(Application application);
//
////        @BindsInstance
//        abstract Builder appModule(AppModule appModule);
//
//        @Override
//        public abstract NursingAppComponent build();
//    }
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(NursingClientApp clientApp);

//        @BindsInstance
//        Builder appModule(AppModule appModule);

        NursingAppComponent build();
    }
}
