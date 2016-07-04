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
import com.gerbendenboer.toptabtest.MainActivity;
import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

public class PieChartFragment extends Fragment {
    private PieChart pieChartBrand;
    private PieChart pieChartColour;
    private PieData pieDataColour;
    private PieData pieDataBrand;
    public float topFiveIndex;
//    private IButton toggleKnoppie;
//    private ToggleButton toggleKnop;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_piechart, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pieChartBrand = (PieChart) view.findViewById(R.id.piechartBrand);
        pieChartBrand.setData(pieDataBrand); //set pieData into chart
        pieChartBrand.setDescription("Description");
        pieChartBrand.animateY(1500);
        pieChartBrand.setTouchEnabled(false);

        pieChartColour = (PieChart) view.findViewById(R.id.piechartColour);
        pieChartColour.setData(pieDataColour);
        pieChartColour.setDescription("Desc");
        pieChartColour.animateY(1500);
        pieChartColour.setTouchEnabled(false);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        topFiveIndex = 0;

        MainActivity.Brands.runBrand();



        ArrayList<Entry> entriesColour = new ArrayList<>();
        entriesColour.add(new Entry(MainActivity.Color.getBLAUW(), 8));
        entriesColour.add(new Entry(MainActivity.Color.getCHROOM(), 9));
        entriesColour.add(new Entry(MainActivity.Color.getGRIJS(), 10));
        entriesColour.add(new Entry(MainActivity.Color.getGROEN(), 11));
        entriesColour.add(new Entry(MainActivity.Color.getROOD(), 12));
        entriesColour.add(new Entry(MainActivity.Color.getZILVER(), 13));
        entriesColour.add(new Entry(MainActivity.Color.getZWART(), 14));
        entriesColour.add(new Entry(MainActivity.Color.getONBEKEND(), 15));
//
        ArrayList<Entry> entriesBrand = new ArrayList<>();
        entriesBrand.add(new Entry(MainActivity.Brands.getBATAVUS(), 0));
        entriesBrand.add(new Entry(MainActivity.Brands.getGAZELLE(), 1));
        entriesBrand.add(new Entry(MainActivity.Brands.getGIANT(), 2));
        entriesBrand.add(new Entry(MainActivity.Brands.getPEUGEOT(), 3));
        entriesBrand.add(new Entry(MainActivity.Brands.getSPARTA(), 4));
        entriesBrand.add(new Entry(MainActivity.Brands.getUNION(), 5));
        entriesBrand.add(new Entry(MainActivity.Brands.getYAMAHA(), 6));
        entriesBrand.add(new Entry(MainActivity.Brands.getOVERIG(), 7));


        PieDataSet dataSetColour = new PieDataSet(entriesColour, "");
        ArrayList<String> labels1 = new ArrayList<String>();
        labels1.add("Blauw");
        labels1.add("Chroom");
        labels1.add("Grijs");
        labels1.add("Groen");
        labels1.add("Rood");
        labels1.add("Zilver");
        labels1.add("Zwart");
        labels1.add("Onbekend");


        PieDataSet dataSetBrand = new PieDataSet(entriesBrand,"TFHTFTFFTFTFT");
        ArrayList<String> labels2 = new ArrayList<String>();
        labels2.add("Batavus");
        labels2.add("Gazelle");
        labels2.add("Giant");
        labels2.add("Peugeot");
        labels2.add("Sparta");
        labels2.add("Union");
        labels2.add("Yamaha");
        labels2.add("Overig");



        pieDataColour = new PieData(labels1, dataSetColour);
        pieDataBrand = new PieData(labels2, dataSetBrand);
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

