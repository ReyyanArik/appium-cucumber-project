package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AndroidDriver driver) {
        super(driver);
    }

    String animationViewId = "";

    public void skipSplashScreen ()  {
        //waitAndClick(By.id(animationViewId));
    }
    
    
}
