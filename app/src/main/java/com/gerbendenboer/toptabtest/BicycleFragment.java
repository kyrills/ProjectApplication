package com.gerbendenboer.toptabtest;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by eigenaar on 23-6-2016.
 */
public class BicycleFragment extends Fragment {
    public  BicycleFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bycicle, container, false);
    }
}

