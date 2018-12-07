package com.zpd.nursing.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.JavascriptInterface;

import com.zpd.nursing.R;
import com.zpd.nursing.WebService;
import com.zpd.nursing.db.AppDatabase;
import com.zpd.nursing.db.entity.AccountEntity;
import com.zpd.nursing.ui.base.BaseActivity;
import com.zpd.nursing.viewmodel.AppViewModelFactory;
import com.zpd.nursing.viewmodel.LoginViewModel;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity {

    @Inject
    AppDatabase appDatabase;

    @Inject
    AccountEntity accountEntity;

    @Inject
    WebService webService;

    @Inject
    AppViewModelFactory viewModelFactory;

    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d("打印测试LoginActivity1", appDatabase.toString());
        Log.d("打印测试LoginActivity2", accountEntity.toString());

        loginViewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel.class);

        startActivity(new Intent(this, MainActivity.class));
    }
}
