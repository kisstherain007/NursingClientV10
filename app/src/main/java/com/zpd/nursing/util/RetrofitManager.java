package com.zpd.nursing.util;


import com.zpd.nursing.WebService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhoubo on 2017/8/19.
 */

public class RetrofitManager {

    private volatile static RetrofitManager ourInstance = null;

    private OkHttpClient okHttpClient = null;

    private Retrofit retrofit = null;

    private WebService apiService;

    private RetrofitManager() {

        initRetrofit();

        apiService = createWebService(WebService.class);
    }

    public static RetrofitManager getInstance() {

        synchronized (RetrofitManager.class) {
            if (ourInstance == null) {
                ourInstance = new RetrofitManager();
            }
        }

        return ourInstance;
    }

    public Retrofit getRetrofit() {
        if (retrofit == null) RetrofitManager.getInstance().initRetrofit();
        return retrofit;
    }

    private void initRetrofit() {

        retrofit = new Retrofit.Builder()
                .baseUrl(ApiConfig.Base_URL)
//                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(ReqTaskCallAdapterFactory.create())
                .client(getOkHttpclient())
                .build();
    }

    private OkHttpClient getOkHttpclient() {

        if (okHttpClient == null) {
            HttpLoggingInterceptor httpLog = new HttpLoggingInterceptor();
            httpLog.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(new ParamsInterceptor());
            builder.addInterceptor(httpLog);
            okHttpClient = builder.build();
        }

        return okHttpClient;
    }

    public <T> T createWebService(Class<T> service){
        return getRetrofit().create(service);
    }

    public WebService getWebService() {

        if (getInstance().apiService == null) {
            apiService = createWebService(WebService.class);
        }

        return apiService;
    }
}
