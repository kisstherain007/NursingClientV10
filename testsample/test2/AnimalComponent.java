package com.zpd.nursing.testsample.test2;

import dagger.Component;

/**
 * Created by zhoubo on 2018/11/21.
 */
@Component(modules = {AnimalMoudle.class})
public interface AnimalComponent {

    Moveable moveable();
}
