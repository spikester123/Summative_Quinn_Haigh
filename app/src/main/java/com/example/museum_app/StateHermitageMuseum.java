package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StateHermitageMuseum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_hermitage_museum);
    }

    public void SouvenirFun(View view){
        Intent intent = new Intent(this, SouvenirShop.class);
        startActivity(intent);
    }
}