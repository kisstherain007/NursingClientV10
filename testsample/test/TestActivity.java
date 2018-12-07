//package com.zpd.nursing.testsample.test;
//
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//
//import com.zpd.nursing.R;
//import com.zpd.nursing.test.DaggerProductComponent;
//
//import javax.inject.Inject;
//
///**
// * Created by zhoubo on 2018/11/21.
// */
//
//public class TestActivity extends AppCompatActivity {
//
//    @Inject
//    Product product;
//
//    @Inject
//    Car car;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        DaggerProductComponent.create().inject(this);
//
//        Log.d("TestActivity product", product.toString());
//
//        Log.d("TestActivity car", product.getCar().toString());
//
//    }
//
//}
