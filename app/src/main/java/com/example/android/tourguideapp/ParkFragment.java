package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends MyFragment {
    ListView listView;
    private ArrayList<Item> items = new ArrayList<>();

    public ParkFragment() {
    }

    public ParkFragment(String title) {
        super(title);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_park, container, false);

        items.add(new Item(R.drawable.park1,getString(R.string.hozomon_location), getString(R.string.hozomon_map)));
        items.add(new Item(R.drawable.park2,getString(R.string.imperial_palace_map), getString(R.string.imperial_palace_location)));
        items.add(new Item(R.drawable.park3,getString(R.string.sengaku_ji_temple_map), getString(R.string.sengaku_ji_temple_location)));
        items.add(new Item(R.drawable.park4,getString(R.string.asakusa_shrine_map), getString(R.string.asakusa_shrine_location)));
        items.add(new Item(R.drawable.park5,getString(R.string.tokyo_camii_turkish_culture_map), getString(R.string.tokyo_camii_turkish_culture_location)));
        items.add(new Item(R.drawable.park6,getString(R.string.tokyo_metropolitan_museum_map), getString(R.string.tokyo_metropolitan_museum_location)));

        listView = view.findViewById(R.id.list_view);
        ItemListAdapter itemListAdapter = new ItemListAdapter(getActivity(), items);
        listView.setAdapter(itemListAdapter);
        return view;
    }
}
