package com.gerbendenboer.toptabtest.Factory;


import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainButton extends AppCompatActivity implements IButton {
    @Override
    public void action(ToggleButton toggleButton) {
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    System.out.println("Aan");
                } else {
                    System.out.println("Uit");

                }
            }
        });

    }
}
