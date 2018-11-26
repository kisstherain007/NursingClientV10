package com.zpd.nursing.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by zhoubo on 2018/10/12.
 * 患者实体类
 */
@Entity(tableName = "zhuyuan_basic_info")
public class PatientEntity {

    @PrimaryKey
    @NonNull
    private String zhuyuan_id;

    private String patient_id;

    private String xingming;

    private String xingbie;

    private String nianling;

    private String zhuyuan_bingqu;

    private String ruyuan_riqi_time;

    private String bingchuang_hao;

    private String hulijibie;

    private String yinshi_zhuangkuang;

    private String shengao;

    private String tizhong;

    private String shoushu_info;

    private String guominshi;

    private String zhenduan;

    private String zhuangtai;

    private String his_display_zhuyuanhao;

    private String bingchuang_fenzu;

    private String blood_type;

    private String chushengdi;

    private String gongzuo_dianhua;

    private String juzhu_dianhua;

    private String lianxiren_dianhua;

    private String shenfenzheng_hao;

    private String shengri;

    private String zhuzhenyishi;

    private String zerenhushi;

    private String ruyuan_qingkuang;

    private String yiliaofukuanfangshi;

    private String zhusu;

    private String chuyuan_riqi_time;

    private String modify_time;

    private String huanzhe_leixing;

    private String flag1;

    private String flag2;

    private String bingchuang_order;

    private String special_info;

    private String release_seat;

    private String otehr_info;

    private String zhuyuan_wdtw;

    public String getZhuyuan_id() {
        return zhuyuan_id;
    }

