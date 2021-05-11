package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }


    //1. a method for adding new user
    public void addNewUserFun (View view)
    {

        myDBConnector dbHandler = new myDBConnector(this, null,  null, 1);

        //establish a binding with the components in the gui
        EditText Name = (EditText) findViewById(R.id.txtNameReg);
        EditText Username = (EditText) findViewById(R.id.txtUsername1);
        EditText Password = (EditText) findViewById(R.id.txtPassword2);

        //add new user with name, username and password
        dbHandler.addNewUser(Name.getText().toString(),
                             Username.getText().toString(),
                              Password.getText().toString() );

        Toast.makeText(getApplicationContext(),
                    "Successfully registration with the following details\n" +
                            dbHandler.findUser(Username.getText().toString()),
                            Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    }
