package com.zpd.nursing;

import com.zpd.nursing.db.entity.AccountLoginResultEntity;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zhoubo on 2018/10/16.
 */

public interface WebService {

    /**
     * 登陆接口
     */
    @FormUrlEncoded
    @POST("Mobile/ClientCommunication/checkLogin")
    Call<AccountLoginResultEntity> login(@Field("user_number") String user_number,
                                         @Field("login_password") String login_password);
}
