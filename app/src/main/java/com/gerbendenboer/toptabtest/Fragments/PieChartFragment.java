package com.gerbendenboer.toptabtest.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gerbendenboer.toptabtest.MainActivity;
import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

//This class creates the fragment with 2 Piecharts.

public class PieChartFragment extends Fragment {
    private PieChart pieChartBrand;
    private PieChart pieChartColour;
    private PieData pieDataColour;
    private PieData pieDataBrand;
    private float topFiveIndex;

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
        pieChartBrand.animateY(500);
        pieChartBrand.setTouchEnabled(false);
        Legend legendBrand = pieChartBrand.getLegend();
        legendBrand.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
        pieChartBrand.getLegend().setWordWrapEnabled(true);


        pieChartColour = (PieChart) view.findViewById(R.id.piechartColour);
        pieChartColour.setData(pieDataColour);
        pieChartColour.setDescription("Most stolen bikes depending on colour");
        pieChartColour.animateY(500);
        pieChartColour.setTouchEnabled(false);
        Legend legendColour = pieChartColour.getLegend();
        legendColour.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        topFiveIndex = 0;
        MainActivity.brand.runBrand();

        ArrayList<Entry> entriesColour = new ArrayList<>();
        entriesColour.add(new Entry(MainActivity.color.getBLAUW(), 8));
        entriesColour.add(new Entry(MainActivity.color.getCHROOM(), 9));
        entriesColour.add(new Entry(MainActivity.color.getGRIJS(), 10));
        entriesColour.add(new Entry(MainActivity.color.getGROEN(), 11));
        entriesColour.add(new Entry(MainActivity.color.getROOD(), 12));
        entriesColour.add(new Entry(MainActivity.color.getZILVER(), 13));
        entriesColour.add(new Entry(MainActivity.color.getZWART(), 14));
        entriesColour.add(new Entry(MainActivity.color.getONBEKEND(), 15));

        ArrayList<Entry> entriesBrand = new ArrayList<>();
        entriesBrand.add(new Entry(MainActivity.brand.getBATAVUS(), 0));
        entriesBrand.add(new Entry(MainActivity.brand.getGAZELLE(), 1));
        entriesBrand.add(new Entry(MainActivity.brand.getGIANT(), 2));
        entriesBrand.add(new Entry(MainActivity.brand.getPEUGEOT(), 3));
        entriesBrand.add(new Entry(MainActivity.brand.getSPARTA(), 4));
        entriesBrand.add(new Entry(MainActivity.brand.getUNION(), 5));
        entriesBrand.add(new Entry(MainActivity.brand.getYAMAHA(), 6));
        entriesBrand.add(new Entry(MainActivity.brand.getOVERIG(), 7));

        PieDataSet dataSetColour = new PieDataSet(entriesColour, "");
        ArrayList<String> labelsColour = new ArrayList<String>();
        labelsColour.add("Blue");
        labelsColour.add("Chrome");
        labelsColour.add("Grey");
        labelsColour.add("Green");
        labelsColour.add("Red");
        labelsColour.add("Silver");
        labelsColour.add("Black");
        labelsColour.add("Unknown");

        PieDataSet dataSetBrand = new PieDataSet(entriesBrand,"");
        ArrayList<String> labelsBrand = new ArrayList<String>();
        labelsBrand.add("Batavus");
        labelsBrand.add("Gazelle");
        labelsBrand.add("Giant");
        labelsBrand.add("Peugeot");
        labelsBrand.add("Sparta");
        labelsBrand.add("Union");
        labelsBrand.add("Yamaha");
        labelsBrand.add("Unknown");

        pieDataColour = new PieData(labelsColour, dataSetColour);
        pieDataBrand = new PieData(labelsBrand, dataSetBrand);
        dataSetColour.setColors(My_Colours);
        dataSetBrand.setColors(My_Colours);
    }

    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

