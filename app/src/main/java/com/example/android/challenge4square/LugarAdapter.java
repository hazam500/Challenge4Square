package com.example.android.challenge4square;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by TOSHIBA on 23/10/2015.
 */
public class LugarAdapter extends FragmentPagerAdapter {


    private final Lugar lugar;

    public LugarAdapter(AppCompatActivity activity, Lugar lugar) {
        super(activity.getSupportFragmentManager());
        this.lugar = lugar;

    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            Fragment mapFragment = new MapFragment();
            Bundle bundle = new Bundle();
            bundle.putDouble("latitud",lugar.getLatitud());
            bundle.putDouble("longitud",lugar.getLongitud());
            mapFragment.setArguments(bundle);
            return mapFragment;

        } else {
            Fragment lugarFragment = new ImagenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", lugar.getUrlLugar().get(position-1));
            lugarFragment.setArguments(bundle);
            return lugarFragment;
        }
    }

    @Override
    public int getCount() {
        return lugar.getUrlLugar().size() + 1;
    }
}
