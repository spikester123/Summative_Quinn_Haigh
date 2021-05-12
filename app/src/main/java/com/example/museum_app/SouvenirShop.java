package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SouvenirShop extends AppCompatActivity {

    public static order itmorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souvenir_shop);

        EditText ShirtQty = findViewById(R.id.ShirtQty);
        Button addShirtBtn = findViewById(R.id.ShirtBtn);
        EditText HatQty = findViewById(R.id.HatQty);
        Button addHatBtn = findViewById(R.id.HatBtn);
        EditText SnowGlobeQty = findViewById(R.id.SnowGlobeQty);
        Button addSnowGlobe = findViewById(R.id.SnowGlobeBtn);


        item shirt = new item("Shirt", 10);
        item hat = new item("Hat", 5);
        item snowglobe = new item("Snow Globe", 5);

        itmorder = new order();

        itmorder.basket.add(shirt);
        itmorder.basket.add(hat);
        itmorder.basket.add(snowglobe);
      addShirtBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              itmorder.basket.get(0).quantity = Integer.parseInt(String.valueOf(ShirtQty.getText()));
          }
      });


      addHatBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              itmorder.basket.get(1).quantity = Integer.parseInt(String.valueOf(HatQty));
          }
      });

        addSnowGlobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itmorder.basket.get(2).quantity = Integer.parseInt((String.valueOf(SnowGlobeQty)));
            }
        });
    }



    public void MuseumSelectFun(View view){
        Intent intent = new Intent(this, MuseumSelection.class);
        startActivity(intent);
    }

    public void CafeFun(View view){
        Intent intent = new Intent(this, CafeSelection.class);
        startActivity(intent);
    }
}