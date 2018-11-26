package com.zpd.nursing.repository;

import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.zpd.nursing.db.dao.AccountLoginResultDao;
import com.zpd.nursing.db.entity.AccountLoginResultEntity;
import com.zpd.nursing.util.network.ApiResponse;
import com.zpd.nursing.util.network.NetworkBoundResource;
import com.zpd.nursing.util.network.Resource;

/**
 * Created by zhoubo on 2018/10/30.
 */

public class LoginDataRepository extends BaseDataRepository {

    public static final String TAG = LoginDataRepository.class.getSimpleName();

    private AccountLoginResultDao dao;

    public LoginDataRepository() {
        this.dao = dao;
    }

//    public LiveData<Resource<AccountLoginResultEntity>> login(String userNanme, Object password) {
//
//        return new NetworkBoundResource<AccountLoginResultEntity, AccountLoginResultEntity>(getAppExecutors()) {
//
//            @Override
//            protected void saveCallResult(@NonNull AccountLoginResultEntity item) {
//                Log.d(TAG, "saveCallResult" + Thread.currentThread().getId());
//            }
//
//            @Override
//            protected boolean shouldFetch(@Nullable AccountLoginResultEntity data) {
//                Log.d(TAG, "shouldFetch" + Thread.currentThread().getId());
//                return false;
//            }
//
//            @NonNull
//            @Override
//            protected LiveData<AccountLoginResultEntity> loadFromDb() {
//                Log.d(TAG, "loadFromDb" + Thread.currentThread().getId());
//                return getDatabase().accountLoginResultDao().loadAccountLoginResult(userNanme);
//            }
//
//            @NonNull
//            @Override
//            protected LiveData<ApiResponse<AccountLoginResultEntity>> createCall() {
//                Log.d(TAG, "createCall" + Thread.currentThread().getId());
//                return null;
//            }
//        }.asLiveData();
//    }
}
