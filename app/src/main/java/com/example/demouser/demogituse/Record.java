package com.example.demouser.demogituse;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity (tableName = "record_table")
public class Record {

    @PrimaryKey(autoGenerate = true)
    private int jEntry_id;

    @ColumnInfo(name = "journalEntry_content") // column name will be "jEntry_content" instead of "content" in table
    private String content;

    public Record(String content) {
        this.content = content;
    }

    public int getJEntry_id() {
        return jEntry_id;
    }

    public void setJEntry_id(int jEntry_id) {
        this.jEntry_id = jEntry_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Record)) return false;

        Record record = (Record) o;

        if (jEntry_id != record.jEntry_id) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Record{" + "journalEntry_id=" + jEntry_id + ", content='" + content + '\'' + "}";
    }
}