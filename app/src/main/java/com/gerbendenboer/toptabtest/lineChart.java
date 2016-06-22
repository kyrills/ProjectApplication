//package com.gerbendenboer.toptabtest;//package com.groep4.inf1e_prj_app;
//
//import com.gerbendenboer.toptabtest.R;
//import com.jjoe64.graphview.GraphView;
//import com.jjoe64.graphview.series.DataPoint;
//import com.jjoe64.graphview.series.LineGraphSeries;
//import android.view.View;
//
//import com.jjoe64.graphview.GraphView;
//import com.jjoe64.graphview.series.DataPoint;
//import com.jjoe64.graphview.series.LineGraphSeries;
//
////package app.num.graphview;
//
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.DashPathEffect;
//import android.graphics.Paint;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.jjoe64.graphview.DefaultLabelFormatter;
//import com.jjoe64.graphview.GraphView;
//import com.jjoe64.graphview.ValueDependentColor;
//import com.jjoe64.graphview.helper.StaticLabelsFormatter;
//import com.jjoe64.graphview.series.BarGraphSeries;
//import com.jjoe64.graphview.series.DataPoint;
//import com.jjoe64.graphview.series.DataPointInterface;
//import com.jjoe64.graphview.series.LineGraphSeries;
//import com.jjoe64.graphview.series.PointsGraphSeries;
///**
// * Created by Kyrilll van Seventer on 21/06/2016.

// */
//public class lineChart extends AppCompatActivity {
//
//    //         Line Graph
//
//    GraphView line_graph = (GraphView) findViewById(R.id.linegraph);
//    LineGraphSeries<DataPoint> line_series =
//            new LineGraphSeries<DataPoint>(new DataPoint[] {
//                    new DataPoint(0, 1),
//                    new DataPoint(1, 5),
//                    new DataPoint(2, 3),
//                    new DataPoint(3, 2),
//                    new DataPoint(4, 6)
//            });
//    line_graph.addSeries(line_series);
//
//    // set the bound
//
//    // set manual X bounds
//    line_graph.getViewport().setXAxisBoundsManual(true);
//    line_graph.getViewport().setMinX(0.5);
//    line_graph.getViewport().setMaxX(3.5);
//
//    // set manual Y bounds
//    line_graph.getViewport().setYAxisBoundsManual(true);
//    line_graph.getViewport().setMinY(0.5);
//    line_graph.getViewport().setMaxY(8);
//
//    line_graph.getViewport().setScrollable(true);
//
//    LineGraphSeries<DataPoint> series;
//}
