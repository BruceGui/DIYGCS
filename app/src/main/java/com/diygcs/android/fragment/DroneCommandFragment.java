package com.diygcs.android.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diygcs.android.R;

/**
 * Created by Gui Zhou on 2016-04-29.
 */

public class DroneCommandFragment extends BaseFragment{

    private static final String TAG = DroneCommandFragment.class.getSimpleName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_drone_command, container, false);
        return v;
    }
}