import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper
{
    public DBHelper(@Nullable Context context) {
        super(context, "CrudDatabase.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table crudApp (SN Int primary key, Name Text,Contact Text,DOB Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
    DB.execSQL("drop table if exists crudApp");
    }
    public boolean insertData(String name,String contact,String dob){
        //get database connection
        SQLiteDatabase DB=this.getWritableDatabase();
        //write content in database
        ContentValues contentvalues=new ContentValues();
        contentvalues.put("Name",name);
        contentvalues.put("Conctact",contact);
        contentvalues.put("DOB",dob);
        Longresult=BD.insert("crudApp",null,contentvalues);
    }
}
