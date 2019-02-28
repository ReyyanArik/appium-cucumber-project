package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FootballScreen extends BaseScreen{

    public FootballScreen(AndroidDriver driver) {
        super(driver);
    }
    
    private By filter_button = By.id("com.pordiva.nesine.android:id/filter_btn");
    
    public void checkFilterButton ()  {
    	assertTrue(checkElementIsEnabledByLocator(filter_button), filter_button + " bulunamadi!");
    }
    
    public void clickFilterButton() {
    	click(filter_button);
    }
    
    public void checkAndClickFilterButton() {
    	checkFilterButton();
    	clickFilterButton();
    }
}
