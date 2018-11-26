package com.zpd.nursing.db.entity.order;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.zpd.nursing.db.entity.BaseEntity;

/**
 * Created by zhoubo on 2018/10/12.
 */
@Entity(tableName = "yizhu_plan_info_relation")
public class OrderOperatingPlanWithRelationEntity extends BaseEntity {

    @PrimaryKey
    private String relation_id;
    private String zhuyuan_id;
    private String plan_id;
    private String zuhao_id;
    private String yizhu_id;
    private int relation_state;
    private String modify_time;

    public String getRelation_id() {
        return relation_id;
    }

    public void setRelation_id(String relation_id) {
        this.relation_id = relation_id;
    }

    public String getZhuyuan_id() {
        return zhuyuan_id;
    }

    public void setZhuyuan_id(String zhuyuan_id) {
        this.zhuyuan_id = zhuyuan_id;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getZuhao_id() {
        return zuhao_id;
    }

    public void setZuhao_id(String zuhao_id) {
        this.zuhao_id = zuhao_id;
    }

    public String getYizhu_id() {
        return yizhu_id;
    }

    public void setYizhu_id(String yizhu_id) {
        this.yizhu_id = yizhu_id;
    }

    public int getRelation_state() {
        return relation_state;
    }

    public void setRelation_state(int relation_state) {
        this.relation_state = relation_state;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }
}
