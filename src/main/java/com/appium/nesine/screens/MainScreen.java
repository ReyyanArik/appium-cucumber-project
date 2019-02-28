package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainScreen extends BaseScreen{

    public MainScreen(AndroidDriver driver) {
        super(driver);
    }

    private By football_menu_button = By.id("com.pordiva.nesine.android:id/layout_football");

    public void clickFootballMenu ()  {
        waitAndClick(football_menu_button);
    }
}
