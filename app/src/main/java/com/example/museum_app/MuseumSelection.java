package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MuseumSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_selection);
    }

    public void LouvrePageFun(View view){
        Intent intent = new Intent(this, Louvre.class);
        startActivity(intent);
    }

    public void NatMuseumChinaFun(View v){
        Intent intent = new Intent(this, NatMuseumOfChina.class);
        startActivity(intent);
    }

    public void VaticanFun(View view){
        Intent intent = new Intent(this, VaticanMuseum.class);
        startActivity(intent);
    }

    public void MetArtFun(View view){
        Intent intent = new Intent(this, MetArtMuseum.class);
        startActivity(intent);
    }

    public void BritishFun(View view){
        Intent intent = new Intent(this, BritishMuseum.class);
        startActivity(intent);
    }

    public void TateFun(View view){
        Intent intent = new Intent(this, TateModern.class);
        startActivity(intent);
    }

    public void NatGalleryFun(View view) {
        Intent intent = new Intent(this, NationalGallery.class);
        startActivity(intent);
    }

    public void NatHistoryFun(View view){
        Intent intent = new Intent(this, NatHistory.class);
        startActivity(intent);
    }

    public void AmNatHistoryFun(View view){
        Intent intent = new Intent(this, AmericanNatHistoryMuseum.class);
        startActivity(intent);
    }

    public void StateHermFun(View view){
        Intent intent = new Intent(this, StateHermitageMuseum.class);
        startActivity(intent);
    }
}