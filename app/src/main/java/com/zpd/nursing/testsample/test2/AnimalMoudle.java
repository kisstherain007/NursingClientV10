package com.zpd.nursing.testsample.test2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhoubo on 2018/11/21.
 */
@Module
public class AnimalMoudle {

    @Provides
    Moveable moveable() {
        return new Moveable();
    }
}
