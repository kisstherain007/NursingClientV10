package com.zpd.nursing.ui;

import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zpd.nursing.R;
import com.zpd.nursing.WebService;
import com.zpd.nursing.db.AppDatabase;
import com.zpd.nursing.db.entity.AccountEntity;
import com.zpd.nursing.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private final MediatorLiveData<String> result = new MediatorLiveData<>();

    private MutableLiveData<String> testLive = new MutableLiveData<>();
    private MutableLiveData<String> testLive2 = new MutableLiveData<>();

    @Inject
    AppDatabase appDatabase;

    @Inject
    AccountEntity accountEntity;

    @Inject
    WebService webService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("打印测试MainActivity1", appDatabase.toString());
        Log.d("打印测试MainActivity2", accountEntity.toString());

//        startActivity(new Intent(this, LoginActivity.class));
//        result.observe(this, data -> {
//            Log.d(TAG + "!!!!!!", data);
//        });
//
//        findViewById(R.id.test_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "onClick....");
//                setQuery("输入");
////                setQuery("输入2");
////                setQuery("输入");
////                setQuery2("");
////                setQuery("输入");
//            }
//        });
    }

    public void setQuery(String originalInput) {
        testLive.setValue("test1");
//        result.addSource(testLive, str -> {
//            Log.d(TAG+"#######1", str);
//        });

//        result.addSource(testLive, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//
//                result.addSource(testLive2, new Observer<String>() {
//                    @Override
//                    public void onChanged(@Nullable String s) {
//                        Log.d(TAG+"#######2", s);
//                    }
//                });
//                Log.d(TAG+"#######1", s);
//            }
//        });

        result.addSource(testLive, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                result.removeSource(testLive);

                result.addSource(testLive, new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {

                        Log.d(TAG+"#######2", s);

                        result.removeSource(testLive);

                        result.addSource(testLive, new Observer<String>() {
                            @Override
                            public void onChanged(@Nullable String s) {

                                Log.d(TAG+"#######3", s);

                                result.setValue("测试......");
                            }
                        });
                    }
                });

                result.addSource(testLive2, new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        Log.d(TAG+"MMMMMM", s);
                    }
                });

                Log.d(TAG+"#######1", s);
            }
        });

//        testLive.setValue("test3");
        result.setValue("测试......");
    }
}
