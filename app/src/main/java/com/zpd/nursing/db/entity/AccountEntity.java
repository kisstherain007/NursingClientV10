package com.zpd.nursing.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by zhoubo on 2018/10/12.
 */

@Entity(tableName = "yiyuan_user")
public class AccountEntity extends BaseEntity {

    @PrimaryKey
    @NonNull
    private String id;
    private String user_number;
    private String scan_user_number;
    private String user_name;
    private String user_department;
    private String login_password;

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getUser_number() {
        return user_number;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public String getScan_user_number() {
        return scan_user_number;
    }

    public void setScan_user_number(String scan_user_number) {
        this.scan_user_number = scan_user_number;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_department() {
        return user_department;
    }

    public void setUser_department(String user_department) {
        this.user_department = user_department;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }
}
