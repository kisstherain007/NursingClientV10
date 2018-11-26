package com.zpd.nursing.testsample.test3;

import dagger.Subcomponent;

/**
 * Created by zhoubo on 2018/11/22.
 */
@Subcomponent(modules = {DogMoudle.class})
public interface DogComponent {

    void inject(Test3Activity activity);

    @Subcomponent.Builder
    interface DogBuilder {
        DogComponent build();
    }
}
