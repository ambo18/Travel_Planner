package com.example.travelplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class ItineraryFragment extends Fragment {

    private Button btnFrance;
    private Button btnSwitzerland;
    private Button btnJapan;
    private Button btnItaly;
    private Button btnNew_Zealand;
    private Button btnGreece;
    private Button btnCanada;
    private Button btnBrazil;
    private Button btnNorway;
    private Button btnAustralia;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_itinerary_creation, container, false);

        btnFrance = rootView.findViewById(R.id.btnFrance);
        btnSwitzerland = rootView.findViewById(R.id.btnSwitzerland);
        btnJapan = rootView.findViewById(R.id.btnJapan);
        btnItaly = rootView.findViewById(R.id.btnItaly);
        btnNew_Zealand = rootView.findViewById(R.id.btnNew_Zealand);
        btnGreece = rootView.findViewById(R.id.btnGreece);
        btnCanada = rootView.findViewById(R.id.btnCanada);
        btnBrazil = rootView.findViewById(R.id.btnBrazil);
        btnNorway = rootView.findViewById(R.id.btnNorway);
        btnAustralia = rootView.findViewById(R.id.btnAustralia);

        btnFrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_1.class);
                startActivity(intent);
            }
        });

        btnSwitzerland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_2.class);
                startActivity(intent);
            }
        });

        btnJapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_3.class);
                startActivity(intent);
            }
        });

        btnItaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_4.class);
                startActivity(intent);
            }
        });

        btnNew_Zealand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_5.class);
                startActivity(intent);
            }
        });

        btnGreece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_6.class);
                startActivity(intent);
            }
        });

        btnCanada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_7.class);
                startActivity(intent);
            }
        });

        btnBrazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_8.class);
                startActivity(intent);
            }
        });

        btnNorway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_9.class);
                startActivity(intent);
            }
        });

        btnAustralia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), place_10.class);
                startActivity(intent);
            }
        });

        // Add any necessary logic to bind data or set up UI components

        return rootView;
    }
}
