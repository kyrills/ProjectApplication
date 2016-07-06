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
        entries.add(new Entry(MainActivity.theft.getJanuari(), 0));
        entries.add(new Entry(MainActivity.theft.getFebruari(), 1));
        entries.add(new Entry(MainActivity.theft.getMaart(), 2));
        entries.add(new Entry(MainActivity.theft.getApril(), 3));
        entries.add(new Entry(MainActivity.theft.getMei(), 4));
        entries.add(new Entry(MainActivity.theft.getJuni(), 5));
        entries.add(new Entry(MainActivity.theft.getJuli(), 6));
        entries.add(new Entry(MainActivity.theft.getAugustus(), 7));
        entries.add(new Entry(MainActivity.theft.getSeptember(), 8));
        entries.add(new Entry(MainActivity.theft.getOktober(), 9));
        entries.add(new Entry(MainActivity.theft.getNovember(), 10));
        entries.add(new Entry(MainActivity.theft.getDecember(), 11));

        LineDataSet dataset = new LineDataSet(entries, "Amount of stolen bicycles per month");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Jan");
        labels.add("Feb");
        labels.add("Mar");
        labels.add("Apr");
        labels.add("May");
        labels.add("Jun");
        labels.add("Jul");
        labels.add("Aug");
        labels.add("Sep");
        labels.add("Oct");
        labels.add("Nov");
        labels.add("Dec");

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
        lineChart.getLegend().setWordWrapEnabled(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grafiek, container, false);
    }

}