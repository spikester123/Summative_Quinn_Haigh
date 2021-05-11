package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Date;

public class Louvre extends AppCompatActivity {

    public static ticket LouvreTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;
    EditText Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louvre);

        ticketQTY = findViewById(R.id.LouvreQTY);

        timeSlot = findViewById(R.id.LouvreTimeSlots);

        Date = findViewById(R.id.LouvreDate);

        LouvreTicket = new ticket();
        LouvreTicket.museum = "Louvre";

    }



    // making the ticket
    public void TicketFun(View v)
    {
        LouvreTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));

        LouvreTicket.total = 10 * LouvreTicket.qty;

        LouvreTicket.date = Date.getText();
        System.out.println("Museum: " + LouvreTicket.museum);
        System.out.println("qty of tickets: " + LouvreTicket.qty);
        System.out.println("total: " + LouvreTicket.total);
        System.out.println("time: " + LouvreTicket.TimeSlot);

        Intent intent = new Intent(this, SouvenirShop.class);
        startActivity(intent);
    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        LouvreTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("time: " + LouvreTicket.TimeSlot);


    }

}