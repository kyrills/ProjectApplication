package com.gerbendenboer.toptabtest.Data;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CSVReader extends Colors implements IDataReader {

    private ArrayList<String> Buurtenlijst;

    Context myContext;
    String filename;
    String[] buurten = new String[] {"Centrum", "Charlois", "Delfshaven", "Feijenoord", "Noord", "Hillegersberg", "Kralingen/Crooswijk", "Pernis", "IJsselmonde" , "West" ,"Omoord" , "Hoogvliet"};
    double[] buurtenVariables = new double[] {Centrum, Charlois, Delfshaven, Feijenoord, Noord, Hillegersberg, kCrooswijk, Pernis, IJsselmonde ,West ,Omoord , Hoogvliet};

    public CSVReader(Context myContext, String filename){
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

                int temp = -1;

                for(String i : buurten){
                    if (fietstrommels[7].contains(i)){
                        temp += 1;
                        for(double j : buurtenVariables){
                            buurtenVariables[temp] += 1;

                            }
                        }
                    }
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
        System.out.println("run > per buurt = " + buurtenVariables[1]);
    }

    @Override
    public void runFietsPerBuurt() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";


        try {

            InputStreamReader is = new InputStreamReader(myContext.getAssets().open(filename));
            br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {

                String[] fietsperbuurt = line.split(cvsSplitBy);

                if (fietsperbuurt[7].contains("Centrum"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        CentrumApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)){
                        CentrumMei += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        CentrumJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        CentrumJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        CentrumAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        CentrumSeptember += 1.0;
                    }


                if (fietsperbuurt[7].contains("Charlois"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "1", 0, 1)){
                        CharloisJanuari += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        CharloisApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)){
                        CharloisMei += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        CharloisJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        CharloisJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        CharloisAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        CharloisSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "12", 0, 1)) {
                        CharloisDecember += 1.0;
                    }
                    else
                        CharloisOverig += 1.0;

                if (fietsperbuurt[7].contains("Delfshaven"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "1", 0, 1)){
                        DelfshavenJanuari += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        DelfshavenApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)){
                        DelfshavenMei += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        DelfshavenJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        DelfshavenJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        DelfshavenAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        DelfshavenSeptember += 1.0;
                    }
                    if(fietsperbuurt[9].regionMatches(true, 0, "11", 0, 1)) {
                        DelfshavenNovember += 1.0;
                    }
                    else
                        DelfshavenOverig += 1.0;

                if (fietsperbuurt[7].contains("Feijenoord"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "3", 0, 1)) {
                        FeijenoordMaart += 1.0;
                    }
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        FeijenoordApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        FeijenoordJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        FeijenoordJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        FeijenoordAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        FeijenoordSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "10", 0, 1)) {
                        FeijenoordOktober += 1.0;
                    }
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "11", 0, 1)) {
                        FeijenoordNovember += 1.0;
                    }
                    else
                        FeijenoordOverig += 1.0;

                Feijenoord += 1.0;

                if (fietsperbuurt[7].contains("Noord"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "1", 0, 1)){
                        NoordJanuari += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "2", 0, 1)){
                        NoordFebruari += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "3", 0, 1)){
                        NoordMaart += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        NoordApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)){
                        NoordMei += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        NoordJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        NoordJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        NoordAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        NoordSeptember += 1.0;
                    }
                    else
                        NoordOverig += 1.0;

                Noord += 1.0;
                if (fietsperbuurt[7].contains("Hillegersberg"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        HillegersbergApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        HillegersbergJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        HillegersbergJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        HillegersbergAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        HillegersbergSeptember += 1.0;
                    }
                    else
                        HillegersbergOverig += 1.0;

                Hillegersberg += 1.0;


                if (fietsperbuurt[7].contains("Overschie"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "2", 0, 1)){
                        OverschieFebruari += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        OverschieApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        OverschieJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        OverschieJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        OverschieAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        OverschieSeptember += 1.0;
                    }
                    else
                        OverschieOverig += 1.0;

                Overschie += 1.0;
                if (fietsperbuurt[7].contains("Kralingen-Crooswijk"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        kCrooswijkApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        kCrooswijkJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        kCrooswijkJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        kCrooswijkAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        kCrooswijkSeptember += 1.0;
                    }
                    if(fietsperbuurt[9].regionMatches(true, 0, "10", 0, 1)){
                        kCrooswijkOktober += 1.0;}
                    else
                        kCrooswijkOverig += 1.0;

                kCrooswijk += 1.0;

                if (fietsperbuurt[7].contains("Pernis"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        PernisApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        PernisJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        PernisJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        PernisAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        PernisSeptember += 1.0;
                    }
                    else
                        PernisOverig += 1.0;

                Pernis += 1.0;

                if (fietsperbuurt[7].contains("IJsselmonde"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        IJsselmondeApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        IJsselmondeJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        IJsselmondeJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        IJsselmondeAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        IJsselmondeSeptember += 1.0;
                    }
                    else
                        IJsselmondeOverig += 1.0;

                IJsselmonde += 1.0;

                if (fietsperbuurt[7].contains("West"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        WestApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        WestJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        WestJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        WestAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        WestSeptember += 1.0;
                    }
                    else
                        WestOverig += 1.0;

                West += 1.0;

                if (fietsperbuurt[7].contains("Omoord"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        OmoordApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        OmoordJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        OmoordJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        OmoordAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        OmoordSeptember += 1.0;
                    }
                    else
                        OmoordOverig += 1.0;

                Omoord += 1.0;


                if (fietsperbuurt[7].contains("Hoogvliet"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        HoogvlietApril += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)){
                        HoogvlietJuni += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)){
                        HoogvlietJuli += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)){
                        HoogvlietAugustus += 1.0;}
                    else
                    if(fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        HoogvlietSeptember += 1.0;
                    }
                    else
                        HoogvlietOverig += 1.0;


                Hoogvliet += 1.0;
            }

            System.out.println(kCrooswijkApril);

            System.out.println(kCrooswijkAugustus);

            System.out.println(kCrooswijkJuni);

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

    @Override
    public void runDiefstal() {

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

    @Override
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
                if (brand[1].contains("OVERIG"))
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

    @Override
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