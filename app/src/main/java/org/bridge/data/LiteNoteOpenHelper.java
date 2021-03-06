package org.bridge.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 本地数据库创建类
 */
public class LiteNoteOpenHelper extends SQLiteOpenHelper {
    /**
     * 建表语句
     */
    public static final String CREATE_NOTE =
            "create table " + LiteNoteDBConstants.TABLE_NOTES +
                    "( " + LiteNoteDBConstants.NOTE_ID +
                    " integer primary key autoincrement," +
                    LiteNoteDBConstants.NOTE_CONTENT +
                    " text," +
                    LiteNoteDBConstants.NOTE_PUBDATE +
                    " text," +
                    LiteNoteDBConstants.NOTE_MODIFYTIME +
                    " text," +
                    LiteNoteDBConstants.NOTE_SYNCSTATE +
                    " integer default 0," +
                    LiteNoteDBConstants.NOTE_EVERGUID +
                    " text)";

    /**
     * 构造方法
     *
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public LiteNoteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_NOTE);//创建Notes表

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
