package com.zpd.nursing.di;

import android.arch.persistence.room.Room;

import com.zpd.nursing.NursingClientApp;
import com.zpd.nursing.db.AppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhoubo on 2018/11/26.
 */
@Module
public class AppModule {

    private NursingClientApp nursingClientApp;

    public AppModule(NursingClientApp nursingClientApp) {
        this.nursingClientApp = nursingClientApp;
    }

    @Singleton
    @Provides
    public NursingClientApp provideNursingClientApp() {
        return nursingClientApp;
    }

    @Singleton
    @Provides
    AppDatabase provideAppDatabase() {
        return Room.databaseBuilder(nursingClientApp, AppDatabase.class, "zpd-v10.db").build();
    }


}
