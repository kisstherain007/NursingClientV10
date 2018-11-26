package com.zpd.nursing.db.entity.order;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.zpd.nursing.db.entity.BaseEntity;

/**
 * Created by zhoubo on 2018/10/12.
 */
@Entity(tableName = "yizhu_zhixing_record")
public class OrderOperatingRecordEntity extends BaseEntity {

    @PrimaryKey
    private String zhixing_id;
    private String zhuyuan_id;
    private String zhixing_plan_id;
    private String zhixing_zuhao_id;
    private String meiri_cishu_zuhao_id;
    private String op_time;
    private String op_type;
    private String op_detail;
    private String zhixing_hushi_id;
    private String zhixing_hushi_name;
    private String yizhu_plan_date;
    private String zhixing_no;
    private String zhixing_state;
    private String show_zhixing_state;
    private String zhixing_fangshi;
    private String shuang_qianming_info;
    private String yizhu_yongfa_type;
    private String chushi_state;
    private String type;
    private String yizhu_attribute;
    private String modify_time;
    private String zhixing_tiaoma;
    private String shebei_id;
    private int special_execution;
    private String bingqu_name;
    private String bingqu_id;
    private String keshi_name;
    private String keshi_id;

    public String getZhixing_id() {
        return zhixing_id;
    }

    public void setZhixing_id(String zhixing_id) {
        this.zhixing_id = zhixing_id;
    }

    public String getZhuyuan_id() {
        return zhuyuan_id;
    }

    public void setZhuyuan_id(String zhuyuan_id) {
        this.zhuyuan_id = zhuyuan_id;
    }

    public String getZhixing_plan_id() {
        return zhixing_plan_id;
    }

    public void setZhixing_plan_id(String zhixing_plan_id) {
        this.zhixing_plan_id = zhixing_plan_id;
    }

    public String getZhixing_zuhao_id() {
        return zhixing_zuhao_id;
    }

    public void setZhixing_zuhao_id(String zhixing_zuhao_id) {
        this.zhixing_zuhao_id = zhixing_zuhao_id;
    }

    public String getMeiri_cishu_zuhao_id() {
        return meiri_cishu_zuhao_id;
    }

    public void setMeiri_cishu_zuhao_id(String meiri_cishu_zuhao_id) {
        this.meiri_cishu_zuhao_id = meiri_cishu_zuhao_id;
    }

    public String getOp_time() {
        return op_time;
    }

    public void setOp_time(String op_time) {
        this.op_time = op_time;
    }

    public String getOp_type() {
        return op_type;
    }

    public void setOp_type(String op_type) {
        this.op_type = op_type;
    }

    public String getOp_detail() {
        return op_detail;
    }

    public void setOp_detail(String op_detail) {
        this.op_detail = op_detail;
    }

    public String getZhixing_hushi_id() {
        return zhixing_hushi_id;
    }

    public void setZhixing_hushi_id(String zhixing_hushi_id) {
        this.zhixing_hushi_id = zhixing_hushi_id;
    }

    public String getZhixing_hushi_name() {
        return zhixing_hushi_name;
    }

    public void setZhixing_hushi_name(String zhixing_hushi_name) {
        this.zhixing_hushi_name = zhixing_hushi_name;
    }

    public String getYizhu_plan_date() {
        return yizhu_plan_date;
    }

    public void setYizhu_plan_date(String yizhu_plan_date) {
        this.yizhu_plan_date = yizhu_plan_date;
    }

    public String getZhixing_no() {
        return zhixing_no;
    }

    public void setZhixing_no(String zhixing_no) {
        this.zhixing_no = zhixing_no;
    }

    public String getZhixing_state() {
        return zhixing_state;
    }

    public void setZhixing_state(String zhixing_state) {
        this.zhixing_state = zhixing_state;
    }

    public String getShow_zhixing_state() {
        return show_zhixing_state;
    }

    public void setShow_zhixing_state(String show_zhixing_state) {
        this.show_zhixing_state = show_zhixing_state;
    }

    public String getZhixing_fangshi() {
        return zhixing_fangshi;
    }

    public void setZhixing_fangshi(String zhixing_fangshi) {
        this.zhixing_fangshi = zhixing_fangshi;
    }

    public String getShuang_qianming_info() {
        return shuang_qianming_info;
    }

    public void setShuang_qianming_info(String shuang_qianming_info) {
        this.shuang_qianming_info = shuang_qianming_info;
    }

    public String getYizhu_yongfa_type() {
        return yizhu_yongfa_type;
    }

    public void setYizhu_yongfa_type(String yizhu_yongfa_type) {
        this.yizhu_yongfa_type = yizhu_yongfa_type;
    }

    public String getChushi_state() {
        return chushi_state;
    }

    public void setChushi_state(String chushi_state) {
        this.chushi_state = chushi_state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYizhu_attribute() {
        return yizhu_attribute;
    }

    public void setYizhu_attribute(String yizhu_attribute) {
        this.yizhu_attribute = yizhu_attribute;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }

    public String getZhixing_tiaoma() {
        return zhixing_tiaoma;
    }

    public void setZhixing_tiaoma(String zhixing_tiaoma) {
        this.zhixing_tiaoma = zhixing_tiaoma;
    }

    public String getShebei_id() {
        return shebei_id;
    }

    public void setShebei_id(String shebei_id) {
        this.shebei_id = shebei_id;
    }

    public int getSpecial_execution() {
        return special_execution;
    }

    public void setSpecial_execution(int special_execution) {
        this.special_execution = special_execution;
    }

    public String getBingqu_name() {
        return bingqu_name;
    }

    public void setBingqu_name(String bingqu_name) {
        this.bingqu_name = bingqu_name;
    }

    public String getBingqu_id() {
        return bingqu_id;
    }

    public void setBingqu_id(String bingqu_id) {
        this.bingqu_id = bingqu_id;
    }

    public String getKeshi_name() {
        return keshi_name;
    }

    public void setKeshi_name(String keshi_name) {
        this.keshi_name = keshi_name;
    }

    public String getKeshi_id() {
        return keshi_id;
    }

    public void setKeshi_id(String keshi_id) {
        this.keshi_id = keshi_id;
    }
}
