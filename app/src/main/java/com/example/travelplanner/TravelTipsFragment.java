package com.example.travelplanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TravelTipsFragment extends Fragment {
    private List<TravelTip> travelTips;
    private RecyclerView recyclerView;
    private TravelTipsAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the travelTips list
        travelTips = new ArrayList<>();
        travelTips.add(new TravelTip("Tip 1", "When visiting a new city, be sure to explore the local cuisine by trying out authentic restaurants and food markets for a true taste of the culture."));
        travelTips.add(new TravelTip("Tip 2", "Pack a small portable charger to keep your electronic devices powered up while on the go, ensuring you never miss capturing those memorable travel moments."));
        travelTips.add(new TravelTip("Tip 3", "Research and familiarize yourself with local customs and etiquette before visiting a foreign country to show respect and avoid unintentional cultural misunderstandings."));
        travelTips.add(new TravelTip("Tip 4", "Consider using public transportation or walking whenever possible to not only save money but also immerse yourself in the local atmosphere and discover hidden gems along the way."));
        travelTips.add(new TravelTip("Tip 5", "Don't forget to leave some extra space in your suitcase or backpack when traveling, as you're bound to acquire souvenirs and treasures that will remind you of your incredible journey."));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_travel_tips, container, false);

        recyclerView = view.findViewById(R.id.rvTravelTips);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Create an adapter and set it to the RecyclerView
        adapter = new TravelTipsAdapter(travelTips);
        recyclerView.setAdapter(adapter);

        return view;
    }

    // Example adapter class for the RecyclerView
    private class TravelTipsAdapter extends RecyclerView.Adapter<TravelTipsAdapter.ViewHolder> {
        private List<TravelTip> travelTips;

        public TravelTipsAdapter(List<TravelTip> travelTips) {
            this.travelTips = travelTips;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.travel_tip_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            TravelTip travelTip = travelTips.get(position);
            holder.tvTitle.setText(travelTip.getTitle());
            holder.tvDescription.setText(travelTip.getDescription());
        }

        @Override
        public int getItemCount() {
            return travelTips.size();
        }

        // ViewHolder class for caching view components
        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView tvTitle;
            TextView tvDescription;

            public ViewHolder(View itemView) {
                super(itemView);
                tvTitle = itemView.findViewById(R.id.tvTitle);
                tvDescription = itemView.findViewById(R.id.tvDescription);
            }
        }
    }

    // TravelTip class representing a single travel tip
    private static class TravelTip {
        private String title;
        private String description;

        public TravelTip(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }
    }
}
