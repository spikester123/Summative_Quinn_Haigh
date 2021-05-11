package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoginPage(View view){
        EditText UserName = (EditText) findViewById(R.id.txtUserName);
        EditText Password = (EditText) findViewById(R.id.txtPassword);

        myDBConnector objDBConnector = new myDBConnector(this, null, null, 1);

        if( objDBConnector.checkLogin(UserName.getText().toString(), Password.getText().toString() ) ){

            Intent intent = new Intent(this, MuseumSelection.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),
                   "Unsuccessful login \nIncorrect credentials", Toast.LENGTH_LONG).show();
        }
    }

    public void registrationPageFun(View v){
            Intent intent = new Intent(this, registration.class);
            startActivity(intent);

    }

    public void MuseumSelectFun(View view){
        Intent intent = new Intent(this, MuseumSelection.class);
        startActivity(intent);
    }
}