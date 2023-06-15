package com.example.travelplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class place_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_itinerary_place9);
    }

    public void item_1(View view) {
        Intent intent = new Intent(place_9.this, item_17.class);
        startActivity(intent);
    }

    public void item_2(View view) {
        Intent intent = new Intent(place_9.this, item_18.class);
        startActivity(intent);
    }
}
