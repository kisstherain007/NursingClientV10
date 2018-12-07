package com.zpd.nursing.repository.api;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by zhoubo on 2018/12/3.
 */

public interface SystemService {

    /**
     * 同步初始化模板数据
     * @return
     */
    @POST("Mobile/ClientCommunication/asyncWithServerLogin")
    Call<String> asyncWithServerLogin();

    /**
     * 心跳
     */
    @POST("Mobile/ClientCommunication/heartBeat/")
    Call<String> sendHeartBeat();

}
