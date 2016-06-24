package com.gerbendenboer.toptabtest;


import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYAxisType;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class GrafiekFragment extends Fragment{

    //    private XYPlot plot;
//    private XYSeries s1;
//    private XYSeries s2;
    private LineChart lineChart;
    private LineData data;

    public GrafiekFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grafiek, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        plot = (XYPlot)view.findViewById(R.id.plot);
//        plot.addSeries(s1, new LineAndPointFormatter(Color.GREEN, Color.GREEN, null, null));
//        plot.addSeries(s2, new LineAndPointFormatter(Color.RED, Color.RED, null, null));

        lineChart = (LineChart)view.findViewById(R.id.chart);
        lineChart.setDrawGridBackground(false);
        lineChart.setData(data);
        lineChart.animateY(2500);
        lineChart.setDescription("");
        Legend legend = lineChart.getLegend();
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        s1 = new SimpleXYSeries(SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "series1", 1, 5, 2, 8, 3, 9);
//        s2 = new SimpleXYSeries(SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "series2", 1, 3, 9, 5, 3, 10);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4, 0));
        entries.add(new Entry(8, 1));
        entries.add(new Entry(6, 2));
        entries.add(new Entry(2, 3));
        entries.add(new Entry(18, 4));
        entries.add(new Entry(9, 5));
        entries.add(new Entry(4, 6));
        entries.add(new Entry(8, 7));
        entries.add(new Entry(7, 8));
        entries.add(new Entry(2, 9));
        entries.add(new Entry(14, 10));
        entries.add(new Entry(9, 11));

        LineDataSet dataset = new LineDataSet(entries, "# of Calls");

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

        data = new LineData(labels, dataset);
        dataset.setColor(Color.WHITE);
        dataset.setFillColor(Color.LTGRAY);
        dataset.setValueTextColor(Color.WHITE);
        dataset.setHighLightColor(Color.YELLOW);
        dataset.setCircleColor(Color.YELLOW);
        dataset.setDrawCubic(false);
        dataset.setDrawFilled(true);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}