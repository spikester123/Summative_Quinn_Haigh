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
        EditText waterQty = findViewById(R.id.WaterQty);
        Button addWater = findViewById(R.id.WaterBtn);
        EditText coffeeQty = findViewById(R.id.CoffeeQty);
        Button addCoffee = findViewById(R.id.CoffeeBtn);

        item tea = new item("Tea", 1);
        item water = new item("Water", 1);
        item coffee = new item("Coffee", 2);


        SouvenirShop.itmorder.basket.add(tea);
        SouvenirShop.itmorder.basket.add(water);
        SouvenirShop.itmorder.basket.add(coffee);

        addTeaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SouvenirShop.itmorder.basket.get(3).quantity = Integer.parseInt(String.valueOf(teaQty.getText()));
            }
        });

        addWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SouvenirShop.itmorder.basket.get(4).quantity = Integer.parseInt(String.valueOf(waterQty.getText()));
            }
        });

        addCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SouvenirShop.itmorder.basket.get(5).quantity = Integer.parseInt((String.valueOf(coffeeQty.getText())));
            }
        });
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