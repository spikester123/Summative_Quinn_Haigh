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
        Button addShirtBtn = findViewById(R.id.teaBtn);

        item shirt = new item("Shirt", 10);

        itmorder = new order();

        itmorder.basket.add(shirt);

      addShirtBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              itmorder.basket.get(0).quantity = Integer.parseInt(String.valueOf(ShirtQty.getText()));
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