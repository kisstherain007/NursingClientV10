package com.zpd.nursing.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zpd.nursing.R;
import com.zpd.nursing.ui.base.BaseActivity;
import com.zpd.nursing.viewmodel.LoginViewModel;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
