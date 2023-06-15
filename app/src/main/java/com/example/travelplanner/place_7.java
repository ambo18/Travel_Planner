package com.example.travelplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class place_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_itinerary_place7);
    }

    public void item_1(View view) {
        Intent intent = new Intent(place_7.this, item_13.class);
        startActivity(intent);
    }

    public void item_2(View view) {
        Intent intent = new Intent(place_7.this, item_14.class);
        startActivity(intent);
    }
}
