package com.example.project_rma;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class BaseAdapter {
    private DBHelper dbHelper;

    private static final String TABLE="Users";
    //isti podaci kao u DataUser
    private static final String NAME ="name";
    private static final String PASSWORD ="password";

    private static final String SELECT_USERS="SELECT * FROM "+ TABLE;

    public BaseAdapter(Context context){
        dbHelper = new DBHelper(context, TABLE, NAME + " TEXT PRIMARY KEY, "
                + PASSWORD + " TEXT");

    }

    public DataUser getUser(String _id){
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        String findUser ="SELECT * FROM " + TABLE +" WHERE " + NAME + "='" + _id+"'";
        Cursor cursor =sqLiteDatabase.rawQuery(findUser, null);
        cursor.moveToFirst();
        DataUser dataUser =new DataUser(cursor.getString(0), cursor.getString(1));
        cursor.close();
        sqLiteDatabase.close();
        return dataUser;
    }

    public boolean insertUser(String name, String password){
        try{
            SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
            ContentValues initialValues = new ContentValues();
            initialValues.put(NAME, name);
            initialValues.put(PASSWORD, password);
            sqLiteDatabase.insert(TABLE, null, initialValues);
            sqLiteDatabase.close();
        }
        catch (SQLException sqlerror){
            Log.v("Insert into table error", sqlerror.getMessage());
            return false;
        }
        return true;
    }

}
