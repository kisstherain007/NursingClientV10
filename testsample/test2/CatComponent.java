package com.zpd.nursing.testsample.test2;

import dagger.Component;

/**
 * Created by zhoubo on 2018/11/21.
 */

@Component(modules = {CatMoudle.class}, dependencies = AnimalComponent.class)
public interface CatComponent {

    void inject(Test2Activity activity);
}
