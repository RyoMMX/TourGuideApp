package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalSiteFragment extends MyFragment {
    ListView listView;
    ArrayList<Item> items = new ArrayList<>();

    public HistoricalSiteFragment() {
    }

    public HistoricalSiteFragment(String title){
        super(title);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_historical_site, container, false);

        items.add(new Item(R.drawable.hozomon, getString(R.string.hozomon_location), getString(R.string.hozomon_map)));
        items.add(new Item(R.drawable.imperial_palace, getString(R.string.imperial_palace_map), getString(R.string.imperial_palace_location)));
        items.add(new Item(R.drawable.sengaku_ji_temple, getString(R.string.sengaku_ji_temple_map), getString(R.string.sengaku_ji_temple_location)));
        items.add(new Item(R.drawable.asakusa_shrine, getString(R.string.asakusa_shrine_map), getString(R.string.asakusa_shrine_location)));
        items.add(new Item(R.drawable.tokyo_camii_turkish_culture, getString(R.string.tokyo_camii_turkish_culture_map), getString(R.string.tokyo_camii_turkish_culture_location)));
        items.add(new Item(R.drawable.tokyo_metropolitan_museum, getString(R.string.tokyo_metropolitan_museum_map), getString(R.string.tokyo_metropolitan_museum_location)));

        listView = view.findViewById(R.id.list_view);
        ItemListAdapter itemListAdapter = new ItemListAdapter(getActivity(), items);
        listView.setAdapter(itemListAdapter);

        return view;
    }
}
