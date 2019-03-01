package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BetScreen extends BaseScreen{

    public BetScreen(AndroidDriver driver) {
        super(driver);
    }
    
    private By play_now_button = By.id("com.pordiva.nesine.android:id/btnPlay");
    
    public void checkPlayNowButton() {
    	assertTrue(checkElementIsEnabledByLocator(play_now_button), play_now_button + " bulunamadi!");
    }
    
    public void clickPlayNowButton() {
    	waitAndClick(play_now_button);
    }




}
