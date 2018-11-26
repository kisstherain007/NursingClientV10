package com.zpd.nursing.di;

import com.zpd.nursing.util.ApiConfig;
import com.zpd.nursing.util.ParamsInterceptor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

/**
 * Created by zhoubo on 2018/11/20.
 */
@Module
public class NetworkModule {

    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(ApiConfig.Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLog, ParamsInterceptor paramsInterceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(paramsInterceptor);
        builder.addInterceptor(httpLog);
        return builder.build();
    }

    @Singleton
    @Provides
    HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLog = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Timber.i(message);
            }
        });
        httpLog.setLevel(HttpLoggingInterceptor.Level.BODY);
        return httpLog;
    }

    @Singleton
    @Provides
    ParamsInterceptor provideParamsInterceptor() {
        return new ParamsInterceptor();
    }
}
