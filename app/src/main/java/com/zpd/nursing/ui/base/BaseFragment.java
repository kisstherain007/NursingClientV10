package com.zpd.nursing.ui.base;


import android.app.Fragment;

import com.zpd.nursing.di.Injectable;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

/**
 * Created by zhoubo on 2018/11/26.
 */

public abstract class BaseFragment extends Fragment implements Injectable, HasFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> childFragmentInjector;

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return childFragmentInjector;
    }
}
