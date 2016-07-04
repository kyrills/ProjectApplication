package com.gerbendenboer.toptabtest.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;

import com.gerbendenboer.toptabtest.Factory.ButtonFactory;
import com.gerbendenboer.toptabtest.Factory.IButton;
import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

public class PieChartFragment extends Fragment {
    private PieChart pieChartBrand;
    private PieChart pieChartColour;
    private PieData pieDataColour;
    private PieData pieDataBrand;

    private static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_piechart, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pieChartBrand = (PieChart) view.findViewById(R.id.piechartBrand);
        pieChartBrand.setData(pieDataBrand); //set pieData into chart
        pieChartBrand.setDescription("Most stolen bike brands");
        pieChartBrand.setDescriptionColor(Color.BLACK);
        pieChartBrand.animateY(1500);
//        pieChartBrand.setTouchEnabled(false);

        pieChartColour = (PieChart) view.findViewById(R.id.piechartColour);
        pieChartColour.setData(pieDataColour);
        pieChartColour.setDescription("Most stolen bikes depending on colour");
        pieChartColour.setDescriptionColor(Color.BLACK);
        pieChartColour.animateY(1500);
//        pieChartColour.setTouchEnabled(false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Entry> entriesColour = new ArrayList<>();
        entriesColour.add(new Entry(4f, 0));
        entriesColour.add(new Entry(8f, 1));
        entriesColour.add(new Entry(6f, 2));
        entriesColour.add(new Entry(12f, 3));
        entriesColour.add(new Entry(18f, 4));
        entriesColour.add(new Entry(9f, 5));

        ArrayList<Entry> entriesBrand = new ArrayList<>();
        entriesBrand.add(new Entry(9f, 0));
        entriesBrand.add(new Entry(18f, 1));
        entriesBrand.add(new Entry(12f, 2));
        entriesBrand.add(new Entry(6f, 3));
        entriesBrand.add(new Entry(8f, 4));
        entriesBrand.add(new Entry(4f, 5));

        PieDataSet dataSetColour = new PieDataSet(entriesColour, "");
        PieDataSet dataSetBrand = new PieDataSet(entriesBrand,"");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        pieDataColour = new PieData(labels, dataSetColour);
        pieDataBrand = new PieData(labels, dataSetBrand);
        dataSetColour.setColors(My_Colours);
        dataSetBrand.setColors(My_Colours);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

