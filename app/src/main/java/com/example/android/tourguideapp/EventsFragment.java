package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends MyFragment {
    ListView listView;
    ArrayList<Item> items = new ArrayList<>();

    public EventsFragment() {
    }

    public EventsFragment(String title) {
        super(title);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events, container, false);

        items.add(new Item(R.drawable.event1, getString(R.string.hozomon_location), getString(R.string.hozomon_map)));
        items.add(new Item(R.drawable.event2, getString(R.string.imperial_palace_map), getString(R.string.imperial_palace_location)));
        items.add(new Item(R.drawable.event3, getString(R.string.sengaku_ji_temple_map), getString(R.string.sengaku_ji_temple_location)));
        items.add(new Item(R.drawable.event4, getString(R.string.asakusa_shrine_map), getString(R.string.asakusa_shrine_location)));
        items.add(new Item(R.drawable.event5, getString(R.string.tokyo_camii_turkish_culture_map), getString(R.string.tokyo_camii_turkish_culture_location)));
        items.add(new Item(R.drawable.event6, getString(R.string.tokyo_metropolitan_museum_map), getString(R.string.tokyo_metropolitan_museum_location)));

        listView = view.findViewById(R.id.list_view);
        ItemListAdapter itemListAdapter = new ItemListAdapter(getActivity(), items);
        listView.setAdapter(itemListAdapter);

        return view;
    }

}
