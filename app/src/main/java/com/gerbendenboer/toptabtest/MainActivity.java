package com.gerbendenboer.toptabtest;

import android.net.Uri;
import android.os.Parcelable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.github.mikephil.charting.charts.PieChart;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private ListView listView;
    private CSVReaderX csvReaderX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        csvReaderX = new CSVReaderX(this.getApplicationContext(), "fietstrommels.csv");
//        csvReaderX.run();

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        listView = (ListView) findViewById(R.id.list_view);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new HomeFragment(), "Home");
        viewPagerAdapter.addFragments(new GrafiekFragment(), "Grafiek");
        viewPagerAdapter.addFragments(new GroupBarChartFragment(), "Barchart");
        viewPagerAdapter.addFragments(new DiagramFragment(), "Diagram");
        viewPagerAdapter.addFragments(new BicycleFragment(), "Bicycle");
        viewPagerAdapter.addFragments(new PiechartFragment(), "Piechart");
        viewPagerAdapter.addFragments(new CalenderFragment(), "Calender");
        viewPagerAdapter.addFragments(new SingleBarChartFragment(), "Test");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
