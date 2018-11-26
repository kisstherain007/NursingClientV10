package com.zpd.nursing.viewmodel;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.support.annotation.NonNull;
import android.util.Log;

import com.zpd.nursing.db.entity.AccountLoginResultEntity;
import com.zpd.nursing.repository.LoginDataRepository;
import com.zpd.nursing.util.network.Resource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhoubo on 2018/10/15.
 */

public class LoginViewModel extends BaseViewModel {

    private LoginDataRepository loginRepo;

    final MutableLiveData<Map<String, String>> login = new MutableLiveData<>();

    private final LiveData<Resource<AccountLoginResultEntity>> accountLiveData;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        loginRepo = new LoginDataRepository();
        accountLiveData = Transformations.switchMap(login, (input) -> {
            LiveData liveData = loginRepo.login(input.get("userName"), input.get("password"));
            return liveData;
        });
    }

    public void setLoginInfo(String userName, String password) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userName", userName);
        paramMap.put("password", password);
        login.setValue(paramMap);
    }

    public LiveData<Resource<AccountLoginResultEntity>> getAccountLiveData() {
        return accountLiveData;
    }
}
