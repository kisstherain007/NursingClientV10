package com.zpd.nursing.db.entity.order;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.zpd.nursing.db.entity.BaseEntity;

/**
 * Created by zhoubo on 2018/10/12.
 */

@Entity(tableName = "yizhu_zhixing_plan")
public class OrderOperatingPlanEntity extends BaseEntity {
    @PrimaryKey
    private String plan_id;
    private String zhuyuan_id;
    private String zuhao_id;
    private String yizhu_tiaoma;
    private String type;
    private String meiri_cishu_zuhao_id;
    private String yizhu_plan_date;
    private int yizhu_plan_time_start;
    private String yizhu_plan_time_start_show;
    private int yizhu_plan_time_end;
    private String yizhu_plan_time_end_show;
    private int expire_time;
    private int expire_hold_time;
    private int zhixing_no;
    private String zhixing_state;
    private String chushi_state;
    private String state;
    private int yichang_lock;
    private int plan_state;
    private String modify_time;
    private String yizhu_yongfa_type;
    private int bulu_flag;
    private int is_jingpei;
    private int expire_zhixing_fangshi;
    private int before_time_zhixing_fangshi;

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getZhuyuan_id() {
        return zhuyuan_id;
    }

    public void setZhuyuan_id(String zhuyuan_id) {
        this.zhuyuan_id = zhuyuan_id;
    }

    public String getZuhao_id() {
        return zuhao_id;
    }

    public void setZuhao_id(String zuhao_id) {
        this.zuhao_id = zuhao_id;
    }

    public String getYizhu_tiaoma() {
        return yizhu_tiaoma;
    }

    public void setYizhu_tiaoma(String yizhu_tiaoma) {
        this.yizhu_tiaoma = yizhu_tiaoma;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeiri_cishu_zuhao_id() {
        return meiri_cishu_zuhao_id;
    }

    public void setMeiri_cishu_zuhao_id(String meiri_cishu_zuhao_id) {
        this.meiri_cishu_zuhao_id = meiri_cishu_zuhao_id;
    }

    public String getYizhu_plan_date() {
        return yizhu_plan_date;
    }

    public void setYizhu_plan_date(String yizhu_plan_date) {
        this.yizhu_plan_date = yizhu_plan_date;
    }

    public int getYizhu_plan_time_start() {
        return yizhu_plan_time_start;
    }

    public void setYizhu_plan_time_start(int yizhu_plan_time_start) {
        this.yizhu_plan_time_start = yizhu_plan_time_start;
    }

    public String getYizhu_plan_time_start_show() {
        return yizhu_plan_time_start_show;
    }

    public void setYizhu_plan_time_start_show(String yizhu_plan_time_start_show) {
        this.yizhu_plan_time_start_show = yizhu_plan_time_start_show;
    }

    public int getYizhu_plan_time_end() {
        return yizhu_plan_time_end;
    }

    public void setYizhu_plan_time_end(int yizhu_plan_time_end) {
        this.yizhu_plan_time_end = yizhu_plan_time_end;
    }

    public String getYizhu_plan_time_end_show() {
        return yizhu_plan_time_end_show;
    }

    public void setYizhu_plan_time_end_show(String yizhu_plan_time_end_show) {
        this.yizhu_plan_time_end_show = yizhu_plan_time_end_show;
    }

    public int getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(int expire_time) {
        this.expire_time = expire_time;
    }

    public int getExpire_hold_time() {
        return expire_hold_time;
    }

    public void setExpire_hold_time(int expire_hold_time) {
        this.expire_hold_time = expire_hold_time;
    }

    public int getZhixing_no() {
        return zhixing_no;
    }

    public void setZhixing_no(int zhixing_no) {
        this.zhixing_no = zhixing_no;
    }

    public String getZhixing_state() {
        return zhixing_state;
    }

    public void setZhixing_state(String zhixing_state) {
        this.zhixing_state = zhixing_state;
    }

    public String getChushi_state() {
        return chushi_state;
    }

    public void setChushi_state(String chushi_state) {
        this.chushi_state = chushi_state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getYichang_lock() {
        return yichang_lock;
    }

    public void setYichang_lock(int yichang_lock) {
        this.yichang_lock = yichang_lock;
    }

    public int getPlan_state() {
        return plan_state;
    }

    public void setPlan_state(int plan_state) {
        this.plan_state = plan_state;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }

    public String getYizhu_yongfa_type() {
        return yizhu_yongfa_type;
    }

    public void setYizhu_yongfa_type(String yizhu_yongfa_type) {
        this.yizhu_yongfa_type = yizhu_yongfa_type;
    }

    public int getBulu_flag() {
        return bulu_flag;
    }

    public void setBulu_flag(int bulu_flag) {
        this.bulu_flag = bulu_flag;
    }

    public int getIs_jingpei() {
        return is_jingpei;
    }

    public void setIs_jingpei(int is_jingpei) {
        this.is_jingpei = is_jingpei;
    }

    public int getExpire_zhixing_fangshi() {
        return expire_zhixing_fangshi;
    }

    public void setExpire_zhixing_fangshi(int expire_zhixing_fangshi) {
        this.expire_zhixing_fangshi = expire_zhixing_fangshi;
    }

    public int getBefore_time_zhixing_fangshi() {
        return before_time_zhixing_fangshi;
    }

    public void setBefore_time_zhixing_fangshi(int before_time_zhixing_fangshi) {
        this.before_time_zhixing_fangshi = before_time_zhixing_fangshi;
    }
}
