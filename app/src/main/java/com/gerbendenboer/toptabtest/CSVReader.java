package com.gerbendenboer.toptabtest;

import android.content.Context;

import com.gerbendenboer.toptabtest.Fragments.IDataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVReader implements IDataReader{

    public float Centrum = 0;
    public float Charlois = 0;
    public float Delfshaven = 0;
    public float Feijenoord = 0;
    public float Noord = 0;
    public float Hillegersberg = 0;
    public float Overschie = 0;
    public float kCrooswijk = 0;
    public float Pernis = 0;
    public float IJsselmonde = 0;
    public float West = 0;
    public float Omoord = 0;
    public float Hoogvliet = 0;

    public float Januari = 0;
    public float Februari = 0;
    public float Maart = 0;
    public float April = 0;
    public float Mei = 0;
    public float Juni = 0;
    public float Juli = 0;
    public float Augustus = 0;
    public float September = 0;
    public float Oktober = 0;
    public float November = 0;
    public float December = 0;

    Context myContext;
    String filename;

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

                if (diefstal4[3].contains("1"))
                    Januari += 1.0;
                if (diefstal4[7].contains("Charlois"))
                    Februari += 1.0;
                if (diefstal4[7].contains("Delfshaven"))
                    Maart += 1.0;
                if (diefstal4[7].contains("Feijenoord"))
                    April += 1.0;
                if (diefstal4[7].contains("Noord"))
                    Mei += 1.0;
                if (diefstal4[7].contains("Hillegersberg"))
                    Juni += 1.0;
                if (diefstal4[7].contains("Overschie"))
                    Juli += 1.0;
                if (diefstal4[7].contains("Kralingen/Crooswijk"))
                    Augustus += 1.0;
                if (diefstal4[7].contains("Pernis"))
                    September += 1.0;
                if (diefstal4[7].contains("IJsselmonde"))
                    Oktober += 1.0;
                if (diefstal4[7].contains("West"))
                    West += 1.0;
                if (diefstal4[7].contains("Omoord"))
                    Omoord += 1.0;
                if (diefstal4[7].contains("Hoogvliet"))
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
        System.out.println("Januari = " + Januari);;
    }

    public float getCentrum(){
        return Centrum;
    }

    public float getFeijenoord() {
        return Feijenoord;
    }

    public float getHillegersberg() {
        return Hillegersberg;
    }

    public float getOverschie() {
        return Overschie;
    }

    public float getkCrooswijk() {
        return kCrooswijk;
    }

    public float getPernis() {
        return Pernis;
    }

    public float getIJsselmonde() {
        return IJsselmonde;
    }

    public float getWest() {
        return West;
    }

    public float getOmoord() {
        return Omoord;
    }

    public float getHoogvliet() {
        return Hoogvliet;
    }

    public float getCharlois() {
        return Charlois;
    }

    public float getDelfshaven() {
        return Delfshaven;
    }

    public float getNoord() {
        return Noord;
    }
}