package com.zpd.nursing.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.zpd.nursing.db.entity.AccountLoginResultEntity;

/**
 * Created by zhoubo on 2018/10/16.
 */
@Dao
public interface AccountLoginResultDao {

    @Query("select * from account_login_result where user_name = :userNumber")
    LiveData<AccountLoginResultEntity> loadAccountLoginResult(String userNumber);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(AccountLoginResultEntity accountLoginResultEntity);
}
