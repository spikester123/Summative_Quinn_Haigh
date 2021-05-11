package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NationalGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_gallery);
    }

    public void SouvenirFun(View view){
        Intent intent = new Intent(this, SouvenirShop.class);
        startActivity(intent);
    }
}