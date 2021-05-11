package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CafeSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_selection);
        EditText teaQty = findViewById(R.id.teaQty);
        Button addTeaBtn = findViewById(R.id.teaBtn);

        item tea = new item("tea", 1);
        SouvenirShop.itmorder.basket.add(tea);


    }

    public void SouvenirFun(View view){
        Intent intent = new Intent(this, SouvenirShop.class);
        startActivity(intent);
    }

    public void BasketFun(View view){
        Intent intent = new Intent(this, Basket.class);
        startActivity(intent);
    }
}