package com.zpd.nursing.db.entity.order;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.zpd.nursing.db.entity.BaseEntity;

/**
 * Created by zhoubo on 2018/10/12.
 */
@Entity(tableName = "yizhu_basic_info")
public class OrderEntity extends BaseEntity {

    @PrimaryKey
    @NonNull
    private String yizhu_id;
    private String zhuyuan_id;
    private String content;
    private String yongfa;
    private String guige;
    private String zuhao_id;
    private String type;
    private String yizhu_type;
    private String zuhao_start_time;
    private String zuhao_stop_time;
    private String start_hushi_id;
    private String pinlv;
    private int meiri_cishu;
    private String yongliang;
    private String yongliang_danwei;
    private String disu;
    private String yizhu_state;
    private String yizhu_yongfa_type;
    private int yizhu_order;
    private int zhixing_fangshi;
    private int shouci_yongyao;
    private String shouci_yongyao_time;
    private String yisheng_beizhu;
    private String beizhu;
    private int add_flag;
    private String add_time;
    private int minus_flag;
    private String minus_time;
    private String modify_time;
    private int expire_time;
    private int teshu_flag;
    private String zuhao_state;

    @NonNull
    public String getYizhu_id() {
        return yizhu_id;
    }

    public void setYizhu_id(@NonNull String yizhu_id) {
        this.yizhu_id = yizhu_id;
    }

    public String getZhuyuan_id() {
        return zhuyuan_id;
    }

    public void setZhuyuan_id(String zhuyuan_id) {
        this.zhuyuan_id = zhuyuan_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getYongfa() {
        return yongfa;
    }

    public void setYongfa(String yongfa) {
        this.yongfa = yongfa;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige;
    }

    public String getZuhao_id() {
        return zuhao_id;
    }

    public void setZuhao_id(String zuhao_id) {
        this.zuhao_id = zuhao_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYizhu_type() {
        return yizhu_type;
    }

    public void setYizhu_type(String yizhu_type) {
        this.yizhu_type = yizhu_type;
    }

    public String getZuhao_start_time() {
        return zuhao_start_time;
    }

    public void setZuhao_start_time(String zuhao_start_time) {
        this.zuhao_start_time = zuhao_start_time;
    }

    public String getZuhao_stop_time() {
        return zuhao_stop_time;
    }

    public void setZuhao_stop_time(String zuhao_stop_time) {
        this.zuhao_stop_time = zuhao_stop_time;
    }

    public String getStart_hushi_id() {
        return start_hushi_id;
    }

    public void setStart_hushi_id(String start_hushi_id) {
        this.start_hushi_id = start_hushi_id;
    }

    public String getPinlv() {
        return pinlv;
    }

    public void setPinlv(String pinlv) {
        this.pinlv = pinlv;
    }

    public int getMeiri_cishu() {
        return meiri_cishu;
    }

    public void setMeiri_cishu(int meiri_cishu) {
        this.meiri_cishu = meiri_cishu;
    }

    public String getYongliang() {
        return yongliang;
    }

    public void setYongliang(String yongliang) {
        this.yongliang = yongliang;
    }

    public String getYongliang_danwei() {
        return yongliang_danwei;
    }

    public void setYongliang_danwei(String yongliang_danwei) {
        this.yongliang_danwei = yongliang_danwei;
    }

    public String getDisu() {
        return disu;
    }

    public void setDisu(String disu) {
        this.disu = disu;
    }

    public String getYizhu_state() {
        return yizhu_state;
    }

    public void setYizhu_state(String yizhu_state) {
        this.yizhu_state = yizhu_state;
    }

    public String getYizhu_yongfa_type() {
        return yizhu_yongfa_type;
    }

    public void setYizhu_yongfa_type(String yizhu_yongfa_type) {
        this.yizhu_yongfa_type = yizhu_yongfa_type;
    }

    public int getYizhu_order() {
        return yizhu_order;
    }

    public void setYizhu_order(int yizhu_order) {
        this.yizhu_order = yizhu_order;
    }

    public int getZhixing_fangshi() {
        return zhixing_fangshi;
    }

    public void setZhixing_fangshi(int zhixing_fangshi) {
        this.zhixing_fangshi = zhixing_fangshi;
    }

    public int getShouci_yongyao() {
        return shouci_yongyao;
    }

    public void setShouci_yongyao(int shouci_yongyao) {
        this.shouci_yongyao = shouci_yongyao;
    }

    public String getShouci_yongyao_time() {
        return shouci_yongyao_time;
    }

    public void setShouci_yongyao_time(String shouci_yongyao_time) {
        this.shouci_yongyao_time = shouci_yongyao_time;
    }

    public String getYisheng_beizhu() {
        return yisheng_beizhu;
    }

    public void setYisheng_beizhu(String yisheng_beizhu) {
        this.yisheng_beizhu = yisheng_beizhu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public int getAdd_flag() {
        return add_flag;
    }

    public void setAdd_flag(int add_flag) {
        this.add_flag = add_flag;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public int getMinus_flag() {
        return minus_flag;
    }

    public void setMinus_flag(int minus_flag) {
        this.minus_flag = minus_flag;
    }

    public String getMinus_time() {
        return minus_time;
    }

    public void setMinus_time(String minus_time) {
        this.minus_time = minus_time;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }

    public int getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(int expire_time) {
        this.expire_time = expire_time;
    }

    public int getTeshu_flag() {
        return teshu_flag;
    }

    public void setTeshu_flag(int teshu_flag) {
        this.teshu_flag = teshu_flag;
    }

    public String getZuhao_state() {
        return zuhao_state;
    }

    public void setZuhao_state(String zuhao_state) {
        this.zuhao_state = zuhao_state;
    }
}
