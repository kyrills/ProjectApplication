//package com.gerbendenboer.toptabtest;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.LinearLayout;
//
//public class CirkelDiagramFragment extends Fragment {
//    CirkelDiagram cirkelDiagram = new CirkelDiagram();
//    public  CirkelDiagramFragment(){}
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = (LinearLayout) inflater.inflate(R.layout.fragment_cirkeldiagram, container, false);
//        LinearLayout chartContainerlayout = (LinearLayout) view.findViewById(R.id.piechart);
//        if (container == null) {
//            return null;
//        }
//        // Adding the pie chart to the custom layout
//        chartContainerlayout.addView(cirkelDiagram.MakePieChart());
//        return view;
//    }
//}

