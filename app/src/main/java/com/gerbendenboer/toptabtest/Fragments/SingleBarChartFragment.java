package com.gerbendenboer.toptabtest.Fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;


public class SingleBarChartFragment extends Fragment {

    Context cont;
    private BarData data;

    public SingleBarChartFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //csvReader.run();
//        System.out.println("TEST" + MainActivity.csvReader.Centrum);
//        System.out.println(MainActivity.csvReader.Charlois);

        ArrayList<String> labels = new ArrayList<>();
        labels.add("J");
        labels.add("F");
        labels.add("M");
        labels.add("A");
        labels.add("M");
        labels.add("J");
        labels.add("J");
        labels.add("A");
        labels.add("S");
        labels.add("O");
        labels.add("N");
        labels.add("D");

        ArrayList<BarEntry> group1 = new ArrayList<>();
        group1.add(new BarEntry(3f, 0));
        group1.add(new BarEntry(12f, 1));
        group1.add(new BarEntry(9f, 2));
        group1.add(new BarEntry(8f, 3));
        group1.add(new BarEntry(12f, 4));
        group1.add(new BarEntry(9f, 5));
        group1.add(new BarEntry(8f, 6));
        group1.add(new BarEntry(12f, 7));
        group1.add(new BarEntry(9f, 8));
        group1.add(new BarEntry(8f, 9));
        group1.add(new BarEntry(12f, 10));
        group1.add(new BarEntry(9f, 11));

        BarDataSet barDataSet1 = new BarDataSet(group1, "Diefstal");
        barDataSet1.setColor(Color.YELLOW);



        data = new BarData(labels, barDataSet1);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BarChart barChart = (BarChart)view.findViewById(R.id.groupedBarChart);
        barChart.setData(data);
        barChart.animateY(1500);
        barChart.zoomIn();
        Legend legend = barChart.getLegend();
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        cont = inflater.getContext();
        return inflater.inflate(R.layout.fragment_single_bar_chart, container, false);
    }
}
