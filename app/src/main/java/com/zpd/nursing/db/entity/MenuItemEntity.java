package com.zpd.nursing.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by zhoubo on 2018/10/12.
 */
@Entity(tableName = "data_menu_config")
public class MenuItemEntity extends BaseEntity {

    @PrimaryKey
    private int mokuai_id;
    private String mokuai_name;
    private int mokuai_order;
    private String mokuai_icon;
    private String enable;
    private int is_html5;
    private String html5_url;
    private String group_id;
    private String group_name;
    private String group_order;
    private String quick_jump;

    public int getMokuai_id() {
        return mokuai_id;
    }

    public void setMokuai_id(int mokuai_id) {
        this.mokuai_id = mokuai_id;
    }

    public String getMokuai_name() {
        return mokuai_name;
    }

    public void setMokuai_name(String mokuai_name) {
        this.mokuai_name = mokuai_name;
    }

    public int getMokuai_order() {
        return mokuai_order;
    }

    public void setMokuai_order(int mokuai_order) {
        this.mokuai_order = mokuai_order;
    }

    public String getMokuai_icon() {
        return mokuai_icon;
    }

    public void setMokuai_icon(String mokuai_icon) {
        this.mokuai_icon = mokuai_icon;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public int getIs_html5() {
        return is_html5;
    }

    public void setIs_html5(int is_html5) {
        this.is_html5 = is_html5;
    }

    public String getHtml5_url() {
        return html5_url;
    }

    public void setHtml5_url(String html5_url) {
        this.html5_url = html5_url;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_order() {
        return group_order;
    }

    public void setGroup_order(String group_order) {
        this.group_order = group_order;
    }

    public String getQuick_jump() {
        return quick_jump;
    }

    public void setQuick_jump(String quick_jump) {
        this.quick_jump = quick_jump;
    }
}
