package com.zpd.nursing.testsample.test3;

import dagger.Component;

/**
 * Created by zhoubo on 2018/11/22.
 */
@Component(modules = AnimalMoudle.class)
public interface AnimalComponent {

    DogComponent.DogBuilder buildDogComponent();
}
