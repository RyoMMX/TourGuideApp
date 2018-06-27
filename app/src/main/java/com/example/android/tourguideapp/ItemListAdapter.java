package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemListAdapter extends ArrayAdapter<Item> {
    public ItemListAdapter(Context context, ArrayList<Item> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View historicalListView = convertView;
        if (historicalListView == null) {
            historicalListView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        Item item = getItem(position);

        ImageView historicalImage = historicalListView.findViewById(R.id.historical_image);
        historicalImage.setImageResource(item.getImage());

        TextView mapTextView = historicalListView.findViewById(R.id.map_text_view);
        mapTextView.setText(item.getMap());

        TextView locationTextView = historicalListView.findViewById(R.id.location_text_view);
        locationTextView.setText(item.getLocation());

        return historicalListView;
    }
}
