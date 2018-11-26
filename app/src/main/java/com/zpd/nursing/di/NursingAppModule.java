package com.zpd.nursing.di;

import com.zpd.nursing.WebService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by zhoubo on 2018/11/20.
 */

@Module(includes = NetworkModule.class)
public class NursingAppModule {

    @Singleton
    @Provides
    WebService provideWebService(Retrofit retrofit) {
        return retrofit.create(WebService.class);
    }

}
