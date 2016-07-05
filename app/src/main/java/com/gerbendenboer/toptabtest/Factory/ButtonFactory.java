package com.gerbendenboer.toptabtest.Factory;


public class ButtonFactory{
    public static IButton getButton(String criteria){
        if (criteria.equals("GBCMenu"))
            return new GroupBarChartMenuButton();
        return null;
    }
}
