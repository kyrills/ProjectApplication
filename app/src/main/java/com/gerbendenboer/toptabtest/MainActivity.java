package com.gerbendenboer.toptabtest;


import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.gerbendenboer.toptabtest.Data.CSVReaderTheftBrandColor;
import com.gerbendenboer.toptabtest.Data.CSVReaderTheftPerNeighborhood;
import com.gerbendenboer.toptabtest.Data.CSVReaderContainerPerNeighborhood;
import com.gerbendenboer.toptabtest.Data.CSVReaderBikeContainers;
import com.gerbendenboer.toptabtest.Fragments.LineChartFragment;
import com.gerbendenboer.toptabtest.Fragments.HomeFragment;
import com.gerbendenboer.toptabtest.Fragments.PieChartFragment;
import com.gerbendenboer.toptabtest.Fragments.SingleBarChartFragment;
import com.gerbendenboer.toptabtest.Fragments.GroupBarChartMenuFragment;


public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private ListView listView;
    public static CSVReaderBikeContainers bikeContainers;
    public static CSVReaderContainerPerNeighborhood containerPerNeighborhood;
    public static CSVReaderTheftPerNeighborhood theftPerNeighborhood;
    public static CSVReaderTheftBrandColor theft;
    public static CSVReaderTheftBrandColor brand;
    public static CSVReaderTheftBrandColor color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bikeContainers = new CSVReaderBikeContainers(this.getApplicationContext(), "fietstrommels.csv");
        bikeContainers.runBikeContainers();

        theftPerNeighborhood = new CSVReaderTheftPerNeighborhood(this.getApplicationContext(), "fietsroof_per_maand2.csv");
        theftPerNeighborhood.runBikeTheftPerNeighborhood();

        containerPerNeighborhood = new CSVReaderContainerPerNeighborhood(this.getApplicationContext(), "fietstrommels.csv");
        containerPerNeighborhood.runBikePerNeighborhood();

        theft = new CSVReaderTheftBrandColor(this.getApplicationContext(), "fietsroof_per_maand.csv");
        theft.runTheft();

        color = new CSVReaderTheftBrandColor(this.getApplicationContext(), "fietsmerk.csv");
        color.runColor();

        brand = new CSVReaderTheftBrandColor(this.getApplicationContext(), "fietsmerk.csv");
        brand.runBrand();

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        listView = (ListView) findViewById(R.id.list_view);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new HomeFragment(), "Home");
        viewPagerAdapter.addFragments(new LineChartFragment(), "Graph");
        viewPagerAdapter.addFragments(new PieChartFragment(), "Piechart");
        viewPagerAdapter.addFragments(new SingleBarChartFragment(), "Single");
        viewPagerAdapter.addFragments(new GroupBarChartMenuFragment(), "Grouped");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(0).setIcon(R.drawable.home);
            tabLayout.getTabAt(1).setIcon(R.drawable.linechart);
            tabLayout.getTabAt(2).setIcon(R.drawable.piechart);
            tabLayout.getTabAt(3).setIcon(R.drawable.ranking);
            tabLayout.getTabAt(4).setIcon(R.drawable.barchart);
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
