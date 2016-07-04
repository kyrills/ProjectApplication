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
        System.out.println("Done");;
        System.out.println("Hoogvliet"+ Hoogvliet);
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
                    else
                        CentrumOverig += 1.0;

                if (fietsperbuurt[7].contains("Charlois"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        CharloisApril += 1.0;}
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
                        CentrumOverig += 1.0;

                if (fietsperbuurt[7].contains("Delfshaven"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        DelfshavenApril += 1.0;}
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
                    else
                        DelfshavenOverig += 1.0;

                if (fietsperbuurt[7].contains("Feijenoord"))

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
                        FeijenoordOverig += 1.0;

                Feijenoord += 1.0;

                if (fietsperbuurt[7].contains("Noord"))

                    if(fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)){
                        NoordApril += 1.0;}
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

    public void runFietsDiefstalPerBuurt() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";


        try {

            InputStreamReader is = new InputStreamReader(myContext.getAssets().open(filename));
            br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {


                String[] fietsperbuurtD = line.split(cvsSplitBy);

                if (fietsperbuurtD[1].contains("CENTRUM"))

                    if(fietsperbuurtD[2].contains("4")){
                        DCentrumJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DCentrumFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DCentrumMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DCentrumApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("5")){
                        DCentrumMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                        DCentrumJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                        DCentrumJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                        DCentrumAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DCentrumSeptember += 1.0;
                    }
                    if(fietsperbuurtD[2].contains("4")){
                        DCentrumOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DCentrumNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DCentrumDecember += 1.0;}
                    else


                if (fietsperbuurtD[1].contains("CHARLOIS"))

                    if(fietsperbuurtD[2].contains("1")){
                        DCharloisJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                        DCharloisFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("3")){
                        DCharloisMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DCharloisApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("5")){
                        DCharloisMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                        DCharloisJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                        DCharloisJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                        DCharloisAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DCharloisSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("10")){
                        DCharloisOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("11")){
                        DCharloisNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("12")) {
                        DCharloisDecember += 1.0;
                    }
                    else
                    CharloisOverig += 1.0;

                if (fietsperbuurtD[1].contains("DELFSHAVEN"))

                    if(fietsperbuurtD[2].contains("1")){
                        DDelfshavenJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("1")){
                        DDelfshavenFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("1")){
                        DDelfshavenMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DDelfshavenApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("5")){
                        DDelfshavenMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                        DDelfshavenJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                        DDelfshavenJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                        DDelfshavenAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DDelfshavenSeptember += 1.0;
                    }
                    if(fietsperbuurtD[2].contains("1")){
                        DDelfshavenOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("11")) {
                        DDelfshavenNovember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("1")){
                        DDelfshavenDecember += 1.0;}
                    else
                    DelfshavenOverig += 1.0;

                if (fietsperbuurtD[1].contains("FEIJENOORD"))

                    if(fietsperbuurtD[2].contains("3")) {
                        DFeijenoordJanuari += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("3")) {
                        DFeijenoordFebruari += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("3")) {
                        DFeijenoordMaart += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DFeijenoordApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("3")) {
                        DFeijenoordMei += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("6")){
                        DFeijenoordJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                        DFeijenoordJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                        DFeijenoordAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DFeijenoordSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("10")) {
                        DFeijenoordOktober += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("11")) {
                        DFeijenoordNovember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("3")) {
                        DFeijenoordDecember += 1.0;
                    }
                    else

                if (fietsperbuurtD[1].contains("NOORD"))

                    if(fietsperbuurtD[2].contains("1")){
                    DNoordJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                    DNoordFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("3")){
                    DNoordMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DNoordApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("5")){
                    DNoordMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DNoordJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DNoordJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DNoordAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DNoordSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DNoordOktober += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DNoordNovember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DNoordDecember += 1.0;
                    }
                    else

                if (fietsperbuurtD[1].contains("HILLEGERSBERG"))

                    if(fietsperbuurtD[2].contains("4")){
                        DHillegersbergJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHillegersbergFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHillegersbergMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DHillegersbergApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHillegersbergMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DHillegersbergJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DHillegersbergJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DHillegersbergAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DHillegersbergSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHillegersbergOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHillegersbergNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHillegersbergDecember += 1.0;}
                    else


                //Hillegersberg += 1.0;


                if (fietsperbuurtD[1].contains("OVERSCHIE"))

                    if(fietsperbuurtD[2].contains("2")){
                        DOverschieJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                    DOverschieFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                        DOverschieMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DOverschieApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                        DOverschieMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DOverschieJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DOverschieJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DOverschieAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DOverschieSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("2")){
                        DOverschieOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                        DOverschieNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                        DOverschieDecember += 1.0;}
                    else
                    OverschieOverig += 1.0;

                    Overschie += 1.0;
                if (fietsperbuurtD[1].contains("CROOSWIJK"))

                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                        DkCrooswijkJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("1")){
                        DkCrooswijkJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                        DkCrooswijkAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                        DkCrooswijkSeptember += 1.0;
                    }
                    if(fietsperbuurtD[2].contains("10")){
                        DkCrooswijkOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkDecember += 1.0;}
                    else
                    //kCrooswijkOverig += 1.0;

                if (fietsperbuurtD[1].contains("KRALINGEN"))

                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DkCrooswijkApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DkCrooswijkJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DkCrooswijkJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DkCrooswijkAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DkCrooswijkSeptember += 1.0;
                    }
                    if(fietsperbuurtD[2].contains("10")){
                    DkCrooswijkOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkDecember += 1.0;}
                    else


                if (fietsperbuurtD[1].contains("PERNIS"))

                    if(fietsperbuurtD[2].contains("4")){
                        DPernisJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DPernisFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DPernisMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DPernisApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DPernisMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DPernisJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DPernisJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DPernisAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DPernisSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DPernisOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DPernisNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DPernisDecember += 1.0;}
                    else
                    //PernisOverig += 1.0;

                //Pernis += 1.0;

                if (fietsperbuurtD[1].contains("IJSSELMONDE"))

                    if(fietsperbuurtD[2].contains("4")){
                        DIJsselmondeJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DIJsselmondeFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DIJsselmondeMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DIJsselmondeApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DIJsselmondeMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DIJsselmondeJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DIJsselmondeJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DIJsselmondeAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DIJsselmondeSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DIJsselmondeOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DIJsselmondeNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DIJsselmondeDecember += 1.0;}
                    else




                if (fietsperbuurtD[1].contains("WEST"))

                    if(fietsperbuurtD[2].contains("4")){
                        DWestJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DWestFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DWestMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DWestApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DWestMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DWestJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DWestJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DWestAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DWestSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DWestOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DWestNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DWestDecember += 1.0;}
                    else
                    //WestOverig += 1.0;

                    //West += 1.0;

                if (fietsperbuurtD[1].contains("OMOORD"))

                    if(fietsperbuurtD[2].contains("4")){
                        DOmoordJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DOmoordFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DOmoordMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DOmoordApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DOmoordMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DOmoordJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DOmoordJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DOmoordAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DOmoordSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DOmoordOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DOmoordNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DOmoordDecember += 1.0;}
                    else
                    //OmoordOverig += 1.0;

                    //Omoord += 1.0;


                if (fietsperbuurtD[1].contains("HOOGVLIET"))

                    if(fietsperbuurtD[2].contains("4")){
                        DHoogvlietJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHoogvlietFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHoogvlietMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                    DHoogvlietApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHoogvlietMei += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("6")){
                    DHoogvlietJuni += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("7")){
                    DHoogvlietJuli += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("8")){
                    DHoogvlietAugustus += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("9")) {
                    DHoogvlietSeptember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHoogvlietOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHoogvlietNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DHoogvlietDecember += 1.0;}
                    else
                    DHoogvlietOverig += 1.0;


        //Hoogvliet += 1.0;
                    }

                    System.out.println(DkCrooswijkJuli);

                    System.out.println(DCentrumSeptember);

                    System.out.println(DCentrumJuni);

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