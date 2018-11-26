package com.zpd.nursing.viewmodel;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.zpd.nursing.db.entity.AccountLoginResultEntity;

/**
 * Created by zhoubo on 2018/10/16.
 */

public class AccountLoginResultViewModel extends BaseViewModel {

    public AccountLoginResultViewModel(@NonNull Application application) {
        super(application);
    }

    private LiveData<AccountLoginResultEntity> accountLoginResult;

    public LiveData<AccountLoginResultEntity> getAccountLoginResult() {
        return accountLoginResult;
    }
}
