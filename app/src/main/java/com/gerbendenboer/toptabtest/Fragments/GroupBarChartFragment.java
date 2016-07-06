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
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCentrumDecember, 11));
        }if (area == "Charlois"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DCharloisDecember, 11));
        }if (area == "Delfshaven"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DDelfshavenDecember, 11));
        }if (area == "Feijenoord"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DFeijenoordDecember, 11));
        }if (area == "Noord"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DNoordDecember, 11));
        }if (area == "Hillegersberg"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHillegersbergDecember, 11));
        }if (area == "Overschie"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOverschieDecember, 11));
        }if (area == "kCrooswijk"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DkCrooswijkDecember, 11));
        }if (area == "Pernis"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DPernisDecember, 11));
        }if (area == "IJsselmonde"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DIJsselmondeDecember, 11));
        }if (area == "West"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DWestDecember, 11));
        }if (area == "Omoord"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DOmoordDecember, 11));
        }if (area == "Hoogvliet"){
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietJanuari, 0));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietFebruari, 1));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietMaart, 2));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietApril, 3));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietMei, 4));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietJuni, 5));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietJuli, 6));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietAugustus, 7));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietSeptember, 8));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietOktober, 9));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietNovember, 10));
            Diefstal.add(new BarEntry(MainActivity.theftPerNeighborhood.DHoogvlietDecember, 11));
        }

        ArrayList<BarEntry> Trommels = new ArrayList<>();
        if (area == "Centrum") {
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CentrumApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CentrumMei, 4));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CentrumJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CentrumJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CentrumAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CentrumSeptember, 8));
        }else if (area == "Charlois"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisJanuari, 0));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisMei, 4));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisSeptember, 8));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.CharloisDecember, 11));
        }else if (area == "Delfshaven"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenJanuari, 0));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenMei, 4));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenSeptember, 8));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.DelfshavenNovember, 10));
        }else if (area == "Feijenoord"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.FeijenoordMaart, 2));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.FeijenoordJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.FeijenoordJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.FeijenoordAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.FeijenoordOktober, 9));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.FeijenoordNovember, 10));
        }else if (area == "Noord"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordJanuari, 0));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordFebruari, 1));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordMaart, 2));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordMei, 4));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.NoordSeptember, 8));
        }else if (area == "Hillegersberg"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HillegersbergApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HillegersbergJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HillegersbergJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HillegersbergAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HillegersbergSeptember, 8));
        }else if (area == "Overschie"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OverschieFebruari, 1));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OverschieApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OverschieJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OverschieJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OverschieAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OverschieSeptember, 8));
        }else if (area == "kCrooswijk"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.kCrooswijkJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.kCrooswijkJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.kCrooswijkAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.kCrooswijkSeptember, 8));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.kCrooswijkOktober, 9));
        }else if (area == "Pernis"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.PernisApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.PernisJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.PernisJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.PernisAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.PernisSeptember, 8));
        }else if (area == "IJsselmonde"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.IJsselmondeApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.IJsselmondeJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.IJsselmondeJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.IJsselmondeAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.IJsselmondeSeptember, 8));
        }else if (area == "West"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.WestApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.WestJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.WestJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.WestAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.WestSeptember, 8));
        }else if (area == "Omoord"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OmoordApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OmoordJuni, 5));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OmoordJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OmoordAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.OmoordSeptember, 8));
        }else if (area == "Hoogvliet"){
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HoogvlietApril, 3));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HoogvlietJuni, 5));;
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HoogvlietJuli, 6));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HoogvlietAugustus, 7));
            Trommels.add(new BarEntry(MainActivity.containerPerNeighborhood.HoogvlietSeptember, 8));
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