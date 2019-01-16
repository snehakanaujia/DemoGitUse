package com.example.demouser.demogituse;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class RecordRepository {
    private RecordDao recordDao;
    private LiveData<List<Record>> records;

    public RecordRepository(Application application) {
        RecordDatabase db = RecordDatabase.getDatabase(application);
        recordDao = db.getRecordDao();
        records = recordDao.getAll();
    }

    LiveData<List<Record>> getRecords() {
        return records;
    }

    public void insert(Record record) {
        new InsertAsyncTask(recordDao).execute(record);
    }

    private static class InsertAsyncTask extends AsyncTask<Record, Void, Void> {
        private RecordDao mAsyncTaskDao;

        InsertAsyncTask(RecordDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Record... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }

    }
}
