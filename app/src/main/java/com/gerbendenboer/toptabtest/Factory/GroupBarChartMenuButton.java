package com.gerbendenboer.toptabtest.Factory;



import android.widget.Button;

public class GroupBarChartMenuButton implements IButton {

    @Override
    public void action(Button button, Button.OnClickListener btnOCL) {
        button.setOnClickListener(btnOCL);
    }
}
