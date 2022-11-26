package com.bsit.crudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnInsert,btnUpdate,btnDelete,btnView;
    EditText txtName,txtContact,txtDob;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName=findViewById(R.id.name);
        txtContact=findViewById(R.id.contact);
        txtDob=findViewById(R.id.dob);

        btnInsert=findViewById(R.id.insert);
        btnInsert=findViewById(R.id.update);
        btnInsert=findViewById(R.id.view);
        btnInsert=findViewById(R.id.delete);
        //Insert button
        DBHelper DB=new DBHelper(this);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=txtName.getText().toString();
                String Contact=txtContact.getText().toString();
                String dob=txtDob.getText().toString();
            }
        });
    }
}