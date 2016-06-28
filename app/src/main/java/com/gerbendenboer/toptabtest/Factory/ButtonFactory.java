package com.gerbendenboer.toptabtest.Factory;


public class ButtonFactory {
    public static IButton getButton(String criteria){
        if (criteria.equals("main"))
            return new MainButton();
        return null;
    }
}
