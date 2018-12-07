package com.zpd.nursing.repository.api;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by zhoubo on 2018/12/3.
 */

public interface PatientService {

    /**
     * 获取患者数据
     * @return
     */
    @POST("Mobile/ClientCommunication/getHuanzheDataJsonForm")
    Call<String> getPatientDataJsonForm();
}
