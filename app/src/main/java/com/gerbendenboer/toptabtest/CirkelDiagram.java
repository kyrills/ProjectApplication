package com.gerbendenboer.toptabtest;

import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class CirkelDiagram extends AppCompatActivity {
    public PieChart MakePieChart() {
        PieChart pieChart = (PieChart) findViewById(R.id.piechart);
        // creating data values
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(12f, 3));
        entries.add(new Entry(18f, 4));
//        entries.add(new Entry(9f, 5));

        com.github.mikephil.charting.data.PieDataSet dataset = new com.github.mikephil.charting.data.PieDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
//        labels.add("June");

        PieData data = new PieData(labels, dataset); // initialize Piedata
        pieChart.setData(data); //set data into chart
        pieChart.setDescription("Description");
        pieChart.animateY(1500);
        dataset.setColors(ColorTemplate.JOYFUL_COLORS);
        return pieChart;
    }
}
