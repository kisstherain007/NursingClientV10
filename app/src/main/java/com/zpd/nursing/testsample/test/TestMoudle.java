package com.zpd.nursing.testsample.test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhoubo on 2018/11/21.
 */
@Module
public class TestMoudle {

    @Provides
    Product provideProduct(Car car) {
        return new Product(car);
    }

    @Provides
    Car provideCar() {
        return new Car();
    }
}
