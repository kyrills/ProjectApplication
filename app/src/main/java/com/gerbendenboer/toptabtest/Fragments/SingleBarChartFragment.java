package com.gerbendenboer.toptabtest.Fragments;


import android.content.Context;
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

import java.util.ArrayList;


public class SingleBarChartFragment extends Fragment {

    private Context cont;
    private BarData data;
    private int topFiveIndex;

    public SingleBarChartFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        topFiveIndex = 0;

        MainActivity.bikeContainers.runBikeContainers();

        ArrayList<String> labels = new ArrayList<>();
        ArrayList<BarEntry> group1 = new ArrayList<>();

        for (float x = 999; x >= 0; x--){
            if(topFiveIndex <= 4) {
                if (MainActivity.bikeContainers.getCentrum() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Centrum");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getCharlois() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Charlois");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getDelfshaven() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Delfshaven");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getFeijenoord() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Feijenoord");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getHillegersberg() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Hillegersberg");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getHoogvliet() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Hoogvliet");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getIJsselmonde() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("IJsselmonde");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getkCrooswijk() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Crooswijk");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getNoord() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Noord");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getOmoord() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Omoord");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getOverschie() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Overschie");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getPernis() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("Pernis");
                    topFiveIndex += 1;
                }
                if (MainActivity.bikeContainers.getWest() == x) {
                    group1.add(new BarEntry(x, topFiveIndex));
                    labels.add("West");
                    topFiveIndex += 1;
                }
            }
        }

        BarDataSet barDataSet1 = new BarDataSet(group1, "Amount of bike containers");
        barDataSet1.setColor(Color.parseColor("#e62e00"));

        data = new BarData(labels, barDataSet1);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BarChart barChart = (BarChart)view.findViewById(R.id.singleBarChart);
        barChart.setData(data);
        barChart.animateY(1500);
        barChart.setDescription("");
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
