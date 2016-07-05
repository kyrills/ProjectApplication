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

                if (fietsperbuurt[7].contains("Centrum")) {

                    if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        CentrumApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)) {
                        CentrumMei += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        CentrumJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        CentrumJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        CentrumAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        CentrumSeptember += 1.0;}
                }

                if (fietsperbuurt[7].contains("Charlois")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "12", 0, 1)) {
                        CharloisDecember+= 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "1", 0, 1)) {
                        CharloisJanuari += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        CharloisApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)) {
                        CharloisMei += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        CharloisJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        CharloisJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        CharloisAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        CharloisSeptember += 1.0;}
                }

                if (fietsperbuurt[7].contains("Delfshaven")) {
                    if(fietsperbuurt[9].regionMatches(true, 0, "11", 0, 1)){
                        DelfshavenNovember += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "1", 0, 1)) {
                        DelfshavenJanuari += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        DelfshavenApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)) {
                        DelfshavenMei += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        DelfshavenJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        DelfshavenJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        DelfshavenAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        DelfshavenSeptember += 1.0;}
                }
                if (fietsperbuurt[7].contains("Feijenoord")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "11", 0, 1)) {
                        FeijenoordNovember += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "10", 0, 1)) {
                        FeijenoordOktober += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "3", 0, 1)) {
                        FeijenoordMaart += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        FeijenoordJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        FeijenoordJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        FeijenoordAugustus += 1.0;}
                }

                if (fietsperbuurt[7].contains("Noord")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "1", 0, 1)){
                        NoordJanuari += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "2", 0, 1)) {
                        NoordFebruari += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "3", 0, 1)) {
                        NoordMaart += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        NoordApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "5", 0, 1)) {
                        NoordMei += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        NoordJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        NoordJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        NoordAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        NoordSeptember += 1.0;}
                }

                if (fietsperbuurt[7].contains("Hillegersberg")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        HillegersbergJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        HillegersbergJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        HillegersbergAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        HillegersbergSeptember += 1.0;}
                }

                if (fietsperbuurt[7].contains("Overschie")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "2", 0, 1)) {
                        OverschieFebruari += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        OverschieJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        OverschieJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        OverschieAugustus += 1.0;}
                }

                if (fietsperbuurt[7].contains("Kralingen-Crooswijk")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        kCrooswijkApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        kCrooswijkJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        kCrooswijkJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        kCrooswijkAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        kCrooswijkSeptember += 1.0;
                    }else if (fietsperbuurt[9].regionMatches(true, 0, "10", 0, 1)) {
                        kCrooswijkOktober += 1.0;}
                }

                if (fietsperbuurt[7].contains("Pernis")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        PernisApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        PernisJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        PernisJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        PernisAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        PernisSeptember += 1.0;}
                }

                if (fietsperbuurt[7].contains("IJsselmonde")) {

                    if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        IJsselmondeApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        IJsselmondeJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        IJsselmondeJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        IJsselmondeAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        IJsselmondeSeptember += 1.0;}
                }

                if (fietsperbuurt[7].contains("West")) {

                    if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        WestApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        WestJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        WestJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        WestAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        WestSeptember += 1.0;}
                }

                if (fietsperbuurt[7].contains("Omoord")) {

                    if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        OmoordApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        OmoordJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        OmoordJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        OmoordAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        OmoordSeptember += 1.0;}
                }


                if (fietsperbuurt[7].contains("Hoogvliet")) {
                    if (fietsperbuurt[9].regionMatches(true, 0, "4", 0, 1)) {
                        HoogvlietApril += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "6", 0, 1)) {
                        HoogvlietJuni += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "7", 0, 1)) {
                        HoogvlietJuli += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "8", 0, 1)) {
                        HoogvlietAugustus += 1.0;
                    } else if (fietsperbuurt[9].regionMatches(true, 0, "9", 0, 1)) {
                        HoogvlietSeptember += 1.0;}
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

                if (fietsperbuurtD[1].contains("STAD")){

                    if(fietsperbuurtD[2].contains("1")){
                        if(fietsperbuurtD[2].contains("10"))
                            DCentrumOktober += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("11"))
                            DCentrumNovember += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("12"))
                            DCentrumDecember += 1.0;
                        else
                            DCentrumJanuari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("2")){
                        if(fietsperbuurtD[2].contains("12"))
                            DCentrumFebruari += 0.0;
                        else
                            DCentrumFebruari += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("3")){
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
                    if(fietsperbuurtD[2].contains("10")){
                        DCentrumOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("11")){
                        DCentrumNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("12")){
                        DCentrumDecember += 1.0;}}


                if (fietsperbuurtD[1].contains("CHARLOIS")){

                    if(fietsperbuurtD[2].contains("1")){
                        if(fietsperbuurtD[2].contains("10"))
                            DCharloisOktober += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("11"))
                            DCharloisNovember += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("12"))
                            DCharloisDecember += 1.0;
                        else
                            DCharloisJanuari += 1.0;}
                    else


                    if(fietsperbuurtD[2].contains("2")){
                        if(fietsperbuurtD[2].contains("12"))
                            DCharloisFebruari += 0.0;
                        else
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
                    }}


                if (fietsperbuurtD[1].contains("SCHIEDAM"))
                    if(fietsperbuurtD[2].contains("1")){
                        if(fietsperbuurtD[2].contains("10"))
                            DDelfshavenOktober += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("11"))
                            DDelfshavenNovember += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("12"))
                            DDelfshavenDecember += 1.0;
                        else
                            DDelfshavenJanuari += 1.0;}
                    else


                    if(fietsperbuurtD[2].contains("2")){
                        if(fietsperbuurtD[2].contains("12"))
                            DDelfshavenFebruari += 0.0;
                        else
                            DDelfshavenFebruari += 1.0;}

                    else
                    if(fietsperbuurtD[2].contains("3")){
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
                        DDelfshavenSeptember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("10")){
                        DDelfshavenOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("11")) {
                        DDelfshavenNovember += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("12")){
                        DDelfshavenDecember += 1.0;}



                if (fietsperbuurtD[1].contains("BLOEMHOF")|fietsperbuurtD[1].contains("BLOEMHOF"))

                    if(fietsperbuurtD[2].contains("1")){
                        if(fietsperbuurtD[2].contains("10")){
                            DFeijenoordOktober += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("11")){
                            DFeijenoordNovember += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("12")){
                            DFeijenoordDecember += 1.0;}
                        else
                            DFeijenoordJanuari += 1.0;}
                    else


                    if(fietsperbuurtD[2].contains("2")){
                        if(fietsperbuurtD[2].contains("12")){
                            DFeijenoordFebruari += 0.0;}
                        else
                            DFeijenoordFebruari += 1.0;}

                    else
                    if(fietsperbuurtD[2].contains("3")) {
                        DFeijenoordMaart += 1.0;
                    }
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DFeijenoordApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("5")) {
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
                    if(fietsperbuurtD[2].contains("12")) {
                        DFeijenoordDecember += 1.0;
                    }


                if (fietsperbuurtD[1].contains("NOORD"))

                        if(fietsperbuurtD[2].contains("1")){
                            if(fietsperbuurtD[2].contains("10")){
                                DNoordOktober += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("11")){
                                DNoordNovember += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("12")){
                                DNoordDecember += 1.0;}
                            else
                                DNoordJanuari += 1.0;}
                        else


                        if(fietsperbuurtD[2].contains("2")){
                            if(fietsperbuurtD[2].contains("12")){
                                DNoordFebruari += 0.0;}
                            else
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
                        if(fietsperbuurtD[2].contains("10")) {
                            DNoordOktober += 1.0;
                        }
                        else
                        if(fietsperbuurtD[2].contains("11")) {
                            DNoordNovember += 1.0;
                        }
                        else
                        if(fietsperbuurtD[2].contains("12")) {
                            DNoordDecember += 1.0;
                        }

                if (fietsperbuurtD[1].contains("HILLEGERSBERG"))

                            if(fietsperbuurtD[2].contains("1")){
                                if(fietsperbuurtD[2].contains("10")){
                                    DHillegersbergOktober += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("11")){
                                    DHillegersbergNovember += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("12")){
                                    DHillegersbergDecember += 1.0;}
                                else
                                    DHillegersbergJanuari += 1.0;}
                            else


                            if(fietsperbuurtD[2].contains("2")){
                                if(fietsperbuurtD[2].contains("12")){
                                    DHillegersbergFebruari += 0.0;}
                                else
                                    DHillegersbergFebruari += 1.0;}

                            else
                            if(fietsperbuurtD[2].contains("3")){
                                DHillegersbergMaart += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("4")){
                                DHillegersbergApril += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("5")){
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
                            if(fietsperbuurtD[2].contains("10")){
                                DHillegersbergOktober += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("11")){
                                DHillegersbergNovember += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("12")){
                                DHillegersbergDecember += 1.0;}



                                //Hillegersberg += 1.0;


                if (fietsperbuurtD[1].contains("OVERSCHIE"))

                                    if(fietsperbuurtD[2].contains("1")){
                                        if(fietsperbuurtD[2].contains("10")){
                                            DOverschieOktober += 1.0;}
                                        else
                                        if(fietsperbuurtD[2].contains("11")){
                                            DOverschieNovember += 1.0;}
                                        else
                                        if(fietsperbuurtD[2].contains("12")){
                                            DOverschieDecember += 1.0;}
                                        else
                                            DOverschieJanuari += 1.0;}
                                    else


                                    if(fietsperbuurtD[2].contains("2")){
                                        if(fietsperbuurtD[2].contains("12")){
                                            DOverschieFebruari += 0.0;}
                                        else
                                            DOverschieFebruari += 1.0;}

                                    else
                                    if(fietsperbuurtD[2].contains("3")){
                                        DOverschieMaart += 1.0;}
                                    else
                                    if(fietsperbuurtD[2].contains("4")){
                                        DOverschieApril += 1.0;}
                                    else
                                    if(fietsperbuurtD[2].contains("5")){
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
                                    if(fietsperbuurtD[2].contains("10")){
                                        DOverschieOktober += 1.0;}
                                    else
                                    if(fietsperbuurtD[2].contains("11")){
                                        DOverschieNovember += 1.0;}
                                    else
                                    if(fietsperbuurtD[2].contains("12")){
                                        DOverschieDecember += 1.0;}

                if (fietsperbuurtD[1].contains("CROOSWIJK"))

                    if(fietsperbuurtD[2].contains("1")){
                        if(fietsperbuurtD[2].contains("10")){
                            DkCrooswijkOktober += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("11")){
                            DkCrooswijkNovember += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("12")){
                            DkCrooswijkDecember += 1.0;}
                        else
                            DkCrooswijkJanuari += 1.0;}
                    else


                    if(fietsperbuurtD[2].contains("2")){
                        if(fietsperbuurtD[2].contains("12"))
                            DkCrooswijkFebruari += 0.0;
                        else
                            DkCrooswijkFebruari += 1.0;}

                    else
                    if(fietsperbuurtD[2].contains("3")){
                        DkCrooswijkMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DkCrooswijkApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("5")){
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
                        DkCrooswijkSeptember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("10")){
                        DkCrooswijkOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("11")){
                        DkCrooswijkNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("12")){
                        DkCrooswijkDecember += 1.0;}

                    //kCrooswijkOverig += 1.0;

                if (fietsperbuurtD[1].contains("KRALINGEN"))

                        if(fietsperbuurtD[2].contains("1")){
                            if(fietsperbuurtD[2].contains("10")){
                                DkCrooswijkOktober += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("11")){
                                DkCrooswijkNovember += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("12")){
                                DkCrooswijkDecember += 1.0;}
                            else
                                DkCrooswijkJanuari += 1.0;}
                        else


                        if(fietsperbuurtD[2].contains("2")){
                            if(fietsperbuurtD[2].contains("12")){
                                DkCrooswijkFebruari += 0.0;}
                            else
                                DkCrooswijkFebruari += 1.0;}

                        else
                        if(fietsperbuurtD[2].contains("3")){
                            DkCrooswijkMaart += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("4")){
                            DkCrooswijkApril += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("5")){
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
                        else
                        if(fietsperbuurtD[2].contains("10")){
                            DkCrooswijkOktober += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("11")){
                            DkCrooswijkNovember += 1.0;}
                        else
                        if(fietsperbuurtD[2].contains("12")){
                            DkCrooswijkDecember += 1.0;}



                if (fietsperbuurtD[1].contains("PERNIS"))

                    if(fietsperbuurtD[2].contains("1")){
                        if(fietsperbuurtD[2].contains("10"))
                            DPernisOktober += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("11"))
                            DPernisNovember += 1.0;
                        else
                        if(fietsperbuurtD[2].contains("12"))
                            DPernisDecember += 1.0;
                        else
                            DPernisJanuari += 1.0;}


                    else
                    if(fietsperbuurtD[2].contains("2")){
                        if(fietsperbuurtD[2].contains("12"))
                            DPernisFebruari += 0.0;
                        else
                            DPernisFebruari += 1.0;}

                    else
                    if(fietsperbuurtD[2].contains("3")){
                        DPernisMaart += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("4")){
                        DPernisApril += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("5")){
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
                        DPernisSeptember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("10")){
                        DPernisOktober += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("11")){
                        DPernisNovember += 1.0;}
                    else
                    if(fietsperbuurtD[2].contains("12")){
                        DPernisDecember += 1.0;}

                        //PernisOverig += 1.0;

                        //Pernis += 1.0;

                if (fietsperbuurtD[1].contains("LOMBARDIJEN"))

                            if(fietsperbuurtD[2].contains("1")){
                                if(fietsperbuurtD[2].contains("10")){
                                    DIJsselmondeOktober += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("11")){
                                    DIJsselmondeNovember += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("12")){
                                    DIJsselmondeDecember += 1.0;}
                                else
                                    DIJsselmondeJanuari += 1.0;}
                            else


                            if(fietsperbuurtD[2].contains("2")){
                                if(fietsperbuurtD[2].contains("12")){
                                    DIJsselmondeFebruari += 0.0;}
                                else
                                    DIJsselmondeFebruari += 1.0;}

                            else
                            if(fietsperbuurtD[2].contains("3")){
                                DIJsselmondeMaart += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("4")){
                                DIJsselmondeApril += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("5")){
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
                            if(fietsperbuurtD[2].contains("10")){
                                DIJsselmondeOktober += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("11")){
                                DIJsselmondeNovember += 1.0;}
                            else
                            if(fietsperbuurtD[2].contains("12")){
                                DIJsselmondeDecember += 1.0;}





                if (fietsperbuurtD[1].contains("WEST"))

                                if(fietsperbuurtD[2].contains("1")){
                                    if(fietsperbuurtD[2].contains("10")){
                                        DWestOktober += 1.0;}
                                    else
                                    if(fietsperbuurtD[2].contains("11")){
                                        DWestNovember += 1.0;}
                                    else
                                    if(fietsperbuurtD[2].contains("12")){
                                        DWestDecember += 1.0;}
                                    else
                                        DWestJanuari += 1.0;}
                                else


                                if(fietsperbuurtD[2].contains("2")){
                                    if(fietsperbuurtD[2].contains("12")){
                                        DWestFebruari += 0.0;}
                                    else
                                        DWestFebruari += 1.0;}

                                else
                                if(fietsperbuurtD[2].contains("3")){
                                    DWestMaart += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("4")){
                                    DWestApril += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("5")){
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
                                if(fietsperbuurtD[2].contains("10")){
                                    DWestOktober += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("11")){
                                    DWestNovember += 1.0;}
                                else
                                if(fietsperbuurtD[2].contains("12")){
                                    DWestDecember += 1.0;}

                                    //WestOverig += 1.0;

                                    //West += 1.0;

                if (fietsperbuurtD[1].contains("ALEXANDER"))

                                        if(fietsperbuurtD[2].contains("1")){
                                            if(fietsperbuurtD[2].contains("10")){
                                                DOmoordOktober += 1.0;}
                                            else
                                            if(fietsperbuurtD[2].contains("11")){
                                                DOmoordNovember += 1.0;}
                                            else
                                            if(fietsperbuurtD[2].contains("12")){
                                                DOmoordDecember += 1.0;}
                                            else
                                                DOmoordJanuari += 1.0;}
                                        else


                                        if(fietsperbuurtD[2].contains("2")){
                                            if(fietsperbuurtD[2].contains("12")){
                                                DOmoordFebruari += 0.0;}
                                            else
                                                DOmoordFebruari += 1.0;}
                                        else
                                        if(fietsperbuurtD[2].contains("3")){
                                            DOmoordMaart += 1.0;}
                                        else
                                        if(fietsperbuurtD[2].contains("4")){
                                            DOmoordApril += 1.0;}
                                        else
                                        if(fietsperbuurtD[2].contains("5")){
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
                                        if(fietsperbuurtD[2].contains("10")){
                                            DOmoordOktober += 1.0;}
                                        else
                                        if(fietsperbuurtD[2].contains("11")){
                                            DOmoordNovember += 1.0;}
                                        else
                                        if(fietsperbuurtD[2].contains("12")){
                                            DOmoordDecember += 1.0;}

                                            //OmoordOverig += 1.0;

                                            //Omoord += 1.0;


                if (fietsperbuurtD[1].contains("HOOGVLIET"))

                                                if(fietsperbuurtD[2].contains("1")){
                                                    if(fietsperbuurtD[2].contains("10")){
                                                        DHoogvlietOktober += 1.0;}
                                                    else
                                                    if(fietsperbuurtD[2].contains("11")){
                                                        DHoogvlietNovember += 1.0;}
                                                    else
                                                    if(fietsperbuurtD[2].contains("12")){
                                                        DHoogvlietDecember += 1.0;}
                                                    else
                                                        DHoogvlietJanuari += 1.0;}
                                                else


                                                if(fietsperbuurtD[2].contains("2")){
                                                    if(fietsperbuurtD[2].contains("12")){
                                                        DHoogvlietFebruari += 0.0;}
                                                    else
                                                        DHoogvlietFebruari += 1.0;}
                                                else
                                                if(fietsperbuurtD[2].contains("3")){
                                                    DHoogvlietMaart += 1.0;}
                                                else
                                                if(fietsperbuurtD[2].contains("4")){
                                                    DHoogvlietApril += 1.0;}
                                                else
                                                if(fietsperbuurtD[2].contains("5")){
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
                                                if(fietsperbuurtD[2].contains("10")){
                                                    DHoogvlietOktober += 1.0;}
                                                else
                                                if(fietsperbuurtD[2].contains("11")){
                                                    DHoogvlietNovember += 1.0;}
                                                else
                                                if(fietsperbuurtD[2].contains("12")){
                                                    DHoogvlietDecember += 1.0;}




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