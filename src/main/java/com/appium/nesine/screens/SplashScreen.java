package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AndroidDriver driver) {
        super(driver);
    }

    private By popupCloseButton = By.id("com.pordiva.nesine.android:id/close_btn");

    public void skipSplashScreen ()  {
        waitAndClick(popupCloseButton);
    }
    
    
}
