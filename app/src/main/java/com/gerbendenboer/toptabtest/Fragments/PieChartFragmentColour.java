//package com.gerbendenboer.toptabtest.Fragments;
//
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ToggleButton;
//
//import com.gerbendenboer.toptabtest.Factory.ButtonFactory;
//import com.gerbendenboer.toptabtest.Factory.IButton;
//import com.gerbendenboer.toptabtest.R;
//import com.github.mikephil.charting.charts.PieChart;
//import com.github.mikephil.charting.data.Entry;
//import com.github.mikephil.charting.data.PieData;
//import com.github.mikephil.charting.data.PieDataSet;
//
//import java.util.ArrayList;
//
//public class PieChartFragmentColour extends Fragment {
//    private PieChart pieChart;
//    private PieData pieData;
//    private IButton toggleKnoppie;
//    private ToggleButton toggleKnop;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_piechart, container, false);
//    }
//
//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        pieChart = (PieChart) view.findViewById(R.id.piechart);
//        pieChart.setData(pieData); //set pieData into chart
//        pieChart.setDescription("Description 2");
//        pieChart.animateY(1500);
//
//        toggleKnoppie = ButtonFactory.getButton("main");
//        toggleKnop = (ToggleButton) view.findViewById(R.id.toggleButton);
//        toggleKnoppie.action(toggleKnop);
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        ArrayList<Entry> entries = new ArrayList<>();
//        entries.add(new Entry(9f, 0));
//        entries.add(new Entry(18f, 1));
//        entries.add(new Entry(12f, 2));
//        entries.add(new Entry(6f, 3));
//        entries.add(new Entry(8f, 4));
//        entries.add(new Entry(4f, 5));
//
//
//        PieDataSet dataSet = new PieDataSet(entries, "# of calls");
//        ArrayList<String> labels = new ArrayList<String>();
//        labels.add("January");
//        labels.add("February");
//        labels.add("March");
//        labels.add("April");
//        labels.add("May");
//        labels.add("June");
//
//
//        pieData = new PieData(labels, dataSet);
//        dataSet.setColors(My_Colours);
//
//    }
//
//    public static final int[] My_Colours = {
//            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
//            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
//            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
//            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
//    };
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//    }
//}

