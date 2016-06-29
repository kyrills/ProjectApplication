package com.gerbendenboer.toptabtest.Fragments;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class TESTGROUPCHART extends android.support.v4.app.Fragment {

    private BarData data;

    public TESTGROUPCHART(){}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BarChart barChart = (BarChart)view.findViewById(R.id.FragBarchart);
        barChart.setGridBackgroundColor(Color.WHITE);
        barChart.setData(data);
        barChart.animateY(5000);
        barChart.zoom(2,2,50,50);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 1));
        entries.add(new BarEntry(8f, 2));
        entries.add(new BarEntry(6f, 3));
        entries.add(new BarEntry(12f, 4));
        entries.add(new BarEntry(18f, 5));
        entries.add(new BarEntry(22f, 6));
        entries.add(new BarEntry(26f, 7));
        entries.add(new BarEntry(29f, 8));


        ArrayList<String> labels = new ArrayList<String>();
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

        ArrayList<BarEntry> group2 = new ArrayList<>();
        group2.add(new BarEntry(6f, 0));
        group2.add(new BarEntry(8f, 1));
        group2.add(new BarEntry(15f, 2));
        group2.add(new BarEntry(6f, 3));
        group2.add(new BarEntry(8f, 4));
        group2.add(new BarEntry(15f, 5));
        group2.add(new BarEntry(6f, 6));
        group2.add(new BarEntry(8f, 7));
        group2.add(new BarEntry(15f, 8));
        group2.add(new BarEntry(6f, 9));
        group2.add(new BarEntry(8f, 10));
        group2.add(new BarEntry(15f, 11));

        BarDataSet barDataSet1 = new BarDataSet(group1, "Group 1");
        //barDataSet1.setColor(Color.rgb(0, 155, 0));
        barDataSet1.setColor(Color.YELLOW);

        BarDataSet barDataSet2 = new BarDataSet(group2, "Group 2");
        barDataSet2.setColor(Color.WHITE);

        ArrayList<IBarDataSet> dataset = new ArrayList<>();
        dataset.add(barDataSet1);
        dataset.add(barDataSet2);


        data = new BarData(labels, dataset);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_groupedbarchart,container,false);
    }
}