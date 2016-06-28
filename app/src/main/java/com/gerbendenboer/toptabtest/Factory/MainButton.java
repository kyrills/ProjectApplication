package com.gerbendenboer.toptabtest.Factory;


import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.gerbendenboer.toptabtest.Fragments.PieChartFragment;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;


public class MainButton extends AppCompatActivity implements IButton {

    @Override
    public void action(final ToggleButton toggleButton) {
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()){
                    PieChartFragment.pieChart.setData(PieChartFragment.pieDataColour);
                }else{

                }
            }
        });

//        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    System.out.println("Aan");
//                    PieChartFragment.pieChart.setData(PieChartFragment.pieDataColour);
//                } else {
//                    System.out.println("Uit");
//                    PieChartFragment.pieChart.setData(PieChartFragment.pieDataBrand);
//
//                }
//            }
//        });

    }
}
