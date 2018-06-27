package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends MyFragment {
    ListView listView;
    private ArrayList<Item> items = new ArrayList<>();

    public RestaurantFragment() {
    }

    public RestaurantFragment(String title) {
        super(title);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        items.add(new Item(R.drawable.hakushu, getString(R.string.hozomon_location), getString(R.string.hozomon_map)));
        items.add(new Item(R.drawable.ise_sueyoshi, getString(R.string.imperial_palace_map), getString(R.string.imperial_palace_location)));
        items.add(new Item(R.drawable.ichiran_shibuya, getString(R.string.asakusa_shrine_map), getString(R.string.asakusa_shrine_location)));
        items.add(new Item(R.drawable.uobei_shibuya_dogenzaka, getString(R.string.tokyo_camii_turkish_culture_map), getString(R.string.tokyo_camii_turkish_culture_location)));
        items.add(new Item(R.drawable.tapas_molecular_bar, getString(R.string.tokyo_metropolitan_museum_map), getString(R.string.tokyo_metropolitan_museum_location)));

        listView = view.findViewById(R.id.list_view);
        ItemListAdapter itemListAdapter = new ItemListAdapter(getActivity(), items);
        listView.setAdapter(itemListAdapter);

        return view;
    }

}
