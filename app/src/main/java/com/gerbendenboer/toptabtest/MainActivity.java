package com.gerbendenboer.toptabtest;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.gerbendenboer.toptabtest.Fragments.BicycleFragment;
import com.gerbendenboer.toptabtest.Fragments.CalenderFragment;
import com.gerbendenboer.toptabtest.Fragments.DiagramFragment;
import com.gerbendenboer.toptabtest.Fragments.GrafiekFragment;
import com.gerbendenboer.toptabtest.Fragments.HomeFragment;
//import com.gerbendenboer.toptabtest.Fragments.PieChartFragmentBrand;
//import com.gerbendenboer.toptabtest.Fragments.PieChartFragmentColour;
import com.gerbendenboer.toptabtest.Fragments.PiechartFragmentBrand;
import com.gerbendenboer.toptabtest.Fragments.SingleBarChartFragment;
import com.gerbendenboer.toptabtest.Fragments.TESTGROUPCHART;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private ListView listView;
    public static CSVReader Fietstrommels;
    public static CSVReader Diefstal4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fietstrommels = new CSVReader(this.getApplicationContext(), "fietstrommels.csv");

        Diefstal4 = new CSVReader(this.getApplicationContext(), "fietsroof4.csv");

        Diefstal4.runDiefstal();

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        listView = (ListView) findViewById(R.id.list_view);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new HomeFragment(), "Home");
        viewPagerAdapter.addFragments(new GrafiekFragment(), "Grafiek");
        //viewPagerAdapter.addFragments(new GroupBarChartFragment(), "Barchart");
        viewPagerAdapter.addFragments(new DiagramFragment(), "Diagram");
        viewPagerAdapter.addFragments(new BicycleFragment(), "Bicycle");
        viewPagerAdapter.addFragments(new PiechartFragmentBrand(), "Piechart1");
//        viewPagerAdapter.addFragments(new PieChartFragmentColour(), "Piechart2");
        viewPagerAdapter.addFragments(new CalenderFragment(), "Calender");
        viewPagerAdapter.addFragments(new SingleBarChartFragment(), "Single");
        viewPagerAdapter.addFragments(new TESTGROUPCHART(), "TEST");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
