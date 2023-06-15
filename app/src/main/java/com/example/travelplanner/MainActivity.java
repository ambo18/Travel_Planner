package com.example.travelplanner;

import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    private FrameLayout frameContent;
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameContent = findViewById(R.id.frameContent);
        bottomNavigation = findViewById(R.id.bottomNavigation);

        // Set the initial fragment or activity based on the selected menu item
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_destinations:
                        launchDestinationFragment();
                        return true;
                    case R.id.menu_itinerary:
                        launchItineraryFragment();
                        return true;
                    case R.id.menu_bookings:
                        launchBookingsFragment();
                        return true;
                    case R.id.menu_tips:
                        launchTravelTipsFragment();
                        return true;
                    // Add cases for other menu items
                }
                return false;
            }
        });

        // Set the initial selected menu item
        bottomNavigation.setSelectedItemId(R.id.menu_destinations);
    }

    // Method to launch Destination Fragment
    private void launchDestinationFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContent, new DestinationFragment());
        transaction.commit();
    }

    // Method to launch Itinerary Fragment
    private void launchItineraryFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContent, new ItineraryFragment());
        transaction.commit();
    }

    // Method to launch Bookings Fragment
    private void launchBookingsFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContent, new BookingsFragment());
        transaction.commit();
    }

    // Method to launch Travel Tips Fragment
    private void launchTravelTipsFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContent, new TravelTipsFragment());
        transaction.commit();
    }
}
