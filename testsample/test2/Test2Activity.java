//package com.zpd.nursing.testsample.test2;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//
//import com.zpd.nursing.R;
//import com.zpd.nursing.test2.DaggerAnimalComponent;
//import com.zpd.nursing.test2.DaggerCatComponent;
//
//import javax.inject.Inject;
//
///**
// * Created by zhoubo on 2018/11/22.
// */
//
//public class Test2Activity extends AppCompatActivity {
//
//    @Inject
//    Moveable moveable;
//
//    AnimalComponent animalComponent;
//    CatComponent catComponent;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        animalComponent = DaggerAnimalComponent.create();
//
//        catComponent = DaggerCatComponent.builder().animalComponent(animalComponent).build();
//        catComponent.inject(this);
//
//        Log.d("Test2Activity", moveable.toString());
//    }
//}
