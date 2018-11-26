package com.zpd.nursing.db;

import com.zpd.nursing.db.entity.AccountLoginResultEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhoubo on 2018/10/22.
 */

public class TestData {

    static List<AccountLoginResultEntity> getAccountLoginResultEntitys() {
        List<AccountLoginResultEntity> resultEntityList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            AccountLoginResultEntity account = new AccountLoginResultEntity();
            account.setUser_name("用户名" + i);
            account.setServer_time(new Date().toString());
            resultEntityList.add(account);
        }
        return resultEntityList;
    }
}
