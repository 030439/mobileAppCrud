import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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
    //Insert method
    public boolean insertData(String name,String contact,String dob){
        //get database connection
        SQLiteDatabase DB=this.getWritableDatabase();

        //write content in database
        ContentValues contentvalues=new ContentValues();

        //assign values to content
        contentvalues.put("Name",name);
        contentvalues.put("Conctact",contact);
        contentvalues.put("DOB",dob);

        //execute the insert query
        Long result=DB.insert("crudApp",null,contentvalues);
        if(result==-1){
            return  false;
        }
        else{
            return  true;
        }
    }
    //Update method
    public boolean updateData(String name,String contact,String dob){
        //get database connection
        SQLiteDatabase DB=this.getWritableDatabase();

        //write content in database
        ContentValues contentvalues=new ContentValues();

        //assign values to content
        //contentvalues.put("Name",name);
        contentvalues.put("Conctact",contact);
        contentvalues.put("DOB",dob);

        //find current record into database
        Cursor currentRecord=DB.rawQuery("SELECT * FROM crudApp WHERE Name=?",new String[]{name});
        //check if result found
        if(currentRecord.getCount()>0){
            int result =DB.update("crudApp",contentvalues,"Name=?",new String[]{name});
            if(result==-1){
                return  false;
            }
            else{
                return  true;
            }
        }
        else{
            return  false;
        }
    }
}
