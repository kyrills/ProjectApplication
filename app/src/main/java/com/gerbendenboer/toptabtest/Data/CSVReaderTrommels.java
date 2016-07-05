package com.gerbendenboer.toptabtest.Data;

/**
 * Created by Samuel on 05-07-16.
 */

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class CSVReaderTrommels extends Colors implements IDatareaderTrommel {

    Context myContext;
    String filename;

    public CSVReaderTrommels(Context myContext, String filename) {
        this.myContext = myContext;
        this.filename = filename;
    }

    @Override
    public void runFietstrommels() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            InputStreamReader is = new InputStreamReader(myContext.getAssets().open(filename));
            br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] fietstrommels = line.split(cvsSplitBy);

                if (fietstrommels[7].contains("Centrum"))
                    Centrum += 1.0;
                if (fietstrommels[7].contains("Charlois"))
                    Charlois += 1.0;
                if (fietstrommels[7].contains("Delfshaven"))
                    Delfshaven += 1.0;
                if (fietstrommels[7].contains("Feijenoord"))
                    Feijenoord += 1.0;
                if (fietstrommels[7].contains("Noord"))
                    Noord += 1.0;
                if (fietstrommels[7].contains("Hillegersberg"))
                    Hillegersberg += 1.0;
                if (fietstrommels[7].contains("Overschie"))
                    Overschie += 1.0;
                if (fietstrommels[7].contains("Kralingen/Crooswijk"))
                    kCrooswijk += 1.0;
                if (fietstrommels[7].contains("Pernis"))
                    Pernis += 1.0;
                if (fietstrommels[7].contains("IJsselmonde"))
                    IJsselmonde += 1.0;
                if (fietstrommels[7].contains("West"))
                    West += 1.0;
                if (fietstrommels[7].contains("Omoord"))
                    Omoord += 1.0;
                if (fietstrommels[7].contains("Hoogvliet"))
                    Hoogvliet += 1.0;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done");
        ;
        System.out.println("Hoogvliet" + Hoogvliet);
    }
}
