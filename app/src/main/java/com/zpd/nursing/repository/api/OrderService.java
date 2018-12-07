package com.zpd.nursing.repository.api;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by zhoubo on 2018/12/3.
 */

public interface OrderService {

    /**
     * 获取医嘱数据
     * @return
     */
    /**获取长期医嘱基本信息（包含历史医嘱基本信息） */
    @POST("Mobile/ClientCommunication/getYizhuBasicInfoJsonChangqi")
    Call<String> getYizhuBasicInfoJsonChangqi();

    /**获取临时医嘱基本信息 */
    @POST("Mobile/ClientCommunication/getYizhuBasicInfoJsonLinshi")
    Call<String> getYizhuBasicInfoJsonLinshi();

    /**获取 长期医嘱执行计划 信息 */
    @POST("Mobile/ClientCommunication/getYizhuZhixingPlanJsonChangqi")
    Call<String> getYizhuZhixingPlanJsonChangqi();

    /**获取 临时医嘱执行计划 信息 */
    @POST("Mobile/ClientCommunication/getYizhuZhixingPlanJsonLinshi")
    Call<String> getYizhuZhixingPlanJsonLinshi();

    /**获取 过期医嘱执行计划 信息（别名：历史未完成医嘱） */
    @POST("Mobile/ClientCommunication/getYizhuZhixingPlanJsonExpire")
    Call<String> getYizhuZhixingPlanJsonExpire();

    /**医嘱执行记录上传接口 */
    @POST("Mobile/ClientCommunication/yizhuZhixingRecordUpload")
    Call<String> yizhuZhixingRecordUpload();

    /**获取医嘱执行记录 接口 */
    @POST("Mobile/ClientCommunication/getYizhuZhixingRecord")
    Call<String> getYizhuZhixingRecord();

    /**获取医嘱计划信息关系表 接口 */
    @POST("Mobile/ClientCommunication/getPlanZhixingInfoRelation")
    Call<String> getPlanZhixingInfoRelation();

    /** 删除无效医嘱接口（作废、停止、重整、无效等）接口 */
    @POST("Mobile/ClientCommunication/Getzhixingplandisabled")
    Call<String> Getzhixingplandisabled();

    /** 医嘱全量拉取标记（如果医嘱同步任务完成，拉取之后的医嘱不补发） */
    @POST("Mobile/ClientCommunication/Updatedevicetime")
    Call<String> Updatedevicetime();
}
