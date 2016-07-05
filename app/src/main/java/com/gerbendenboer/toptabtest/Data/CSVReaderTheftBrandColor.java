package com.gerbendenboer.toptabtest.Data;

import android.content.Context;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVReaderTheftBrandColor extends TheftBrandColor {
    Context myContext;
    String filename;

    public CSVReaderTheftBrandColor(Context myContext, String filename){
        this.myContext = myContext;
        this.filename = filename;
    }


    public void runTheft() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            InputStreamReader is = new InputStreamReader(myContext.getAssets().open(filename));
            br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] diefstal4 = line.split(cvsSplitBy);

                if (diefstal4[4].contains("1"))
                    if(diefstal4[4].contains("10")){
                        Januari += 0;}
                    else
                    if(diefstal4[4].contains("11")){
                        Januari += 0;}
                    else
                    if(diefstal4[4].contains("12")){
                        Januari += 0;}
                    else{
                        Januari += 1.0;}
                if (diefstal4[4].contains("2"))
                    if(diefstal4[4].contains("12")){
                        Februari += 0;}
                    else
                        Februari += 1.0;
                if (diefstal4[4].contains("3"))
                    Maart += 1.0;
                if (diefstal4[4].contains("4"))
                    April += 1.0;
                if (diefstal4[4].contains("5"))
                    Mei += 1.0;
                if (diefstal4[4].contains("6"))
                    Juni += 1.0;
                if (diefstal4[4].contains("7"))
                    Juli += 1.0;
                if (diefstal4[4].contains("8"))
                    Augustus += 1.0;
                if (diefstal4[4].contains("9"))
                    September += 1.0;
                if (diefstal4[4].contains("10"))
                    Oktober += 1.0;
                if (diefstal4[4].contains("11"))
                    November += 1.0;
                if (diefstal4[4].contains("12"))
                    December += 1.0;
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
    }


    public void runBrand() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            InputStreamReader is = new InputStreamReader(myContext.getAssets().open(filename));
            br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] brand = line.split(cvsSplitBy);

                if (brand[1].contains("GAZELLE"))
                    GAZELLE += 1.0;
                if (brand[1].contains("PEUGEOT"))
                    PEUGEOT += 1.0;
                if (brand[1].contains("BATAVUS"))
                    BATAVUS += 1.0;
                if (brand[1].contains("SPARTA"))
                    SPARTA += 1.0;
                if (brand[1].contains("GIANT"))
                    GIANT += 1.0;
                if (brand[1].contains("UNION"))
                    UNION += 1.0;
                if (brand[1].contains("YAMAHA"))
                    YAMAHA += 1.0;
                if (brand[1].contains("ONBEKEND"))
                    OVERIG += 1.0;

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
    }


    public void runColor() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            InputStreamReader is = new InputStreamReader(myContext.getAssets().open(filename));
            br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] Color = line.split(cvsSplitBy);

                if (Color[3].contains("ROOD"))
                    ROOD += 1.0;
                if (Color[3].contains("GROEN"))
                    GROEN += 1.0;
                if (Color[3].contains("BLAUW"))
                    BLAUW += 1.0;
                if (Color[3].contains("GRIJS"))
                    GRIJS += 1.0;
                if (Color[3].contains("CHROOM"))
                    CHROOM += 1.0;
                if (Color[3].contains("ZWART"))
                    ZWART += 1.0;
                if (Color[3].contains("ZILVER"))
                    ZILVER += 1.0;
                if (Color[3].contains("ONBEKEND"))
                    ONBEKEND += 1.0;

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
    }


}