package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Basket extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        System.out.println(Louvre.LouvreTicket.museum);




    }
}