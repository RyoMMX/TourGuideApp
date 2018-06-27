package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;

public abstract class MyFragment extends Fragment {

    private String title = "";

    public MyFragment(){
    }

    public MyFragment(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
