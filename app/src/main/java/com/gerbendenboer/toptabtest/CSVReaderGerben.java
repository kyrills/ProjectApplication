package com.gerbendenboer.toptabtest;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVReaderGerben {

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

    Context myContext;
    String filename;

    public CSVReaderGerben(Context myContext, String filename){
        this.myContext = myContext;
        this.filename = filename;
    }



    public void run() {

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            InputStreamReader is = new InputStreamReader(myContext.getAssets().open(filename));
            br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] bikebox = line.split(cvsSplitBy);

                if (bikebox[7].contains("Centrum"))
                    Centrum += 1.0;
                if (bikebox[7].contains("Charlois"))
                    Charlois += 1.0;
                if (bikebox[7].contains("Delfshaven"))
                    Delfshaven += 1.0;
                if (bikebox[7].contains("Feijenoord"))
                    Feijenoord += 1.0;
                if (bikebox[7].contains("Noord"))
                    Noord += 1.0;
                if (bikebox[7].contains("Hillegersberg"))
                    Hillegersberg += 1.0;
                if (bikebox[7].contains("Overschie"))
                    Overschie += 1.0;
                if (bikebox[7].contains("Kralingen/Crooswijk"))
                    kCrooswijk += 1.0;
                if (bikebox[7].contains("Pernis"))
                    Pernis += 1.0;
                if (bikebox[7].contains("IJsselmonde"))
                    IJsselmonde += 1.0;
                if (bikebox[7].contains("West"))
                    West += 1.0;
                if (bikebox[7].contains("Omoord"))
                    Omoord += 1.0;
                if (bikebox[7].contains("Hoogvliet"))
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


        System.out.println(Centrum + " Centrum" );
        setCentrum(Centrum);

//        System.out.println(Charlois + " Charlois");
//        System.out.println(Delfshaven + " Delfshaven");
//        System.out.println(Feijenoord + " Feijenoord");
//        System.out.println(Noord + " Noord");
//        System.out.println(Hillegersberg + " Hillegersberg");
//        System.out.println(Overschie + " Overschie");
//        System.out.println(West + " West");
//        System.out.println(Pernis + " Pernis");
//        System.out.println(IJsselmonde + " IJsselmonde");
//        System.out.println(Omoord + " Omoord");
//        System.out.println(Hoogvliet + " Hoogvliet");
//        System.out.println(kCrooswijk + " Kralingen / Crooswijk");

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

    public void setCentrum(float centrum) {
        Centrum = centrum;
    }

    public void setCharlois(float charlois) {
        Charlois = charlois;
    }

    public void setDelfshaven(float delfshaven) {
        Delfshaven = delfshaven;
    }

    public void setFeijenoord(float feijenoord) {
        Feijenoord = feijenoord;
    }

    public void setNoord(float noord) {
        Noord = noord;
    }

    public void setHillegersberg(float hillegersberg) {
        Hillegersberg = hillegersberg;
    }

    public void setOverschie(float overschie) {
        Overschie = overschie;
    }

    public void setkCrooswijk(float kCrooswijk) {
        this.kCrooswijk = kCrooswijk;
    }

    public void setPernis(float pernis) {
        Pernis = pernis;
    }

    public void setIJsselmonde(float IJsselmonde) {
        this.IJsselmonde = IJsselmonde;
    }

    public void setWest(float west) {
        West = west;
    }

    public void setOmoord(float omoord) {
        Omoord = omoord;
    }

    public void setHoogvliet(float hoogvliet) {
        Hoogvliet = hoogvliet;
    }
}