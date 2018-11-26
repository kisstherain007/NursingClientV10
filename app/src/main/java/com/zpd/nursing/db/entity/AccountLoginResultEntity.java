package com.zpd.nursing.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by zhoubo on 2018/10/16.
 */
@Entity(tableName = "account_login_result")
public class AccountLoginResultEntity extends BaseEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String user_name;
    private String user_suoshu_name;
    private String user_suoshu_department;
    private String user_suoshu_department_position;
    private String user_number;
    private String user_group;
    private String shebei_id;
    private String session_id;
    private String server_time;
    private String error;
    private String msg;
    private String yiyuan_id;

    private String selectedDepartment;
    private String user_department_id;
    private String user_department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_suoshu_name() {
        return user_suoshu_name;
    }

    public void setUser_suoshu_name(String user_suoshu_name) {
        this.user_suoshu_name = user_suoshu_name;
    }

    public String getUser_suoshu_department() {
        return user_suoshu_department;
    }

    public void setUser_suoshu_department(String user_suoshu_department) {
        this.user_suoshu_department = user_suoshu_department;
    }

    public String getUser_suoshu_department_position() {
        return user_suoshu_department_position;
    }

    public void setUser_suoshu_department_position(String user_suoshu_department_position) {
        this.user_suoshu_department_position = user_suoshu_department_position;
    }

    public String getUser_number() {
        return user_number;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public String getUser_group() {
        return user_group;
    }

    public void setUser_group(String user_group) {
        this.user_group = user_group;
    }

    public String getShebei_id() {
        return shebei_id;
    }

    public void setShebei_id(String shebei_id) {
        this.shebei_id = shebei_id;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getServer_time() {
        return server_time;
    }

    public void setServer_time(String server_time) {
        this.server_time = server_time;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getYiyuan_id() {
        return yiyuan_id;
    }

    public void setYiyuan_id(String yiyuan_id) {
        this.yiyuan_id = yiyuan_id;
    }

    public String getSelectedDepartment() {
        return selectedDepartment;
    }

    public void setSelectedDepartment(String selectedDepartment) {
        this.selectedDepartment = selectedDepartment;
    }

    public String getUser_department_id() {
        return user_department_id;
    }

    public void setUser_department_id(String user_department_id) {
        this.user_department_id = user_department_id;
    }

    public String getUser_department() {
        return user_department;
    }

    public void setUser_department(String user_department) {
        this.user_department = user_department;
    }
}
