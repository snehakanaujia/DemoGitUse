package com.example.demouser.demogituse;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface RecordDao {
    @Query("SELECT * FROM record_table ")
    LiveData<List<Record>> getAll();


    /*
     * Insert the object in database
     * @param record, object to be inserted
     */
    @Insert
    void insert(Record record);

    /*
     * update the object in database
     * @param record, object to be updated
     */
    @Update
    void update(Record repos);

    /*
     * delete the object from database
     * @param record, object to be deleted
     */
    @Delete
    void delete(Record record);

    /*
     * delete list of objects from database
     * @param record, array of objects to be deleted
     */
    @Delete
    void delete(Record... record);      // Record... is varargs, here record is an array

}