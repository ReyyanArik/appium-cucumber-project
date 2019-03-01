package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BetScreen extends BaseScreen{

    public BetScreen(AndroidDriver driver) {
        super(driver);
    }
    
    private By play_now_button = By.xpath("//android.widget.Button[contains(@text,'Hemen Oyna')]");
    
    public void clickPlayNowButton() {
    	waitAndClick(play_now_button);
    }
}
