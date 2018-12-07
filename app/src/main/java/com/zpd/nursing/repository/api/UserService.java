package com.zpd.nursing.repository.api;

import com.zpd.nursing.db.entity.AccountLoginResultEntity;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zhoubo on 2018/12/3.
 */

public interface UserService {

    /**
     * 用户登陆
     */
    @FormUrlEncoded
    @POST("Mobile/ClientCommunication/checkLogin")
    Call<AccountLoginResultEntity> login(@Field("user_number") String user_number,
                                         @Field("login_password") String login_password);

    /**
     * 用户退出
     */
    @FormUrlEncoded
    @POST("Mobile/ClientCommunication/logout")
    Call<String> logout();


    /**
     * 密码修改
     */
    @FormUrlEncoded
    @POST("Mobile/ClientCommunication/changePassword")
    Call<String> changePassword();
}
