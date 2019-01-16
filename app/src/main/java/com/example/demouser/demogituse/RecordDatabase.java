package com.example.demouser.demogituse;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.provider.SyncStateContract;

@Database(entities = { Record.class }, version = 1)
public abstract class RecordDatabase extends RoomDatabase {

    public abstract RecordDao getRecordDao();

    private static volatile RecordDatabase recordDB;

    public static RecordDatabase getDatabase(Context context) {
        if (null == recordDB) {
            recordDB = Room.databaseBuilder(
                    context.getApplicationContext(),
                    RecordDatabase.class,
                    "record_database")
                    .build();
        }
        return recordDB;
    }

    public void cleanUp(){
        recordDB = null;
    }

}