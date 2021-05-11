package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AmericanNatHistoryMuseum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american_nat_history_museum);
    }

    public void SouvenirFun(View view){
        Intent intent = new Intent(this, SouvenirShop.class);
        startActivity(intent);
    }
}