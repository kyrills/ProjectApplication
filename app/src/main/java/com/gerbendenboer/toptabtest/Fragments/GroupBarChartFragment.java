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
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

public class GroupBarChartFragment extends android.support.v4.app.Fragment {

    private BarData data;

    public GroupBarChartFragment(){}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BarChart barChart = (BarChart)view.findViewById(R.id.FragBarchart);
        barChart.setData(data);
        barChart.animateY(2500);
        barChart.setDescriptionPosition(1000, 1400);
//        barChart.zoom(2,2,50,50);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

        ArrayList<BarEntry> Diefstal = new ArrayList<>();
        Diefstal.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumApril(), 0));
        Diefstal.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumJuni(), 1));
        Diefstal.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumAugustus(), 2));
        Diefstal.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumJuli(), 3));
        Diefstal.add(new BarEntry(120f, 4));
        Diefstal.add(new BarEntry(90f, 5));
        Diefstal.add(new BarEntry(80f, 6));
        Diefstal.add(new BarEntry(120f, 7));
        Diefstal.add(new BarEntry(90f, 8));
        Diefstal.add(new BarEntry(80f, 9));
        Diefstal.add(new BarEntry(120f, 10));
        Diefstal.add(new BarEntry(90f, 11));

        ArrayList<BarEntry> Trommels = new ArrayList<>();
        Trommels.add(new BarEntry(60f, 0));
        Trommels.add(new BarEntry(80f, 1));
        Trommels.add(new BarEntry(150f, 2));
        Trommels.add(new BarEntry(60f, 3));
        Trommels.add(new BarEntry(80f, 4));
        Trommels.add(new BarEntry(155f, 5));
        Trommels.add(new BarEntry(60f, 6));
        Trommels.add(new BarEntry(80f, 7));
        Trommels.add(new BarEntry(105f, 8));
        Trommels.add(new BarEntry(60f, 9));
        Trommels.add(new BarEntry(80f, 10));
        Trommels.add(new BarEntry(150f, 11));

        BarDataSet barDataSet1 = new BarDataSet(Diefstal, "Diefstal");
        barDataSet1.setColor(Color.parseColor("#e62e00"));

        BarDataSet barDataSet2 = new BarDataSet(Trommels, "Fietstrommels");
        barDataSet2.setColor(Color.parseColor("#cccccc"));

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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}