    public void setZhuyuan_id(String zhuyuan_id) {
        this.zhuyuan_id = zhuyuan_id;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getNianling() {
        return nianling;
    }

    public void setNianling(String nianling) {
        this.nianling = nianling;
    }

    public String getZhuyuan_bingqu() {
        return zhuyuan_bingqu;
    }

    public void setZhuyuan_bingqu(String zhuyuan_bingqu) {
        this.zhuyuan_bingqu = zhuyuan_bingqu;
    }

    public String getRuyuan_riqi_time() {
        return ruyuan_riqi_time;
    }

    public void setRuyuan_riqi_time(String ruyuan_riqi_time) {
        this.ruyuan_riqi_time = ruyuan_riqi_time;
    }

    public String getBingchuang_hao() {
        return bingchuang_hao;
    }

    public void setBingchuang_hao(String bingchuang_hao) {
        this.bingchuang_hao = bingchuang_hao;
    }

    public String getHulijibie() {
        return hulijibie;
    }

    public void setHulijibie(String hulijibie) {
        this.hulijibie = hulijibie;
    }

    public String getYinshi_zhuangkuang() {
        return yinshi_zhuangkuang;
    }

    public void setYinshi_zhuangkuang(String yinshi_zhuangkuang) {
        this.yinshi_zhuangkuang = yinshi_zhuangkuang;
    }

    public String getShengao() {
        return shengao;
    }

    public void setShengao(String shengao) {
        this.shengao = shengao;
    }

    public String getTizhong() {
        return tizhong;
    }

    public void setTizhong(String tizhong) {
        this.tizhong = tizhong;
    }

    public String getShoushu_info() {
        return shoushu_info;
    }

    public void setShoushu_info(String shoushu_info) {
        this.shoushu_info = shoushu_info;
    }

    public String getGuominshi() {
        return guominshi;
    }

    public void setGuominshi(String guominshi) {
        this.guominshi = guominshi;
    }

    public String getZhenduan() {
        return zhenduan;
    }

    public void setZhenduan(String zhenduan) {
        this.zhenduan = zhenduan;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getHis_display_zhuyuanhao() {
        return his_display_zhuyuanhao;
    }

    public void setHis_display_zhuyuanhao(String his_display_zhuyuanhao) {
        this.his_display_zhuyuanhao = his_display_zhuyuanhao;
    }

    public String getBingchuang_fenzu() {
        return bingchuang_fenzu;
    }

    public void setBingchuang_fenzu(String bingchuang_fenzu) {
        this.bingchuang_fenzu = bingchuang_fenzu;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getChushengdi() {
        return chushengdi;
    }

    public void setChushengdi(String chushengdi) {
        this.chushengdi = chushengdi;
    }

    public String getGongzuo_dianhua() {
        return gongzuo_dianhua;
    }

    public void setGongzuo_dianhua(String gongzuo_dianhua) {
        this.gongzuo_dianhua = gongzuo_dianhua;
    }

    public String getJuzhu_dianhua() {
        return juzhu_dianhua;
    }

    public void setJuzhu_dianhua(String juzhu_dianhua) {
        this.juzhu_dianhua = juzhu_dianhua;
    }

    public String getLianxiren_dianhua() {
        return lianxiren_dianhua;
    }

    public void setLianxiren_dianhua(String lianxiren_dianhua) {
        this.lianxiren_dianhua = lianxiren_dianhua;
    }

    public String getShenfenzheng_hao() {
        return shenfenzheng_hao;
    }

    public void setShenfenzheng_hao(String shenfenzheng_hao) {
        this.shenfenzheng_hao = shenfenzheng_hao;
    }

    public String getShengri() {
        return shengri;
    }

    public void setShengri(String shengri) {
        this.shengri = shengri;
    }

    public String getZhuzhenyishi() {
        return zhuzhenyishi;
    }

    public void setZhuzhenyishi(String zhuzhenyishi) {
        this.zhuzhenyishi = zhuzhenyishi;
    }

    public String getZerenhushi() {
        return zerenhushi;
    }

    public void setZerenhushi(String zerenhushi) {
        this.zerenhushi = zerenhushi;
    }

    public String getRuyuan_qingkuang() {
        return ruyuan_qingkuang;
    }

    public void setRuyuan_qingkuang(String ruyuan_qingkuang) {
        this.ruyuan_qingkuang = ruyuan_qingkuang;
    }

    public String getYiliaofukuanfangshi() {
        return yiliaofukuanfangshi;
    }

    public void setYiliaofukuanfangshi(String yiliaofukuanfangshi) {
        this.yiliaofukuanfangshi = yiliaofukuanfangshi;
    }

    public String getZhusu() {
        return zhusu;
    }

    public void setZhusu(String zhusu) {
        this.zhusu = zhusu;
    }

    public String getChuyuan_riqi_time() {
        return chuyuan_riqi_time;
    }

    public void setChuyuan_riqi_time(String chuyuan_riqi_time) {
        this.chuyuan_riqi_time = chuyuan_riqi_time;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }

    public String getHuanzhe_leixing() {
        return huanzhe_leixing;
    }

    public void setHuanzhe_leixing(String huanzhe_leixing) {
        this.huanzhe_leixing = huanzhe_leixing;
    }

    public String getFlag1() {
        return flag1;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    public String getBingchuang_order() {
        return bingchuang_order;
    }

    public void setBingchuang_order(String bingchuang_order) {
        this.bingchuang_order = bingchuang_order;
    }

    public String getSpecial_info() {
        return special_info;
    }

    public void setSpecial_info(String special_info) {
        this.special_info = special_info;
    }

    public String getRelease_seat() {
        return release_seat;
    }

    public void setRelease_seat(String release_seat) {
        this.release_seat = release_seat;
    }

    public String getOtehr_info() {
        return otehr_info;
    }

    public void setOtehr_info(String otehr_info) {
        this.otehr_info = otehr_info;
    }

    public String getZhuyuan_wdtw() {
        return zhuyuan_wdtw;
    }

    public void setZhuyuan_wdtw(String zhuyuan_wdtw) {
        this.zhuyuan_wdtw = zhuyuan_wdtw;
    }
}
