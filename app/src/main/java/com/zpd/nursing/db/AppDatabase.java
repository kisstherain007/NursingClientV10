package com.zpd.nursing.db;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

import com.zpd.nursing.db.dao.AccountLoginResultDao;
import com.zpd.nursing.db.entity.AccountEntity;
import com.zpd.nursing.db.entity.AccountLoginResultEntity;
import com.zpd.nursing.db.entity.MenuItemEntity;
import com.zpd.nursing.db.entity.PatientEntity;
import com.zpd.nursing.util.AppExecutors;

import javax.inject.Inject;

/**
 * Created by zhoubo on 2018/10/16.
 */

@Database(entities = {
        AccountLoginResultEntity.class,
        AccountEntity.class,
        MenuItemEntity.class,
        PatientEntity.class},
        version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    //    private static AppDatabase sInstance;
//
//    @VisibleForTesting
    public static final String DATABASE_NAME = "zpd-v10.db";
//
//    private final MutableLiveData<Boolean> mIsDatabaseCreated = new MutableLiveData<>();
//
//    public static AppDatabase getInstance(final Context context, final AppExecutors executors) {
//        if (sInstance == null) {
//            synchronized (AppDatabase.class) {
//                if (sInstance == null) {
//                    sInstance = buildDatabase(context.getApplicationContext(), executors);
//                    sInstance.updateDatabaseCreated(context.getApplicationContext());
//                }
//            }
//        }
//        return sInstance;
//    }
//
//    /**
//     * Build the database. {@link Builder#build()} only sets up the database configuration and
//     * creates a new instance of the database.
//     * The SQLite database is only created when it's accessed for the first time.
//     */
//    private static AppDatabase buildDatabase(final Context appContext,
//                                             final AppExecutors executors) {
//        return Room.databaseBuilder(appContext, AppDatabase.class, DATABASE_NAME)
//                .addCallback(new Callback() {
//                    @Override
//                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
//                        super.onCreate(db);
//                    }
//                }).build();
//    }
//
//    /**
//     * Check whether the database already exists and expose it via {@link #getDatabaseCreated()}
//     */
//    private void updateDatabaseCreated(final Context context) {
//        if (context.getDatabasePath(DATABASE_NAME).exists()) {
//            setDatabaseCreated();
//        }
//    }
//
//    private void setDatabaseCreated() {
//        mIsDatabaseCreated.postValue(true);
//    }
//
//    public LiveData<Boolean> getDatabaseCreated() {
//        return mIsDatabaseCreated;
//    }

    public abstract AccountLoginResultDao accountLoginResultDao();
}
