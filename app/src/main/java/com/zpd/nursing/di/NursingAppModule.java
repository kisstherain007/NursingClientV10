package com.zpd.nursing.di;

import com.zpd.nursing.WebService;
import com.zpd.nursing.repository.api.OrderService;
import com.zpd.nursing.repository.api.PatientService;
import com.zpd.nursing.repository.api.SystemService;
import com.zpd.nursing.repository.api.UserService;

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

    @Singleton
    @Provides
    SystemService provideSystemService(Retrofit retrofit) {
        return retrofit.create(SystemService.class);
    }

    @Singleton
    @Provides
    UserService provideUserService(Retrofit retrofit) {
        return retrofit.create(UserService.class);
    }

    @Singleton
    @Provides
    PatientService providePatientService(Retrofit retrofit) {
        return retrofit.create(PatientService.class);
    }

    @Singleton
    @Provides
    OrderService provideOrderService(Retrofit retrofit) {
        return retrofit.create(OrderService.class);
    }
}
