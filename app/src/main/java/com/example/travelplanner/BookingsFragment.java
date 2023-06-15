package com.example.travelplanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.HashMap;

public class BookingsFragment extends Fragment {

    private EditText bookingIdEditText;
    private EditText dateEditText;
    private EditText timeEditText;
    private EditText customerNameEditText;
    private TextView resultTextView;
    private Button makeBookingButton;
    private Button retrieveBookingButton;
    private Button deleteBookingButton;

    private HashMap<String, Booking> bookings;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bookings, container, false);

        bookingIdEditText = rootView.findViewById(R.id.bookingIdEditText);
        dateEditText = rootView.findViewById(R.id.dateEditText);
        timeEditText = rootView.findViewById(R.id.timeEditText);
        customerNameEditText = rootView.findViewById(R.id.customerNameEditText);
        resultTextView = rootView.findViewById(R.id.resultTextView);
        makeBookingButton = rootView.findViewById(R.id.makeBookingButton);
        retrieveBookingButton = rootView.findViewById(R.id.retrieveBookingButton);
        deleteBookingButton = rootView.findViewById(R.id.deleteBookingButton);

        bookings = new HashMap<>();

        makeBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bookingId = bookingIdEditText.getText().toString();
                String date = dateEditText.getText().toString();
                String time = timeEditText.getText().toString();
                String customerName = customerNameEditText.getText().toString();

                String result = makeBooking(bookingId, date, time, customerName);
                resultTextView.setText(result);
            }
        });

        retrieveBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bookingId = bookingIdEditText.getText().toString();
                Booking booking = getBooking(bookingId);
                if (booking != null) {
                    resultTextView.setText(booking.toString());
                } else {
                    resultTextView.setText("Booking ID not found.");
                }
            }
        });

        deleteBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bookingId = bookingIdEditText.getText().toString();
                String result = deleteBooking(bookingId);
                resultTextView.setText(result);
            }
        });

        // Add any necessary logic to bind data or set up UI components

        return rootView;
    }

    private String makeBooking(String bookingId, String date, String time, String customerName) {
        if (bookings.containsKey(bookingId)) {
            return "Booking ID already exists. Please choose a different ID.";
        }

        for (Booking booking : bookings.values()) {
            if (booking.getDate().equals(date) && booking.getTime().equals(time)) {
                return "There is a conflict with an existing booking. Please choose a different date or time.";
            }
        }

        Booking newBooking = new Booking(bookingId, date, time, customerName);
        bookings.put(bookingId, newBooking);

        return "Booking successfully created.";
    }

    private Booking getBooking(String bookingId) {
        if (bookings.containsKey(bookingId)) {
            return bookings.get(bookingId);
        }
        return null;
    }

    private String deleteBooking(String bookingId) {
        if (bookings.containsKey(bookingId)) {
            bookings.remove(bookingId);
            return "Booking successfully deleted.";
        }
        return "Booking ID not found.";
    }
}
