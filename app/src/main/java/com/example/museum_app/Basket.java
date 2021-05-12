package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Basket extends AppCompatActivity {

    int amountPaid;
    int totalAmount;
    Random rand;
    int minimum = 100000;
    int maximum = 999999;
    double confirmCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        TextView receiptTxt = findViewById(R.id.receiptTxt);
        EditText InputAmount = findViewById(R.id.InputAmount);
        Button PayButton =findViewById(R.id.PayBtn);
        TextView confirmationTxt = findViewById(R.id.confirmationTxt);

        receiptTxt.setText("Museum name:  " + Louvre.LouvreTicket.museum +
                           "\nBooking Date: " + Louvre.LouvreTicket.date +
                           "\nTime slot: " + Louvre.LouvreTicket.TimeSlot +
                           "\nAmount of Tickets: " + Louvre.LouvreTicket.qty);

        totalAmount = 0;

        for(int i=0; i < SouvenirShop.itmorder.basket.size(); i++)
        {

            if(SouvenirShop.itmorder.basket.get(i).quantity > 0)
            {
                totalAmount += (SouvenirShop.itmorder.basket.get(i).cost * SouvenirShop.itmorder.basket.get(i).quantity);

                receiptTxt.append("\n Item name: " + SouvenirShop.itmorder.basket.get(i).name + "  " + "Item quantity: " + SouvenirShop.itmorder.basket.get(i).quantity);
            }
        }

        totalAmount += Louvre.LouvreTicket.total;

        receiptTxt.append("\n\nTotal amount due: £" + totalAmount);


        rand = new Random();
        confirmCode = Math.floor(Math.random()*(maximum-minimum+1)+minimum);

        PayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                amountPaid = Integer.parseInt(String.valueOf(InputAmount.getText()));

                if(amountPaid >= totalAmount)
                {
                    confirmationTxt.setText("Total paid: £" + totalAmount + "\nConfirmation code: " + confirmCode);
                }
            }
        });




    }
}