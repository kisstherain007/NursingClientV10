package com.zpd.nursing.di;

import android.arch.persistence.room.Room;

import com.zpd.nursing.NursingClientApp;
import com.zpd.nursing.db.AppDatabase;
import com.zpd.nursing.db.dao.AccountLoginResultDao;
import com.zpd.nursing.db.entity.AccountEntity;
import com.zpd.nursing.viewmodel.LoginViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhoubo on 2018/11/26.
 */
@Module(includes = ViewModelMoudle.class)
public class AppModule {

    @Singleton
    @Provides
    AppDatabase provideAppDatabase(NursingClientApp nursingClientApp) {
        return Room.databaseBuilder(nursingClientApp, AppDatabase.class, AppDatabase.DATABASE_NAME).build();
    }

    @Singleton
    @Provides
    AccountLoginResultDao provideAccountLoginResultDao(AppDatabase database) {
        return database.accountLoginResultDao();
    }

    @Provides
    AccountEntity providesAccountEntity() {
        return new AccountEntity();
    }

}
