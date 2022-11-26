package com.bsit.crudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnInsert,btnUpdate,btnDelete,btnView;
    EditText txtName,txtContact,txtDob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName=findViewById(R.id.name);
        txtContact=findViewById(R.id.contact);
        txtDob=findViewById(R.id.dob);
    }
}