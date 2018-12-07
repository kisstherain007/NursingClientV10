package com.zpd.nursing.testsample.test3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhoubo on 2018/11/22.
 */
@Module
public class AnimalMoudle {

    @Provides
    Eatable eatable() {
        return new Eatable();
    }
}
