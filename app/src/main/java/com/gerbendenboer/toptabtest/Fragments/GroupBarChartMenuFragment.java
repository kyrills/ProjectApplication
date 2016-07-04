package com.gerbendenboer.toptabtest.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.gerbendenboer.toptabtest.Factory.ButtonFactory;
import com.gerbendenboer.toptabtest.Factory.IButton;
import com.gerbendenboer.toptabtest.R;

public class GroupBarChartMenuFragment extends Fragment {
    Button centrumButton, charloisButton, delfshavenButton, feijenoordButton, noordButton, hillegersbergButton, overschieButton;
    Button kcrooswijkButton, pernisButton, ijsselmondeButton, westButton, omoordButton, hoogvlietButton;
    Context cont;

    public GroupBarChartMenuFragment() {}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        IButton centrum = ButtonFactory.getButton("GBCMenu");
        centrumButton = (Button) view.findViewById(R.id.CentrumButton);
        centrum.action(centrumButton, btnOnClickListener);

        IButton charlois = ButtonFactory.getButton("GBCMenu");
        charloisButton = (Button) view.findViewById(R.id.CharloisButton);
        charlois.action(charloisButton, btnOnClickListener);

        IButton delfshaven = ButtonFactory.getButton("GBCMenu");
        delfshavenButton = (Button) view.findViewById(R.id.DelfshavenButton);
        delfshaven.action(delfshavenButton, btnOnClickListener);

        IButton feijenoord = ButtonFactory.getButton("GBCMenu");
        feijenoordButton = (Button) view.findViewById(R.id.FeijenoordButton);
        feijenoord.action(feijenoordButton, btnOnClickListener);

        IButton noord = ButtonFactory.getButton("GBCMenu");
        noordButton = (Button) view.findViewById(R.id.NoordButon);
        noord.action(noordButton, btnOnClickListener);

        IButton hillegersberg = ButtonFactory.getButton("GBCMenu");
        hillegersbergButton = (Button) view.findViewById(R.id.HillegersbergButton);
        hillegersberg.action(hillegersbergButton, btnOnClickListener);

        IButton overschie = ButtonFactory.getButton("GBCMenu");
        overschieButton = (Button) view.findViewById(R.id.OverschieButton);
        overschie.action(overschieButton, btnOnClickListener);

        IButton kcrooswijk = ButtonFactory.getButton("GBCMenu");
        kcrooswijkButton = (Button) view.findViewById(R.id.kCrooswijkButton);
        kcrooswijk.action(kcrooswijkButton, btnOnClickListener);

        IButton pernis = ButtonFactory.getButton("GBCMenu");
        pernisButton = (Button) view.findViewById(R.id.PernisButton);
        pernis.action(pernisButton, btnOnClickListener);

        IButton ijsselmonde = ButtonFactory.getButton("GBCMenu");
        ijsselmondeButton = (Button) view.findViewById(R.id.IJsselmondeButton);
        ijsselmonde.action(ijsselmondeButton, btnOnClickListener);

        IButton west = ButtonFactory.getButton("GBCMenu");
        westButton = (Button) view.findViewById(R.id.WestButton);
        west.action(westButton, btnOnClickListener);

        IButton omoord = ButtonFactory.getButton("GBCMenu");
        omoordButton = (Button) view.findViewById(R.id.OmoordButton);
        omoord.action(omoordButton, btnOnClickListener);

        IButton hoogvliet = ButtonFactory.getButton("GBCMenu");
        hoogvlietButton = (Button) view.findViewById(R.id.HoogvlietButton);
        hoogvliet.action(hoogvlietButton, btnOnClickListener);
    }

    Button.OnClickListener btnOnClickListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Fragment newFragment;

            if (v == centrumButton) {
                newFragment = new GroupBarChartFragment("Centrum");
                showSelectedArea("Centrum");
            } else if(v == charloisButton){
                newFragment = new GroupBarChartFragment("Charlois");
                showSelectedArea("Charlois");
            } else if (v == delfshavenButton) {
                newFragment = new GroupBarChartFragment("Delfshaven");
                showSelectedArea("Delfshaven");
            } else if (v == feijenoordButton) {
                newFragment = new GroupBarChartFragment("Feijenoord");
                showSelectedArea("Feijenoord");
            } else if (v == noordButton){
                newFragment = new GroupBarChartFragment("Noord");
                showSelectedArea("Noord");
            } else if (v == hillegersbergButton){
                newFragment = new GroupBarChartFragment("Hillegersberg");
                showSelectedArea("Hillegersberg");
            } else if (v == overschieButton){
                newFragment = new GroupBarChartFragment("Overschie");
                showSelectedArea("Overschie");
            } else if (v == kcrooswijkButton){
                newFragment = new GroupBarChartFragment("kCrooswijk");
                showSelectedArea("kCrooswijk");
            } else if (v == pernisButton){
                newFragment = new GroupBarChartFragment("Pernis");
                showSelectedArea("Pernis");
            } else if (v == ijsselmondeButton){
                newFragment = new GroupBarChartFragment("IJsselmonde");
                showSelectedArea("IJsselmonde");
            } else if (v == westButton){
                newFragment = new GroupBarChartFragment("West");
                showSelectedArea("West");
            } else if (v == omoordButton){
                newFragment = new GroupBarChartFragment("Omoord");
                showSelectedArea("Omoord");
            } else if (v == hoogvlietButton){
                newFragment = new GroupBarChartFragment("Hoogvliet");
                showSelectedArea("Hoogvliet");
            }else {
                newFragment = new GroupBarChartFragment("");
            }

            // Load the new chart depending on the button pressed
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.myFragment, newFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cont = inflater.getContext();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_groupedbarchartmenu, container, false);
    }

    public void showSelectedArea(String area) {
        Toast.makeText(cont, "You selected " + area,
                Toast.LENGTH_SHORT).show();
    }
}
