package com.gerbendenboer.toptabtest;

import android.net.Uri;
import android.os.Parcelable;
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
import com.gerbendenboer.toptabtest.Fragments.PieChartFragmentBrand;
import com.gerbendenboer.toptabtest.Fragments.PieChartFragmentColour;

import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private ListView listView;
    private ItemArrayAdapter itemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolBar);
        listView = (ListView) findViewById(R.id.list_view);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        itemArrayAdapter = new ItemArrayAdapter(getApplicationContext(), R.layout.single_list_item);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new HomeFragment(), "Home");
        viewPagerAdapter.addFragments(new GrafiekFragment(), "Grafiek");
        viewPagerAdapter.addFragments(new GroupBarChartFragment(), "Barchart");
        viewPagerAdapter.addFragments(new DiagramFragment(), "Diagram");
        viewPagerAdapter.addFragments(new BicycleFragment(), "Bicycle");
        viewPagerAdapter.addFragments(new PieChartFragmentBrand(), "Piechart1");
        viewPagerAdapter.addFragments(new PieChartFragmentColour(), "Piechart2");
        viewPagerAdapter.addFragments(new CalenderFragment(), "Calender");
        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(itemArrayAdapter);
        listView.onRestoreInstanceState(state);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        InputStream inputStream = getResources().openRawResource(R.raw.fietstrommels_maart_2013__1_);
        CSVReader csv = new CSVReader(inputStream);
        List<String[]> scoreList = csv.read();

        for(String [] scoreData : scoreList) {
            itemArrayAdapter.add(scoreData);
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
