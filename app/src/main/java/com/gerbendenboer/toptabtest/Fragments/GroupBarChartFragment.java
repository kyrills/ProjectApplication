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

        ArrayList<BarEntry> Diefstal = new ArrayList<>();
        if (area == "Centrum") {
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCentrumDecember(), 11));
        }if (area == "Charlois"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDCharloisDecember(), 11));
        }if (area == "Delfshaven"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDDelfshavenDecember(), 11));
        }if (area == "Feijenoord"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDFeijenoordDecember(), 11));
        }if (area == "Noord"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDNoordDecember(), 11));
        }if (area == "Hillegersberg"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHillegersbergDecember(), 11));
        }if (area == "Overschie"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOverschieDecember(), 11));
        }if (area == "kCrooswijk"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDkCrooswijkDecember(), 11));
        }if (area == "Pernis"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDPernisDecember(), 11));
        }if (area == "IJsselmonde"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDIJsselmondeDecember(), 11));
        }if (area == "West"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDWestDecember(), 11));
        }if (area == "Omoord"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDOmoordDecember(), 11));
        }if (area == "Hoogvliet"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietJanuari(), 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietFebruari(), 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietMaart(), 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietApril(), 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietMei(), 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietJuni(), 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietJuli(), 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietAugustus(), 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietSeptember(), 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietOktober(), 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietNovember(), 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.getDHoogvlietDecember(), 11));
        }

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

        BarDataSet barDataSetDiefstal = new BarDataSet(Diefstal, "Amount of stolen bicycles");
        barDataSetDiefstal.setColor(Color.parseColor("#e62e00"));

        BarDataSet barDataSetColour = new BarDataSet(Trommels, "Bike containers placed");
        barDataSetColour.setColor(Color.parseColor("#cccccc"));

        ArrayList<IBarDataSet> dataset = new ArrayList<>();
        dataset.add(barDataSetDiefstal);
        dataset.add(barDataSetColour);

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