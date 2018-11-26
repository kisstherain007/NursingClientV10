package com.zpd.nursing.testsample.test3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zpd.nursing.R;
import com.zpd.nursing.test3.DaggerAnimalComponent;

import javax.inject.Inject;

/**
 * Created by zhoubo on 2018/11/22.
 */

public class Test3Activity extends AppCompatActivity {

    @Inject
    Eatable eatable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AnimalComponent animalComponent = DaggerAnimalComponent.create();
        animalComponent.buildDogComponent().build().inject(this);

        Log.d("Test3Activity", eatable.toString());
    }
}
