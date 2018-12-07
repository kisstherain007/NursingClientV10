package com.zpd.nursing.testsample.test;

import dagger.Component;

/**
 * Created by zhoubo on 2018/11/21.
 */
@Component(modules = {TestMoudle.class})
public interface ProductComponent {

    void inject(TestActivity activity);
}
