package com.gerbendenboer.toptabtest.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gerbendenboer.toptabtest.MainActivity;
import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class GroupBarChartFragment extends android.support.v4.app.Fragment {
    private BarData data;
    private String area;

    public GroupBarChartFragment(String area){
        this.area = area;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BarChart barChart = (BarChart)view.findViewById(R.id.FragBarchart);
        barChart.setData(data);
        barChart.animateY(2500);
        barChart.setDescriptionPosition(1000, 1400);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

        ArrayList<BarEntry> Trommels = new ArrayList<>();
        if (area == "Centrum") {
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumMei(), 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCentrumSeptember(), 8));
        }else if (area == "Charlois"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisJanuari(), 0));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisMei(), 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisSeptember(), 8));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getCharloisDecember(), 11));
        }else if (area == "Delfshaven"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenJanuari(), 0));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenMei(), 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenSeptember(), 8));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getDelfshavenNovember(), 10));
        }else if (area == "Feijenoord"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordMaart(), 2));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordSeptember(), 8));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordOktober(), 9));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getFeijenoordNovember(), 10));
        }else if (area == "Noord"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordJanuari(), 0));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordFebruari(), 1));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordMaart(), 2));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordMei(), 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordSeptember(), 8));
        }else if (area == "Hillegersberg"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getNoordApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHillegersbergJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHillegersbergJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHillegersbergAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHillegersbergSeptember(), 8));
        }else if (area == "Overschie"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOverschieFebruari(), 1));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOverschieApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOverschieJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOverschieJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOverschieAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOverschieSeptember(), 8));
        }else if (area == "kCrooswijk"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getkCrooswijkApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getkCrooswijkJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getkCrooswijkJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getkCrooswijkAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getkCrooswijkSeptember(), 8));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getkCrooswijkOktober(), 9));
        }else if (area == "Pernis"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getPernisApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getPernisJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getPernisJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getPernisAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getPernisSeptember(), 8));
        }else if (area == "IJsselmonde"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getIJsselmondeApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getIJsselmondeJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getIJsselmondeJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getIJsselmondeAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getIJsselmondeSeptember(), 8));
        }else if (area == "West"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getWestApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getWestJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getWestJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getWestAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getWestSeptember(), 8));
        }else if (area == "Omoord"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOmoordApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOmoordJuni(), 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOmoordJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOmoordAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getOmoordSeptember(), 8));
        }else if (area == "Hoogvliet"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHoogvlietApril(), 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHoogvlietJuni(), 5));;
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHoogvlietJuli(), 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHoogvlietAugustus(), 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.getHoogvlietSeptember(), 8));
        }

        ArrayList<BarEntry> Diefstal = new ArrayList<>();
//        Trommels.add(new BarEntry(60f, 0));
//        Trommels.add(new BarEntry(80f, 1));
//        Trommels.add(new BarEntry(150f, 2));
//        Trommels.add(new BarEntry(60f, 3));
//        Trommels.add(new BarEntry(80f, 4));
//        Trommels.add(new BarEntry(155f, 5));
//        Trommels.add(new BarEntry(60f, 6));
//        Trommels.add(new BarEntry(80f, 7));
//        Trommels.add(new BarEntry(105f, 8));
//        Trommels.add(new BarEntry(60f, 9));
//        Trommels.add(new BarEntry(80f, 10));
//        Trommels.add(new BarEntry(150f, 11));

        BarDataSet barDataSet1 = new BarDataSet(Diefstal, "Amount of stolen bicycles");
        barDataSet1.setColor(Color.parseColor("#e62e00"));

        BarDataSet barDataSet2 = new BarDataSet(Trommels, "Bike containers placed");
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