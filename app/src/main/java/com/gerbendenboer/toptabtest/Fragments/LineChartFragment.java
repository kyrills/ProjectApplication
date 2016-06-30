package com.gerbendenboer.toptabtest.Fragments;



import android.graphics.Color;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gerbendenboer.toptabtest.MainActivity;
import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LineChartFragment extends Fragment{

    private LineChart lineChart;
    private LineData data;

    public LineChartFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(MainActivity.DiefstalMaand.getJanuari(), 0));
        entries.add(new Entry(MainActivity.DiefstalMaand.getFebruari(), 1));
        entries.add(new Entry(MainActivity.DiefstalMaand.getMaart(), 2));
        entries.add(new Entry(MainActivity.DiefstalMaand.getApril(), 3));
        entries.add(new Entry(MainActivity.DiefstalMaand.getMei(), 4));
        entries.add(new Entry(MainActivity.DiefstalMaand.getJuni(), 5));
        entries.add(new Entry(MainActivity.DiefstalMaand.getJuli(), 6));
        entries.add(new Entry(MainActivity.DiefstalMaand.getAugustus(), 7));
        entries.add(new Entry(MainActivity.DiefstalMaand.getSeptember(), 8));
        entries.add(new Entry(MainActivity.DiefstalMaand.getOktober(), 9));
        entries.add(new Entry(MainActivity.DiefstalMaand.getNovember(), 10));
        entries.add(new Entry(MainActivity.DiefstalMaand.getDecember(), 11));

        LineDataSet dataset = new LineDataSet(entries, "Diefstal per maand");

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
        dataset.setColor(Color.parseColor("#e62e00"));
        dataset.setLineWidth(4);
        dataset.setValueTextColor(Color.BLACK);
        dataset.setHighLightColor(Color.parseColor("#cccccc"));
        dataset.setHighlightLineWidth(2);
        dataset.setCircleColor(Color.parseColor("#cccccc"));
        dataset.setCircleColorHole(Color.parseColor("#cccccc"));

//        Optional
//        dataset.setFillColor(Color.parseColor("#e62e00"));
//        dataset.setDrawFilled(false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lineChart = (LineChart)view.findViewById(R.id.chart);
        lineChart.setDrawGridBackground(false);
        lineChart.setData(data);
        lineChart.animateY(2500);
        lineChart.setDescription("");
        Legend legend = lineChart.getLegend();
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grafiek, container, false);
    }

}