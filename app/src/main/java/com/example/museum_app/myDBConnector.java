package com.example.museum_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class myDBConnector extends SQLiteOpenHelper {
    //1. Terms for the structure of the database and columns of the table.
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "Registering.db";
    private static final String TABLE_Users = "Users";
    private static final String COLUMN_ID = "UsersID";
    private static final String COLUMN_Name = "Name";
    private static final String COLUMN_UserName = "UserName";
    private static final String COLUMN_Password = "Password";



    //2. A constructor for creating database
    public myDBConnector(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, DB_VERSION);

    }


    public void onCreate(SQLiteDatabase db){

        //Formulate a statement for a query that creates a table
        String CREATE_table = "CREATE TABLE " +
                TABLE_Users + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_Name + " TEXT, " +
                COLUMN_UserName + " TEXT," +
                COLUMN_Password + " INTEGER " + ");";

        //executing the query
        db.execSQL(CREATE_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addNewUser(String Name, String UserName, String Password){

        ContentValues values = new ContentValues();
        values.put(COLUMN_Name, Name);
        values.put(COLUMN_UserName, UserName);
        values.put(COLUMN_Password, Password);

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_Users, null, values);
        db.close();
    }

    public boolean checkLogin(String UserName, String Password){

        boolean result = false;

        String query = " Select * FROM " + TABLE_Users + " WHERE " + COLUMN_UserName + "= \"" + UserName + "\"";

        SQLiteDatabase db = this.getWritableDatabase();


        Cursor cursor = db.rawQuery(query,  null);

        if (cursor.moveToFirst()) {


            if (cursor.getString(3).equals(Password) ){
                result = true;
            }
        }
            else {
                result = false;
            }

            cursor.close();
            db.close();

            return result;
        }

        public String findUser(String Username) {

            // create a string variable for storing the details of the result
            String s = null;

            //formulate a statement for a query to select the user from the table
            String query = "Select * FROM " + TABLE_Users + " WHERE " + COLUMN_UserName + "= \"" + Username + "\"";

            //create an object for accessng the database
            SQLiteDatabase db = this.getWritableDatabase();

            //execute the query
            Cursor cursor = db.rawQuery(query, null);

            if (cursor.moveToFirst()){

                s = Integer.parseInt(cursor.getString(0)) +
                        cursor.getString(1) +
                        cursor.getString(2) +
                        cursor.getString(3);
            }

            //close the db
            cursor.close();
            db.close();
            System.out.println(s);
            return s;
        }
    }


