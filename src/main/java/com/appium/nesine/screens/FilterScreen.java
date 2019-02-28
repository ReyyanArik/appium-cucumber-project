package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FilterScreen extends BaseScreen{

    public FilterScreen(AndroidDriver driver) {
        super(driver);
    }

    private By league_selection_menu = By.id("com.pordiva.nesine.android:id/league_rb");
    private By first_league = By.xpath("//android.widget.CheckedTextView[@index='0']");
    private By okey_button = By.id("com.pordiva.nesine.android:id/top_button");

    public void clickLeagueSelectionMenu ()  {
        waitAndClick(league_selection_menu);
    }
    
    public void choseFirstLeague() {
    	waitAndClick(first_league);
    }
    
    public void clickOkeyButton() {
    	click(okey_button);
    }
    
    public int getActivityCount() {
    	String s = getText(first_league);
       	s = s.substring(s.indexOf("(") + 1);
    	s = s.substring(0, s.indexOf(")"));
    	System.out.println("Activity count on Filter Screen:" + s);
    	return Integer.parseInt(s);
    }
}
