package com.zpd.nursing.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.zpd.nursing.util.Logger;

/**
 * Created by zhoubo on 2018/10/15.
 */

public class BaseViewModel extends AndroidViewModel {

    private static final String TAG = BaseViewModel.class.getSimpleName();

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Logger.d(TAG + ":" + "onCleared()");
    }
}
