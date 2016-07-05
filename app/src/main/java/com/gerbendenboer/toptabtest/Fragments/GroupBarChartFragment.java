package com.gerbendenboer.toptabtest.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.gerbendenboer.toptabtest.MainActivity;
import com.gerbendenboer.toptabtest.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class GroupBarChartFragment extends android.support.v4.app.Fragment {
    private BarData data;
    private String area;

    public GroupBarChartFragment(String area){this.area = area;}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BarChart barChart = (BarChart)view.findViewById(R.id.FragBarchart);
        barChart.setData(data);
        barChart.animateY(2500);
        barChart.setDescriptionPosition(1000, 1400);
        Legend legend = barChart.getLegend();
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_LEFT);
        barChart.getLegend().setWordWrapEnabled(true);
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
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCentrumDecember, 11));
        }if (area == "Charlois"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DCharloisDecember, 11));
        }if (area == "Delfshaven"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DDelfshavenDecember, 11));
        }if (area == "Feijenoord"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DFeijenoordDecember, 11));
        }if (area == "Noord"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DNoordDecember, 11));
        }if (area == "Hillegersberg"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHillegersbergDecember, 11));
        }if (area == "Overschie"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOverschieDecember, 11));
        }if (area == "kCrooswijk"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DkCrooswijkDecember, 11));
        }if (area == "Pernis"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DPernisDecember, 11));
        }if (area == "IJsselmonde"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DIJsselmondeDecember, 11));
        }if (area == "West"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DWestDecember, 11));
        }if (area == "Omoord"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DOmoordDecember, 11));
        }if (area == "Hoogvliet"){
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietApril, 3));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietMei, 4));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.RunFietsDiefstalPerBuurt.DHoogvlietDecember, 11));
        }

        ArrayList<BarEntry> Trommels = new ArrayList<>();
        if (area == "Centrum") {
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CentrumApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CentrumMei, 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CentrumJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CentrumJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CentrumAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CentrumSeptember, 8));
        }else if (area == "Charlois"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisJanuari, 0));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisMei, 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisSeptember, 8));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.CharloisDecember, 11));
        }else if (area == "Delfshaven"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenJanuari, 0));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenMei, 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenSeptember, 8));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.DelfshavenNovember, 10));
        }else if (area == "Feijenoord"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.FeijenoordMaart, 2));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.FeijenoordJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.FeijenoordJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.FeijenoordAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.FeijenoordOktober, 9));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.FeijenoordNovember, 10));
        }else if (area == "Noord"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordJanuari, 0));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordFebruari, 1));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordMaart, 2));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordMei, 4));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.NoordSeptember, 8));
        }else if (area == "Hillegersberg"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HillegersbergApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HillegersbergJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HillegersbergJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HillegersbergAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HillegersbergSeptember, 8));
        }else if (area == "Overschie"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OverschieFebruari, 1));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OverschieApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OverschieJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OverschieJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OverschieAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OverschieSeptember, 8));
        }else if (area == "kCrooswijk"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.kCrooswijkJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.kCrooswijkJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.kCrooswijkAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.kCrooswijkSeptember, 8));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.kCrooswijkOktober, 9));
        }else if (area == "Pernis"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.PernisApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.PernisJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.PernisJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.PernisAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.PernisSeptember, 8));
        }else if (area == "IJsselmonde"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.IJsselmondeApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.IJsselmondeJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.IJsselmondeJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.IJsselmondeAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.IJsselmondeSeptember, 8));
        }else if (area == "West"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.WestApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.WestJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.WestJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.WestAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.WestSeptember, 8));
        }else if (area == "Omoord"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OmoordApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OmoordJuni, 5));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OmoordJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OmoordAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.OmoordSeptember, 8));
        }else if (area == "Hoogvliet"){
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HoogvlietApril, 3));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HoogvlietJuni, 5));;
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HoogvlietJuli, 6));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HoogvlietAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.RunFietsPerBuurt.HoogvlietSeptember, 8));
        }

        BarDataSet barDataSetDiefstal = new BarDataSet(Diefstal, "Amount of stolen bikes");
        barDataSetDiefstal.setColor(Color.GRAY);

        BarDataSet barDataSetColour = new BarDataSet(Trommels, "Bike containers placed");
        barDataSetColour.setColor(Color.parseColor("#e62e00"));

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