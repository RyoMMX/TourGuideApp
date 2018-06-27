package com.example.android.tourguideapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.tourguideapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    FragmentAdapter fragmentAdapter;
    ArrayList<MyFragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        fragments.add(new HistoricalSiteFragment(getString(R.string.historical_title)));
        fragments.add(new RestaurantFragment(getString(R.string.restaurant_title)));
        fragments.add(new EventsFragment(getString(R.string.events_title)));
        fragments.add(new HotelsFragment(getString(R.string.hotel_title)));
        fragments.add(new ParkFragment(getString(R.string.park_title)));
        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments);
        binding.viewPager.setAdapter(fragmentAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
}
