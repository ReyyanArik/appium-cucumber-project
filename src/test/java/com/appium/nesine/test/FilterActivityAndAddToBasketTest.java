package com.appium.nesine.test;

import org.testng.annotations.Test;

import com.appium.nesine.BaseTest;

public class FilterActivityAndAddToBasketTest extends BaseTest{
		
	@Test
	public void filterActivityAndAddToBasketTest() {
		//splashScreen.skipSplashScreen();
		mainScreen.clickFootballMenu();
		footballScreen.checkAndClickFilterButton();
		filterScreen.clickLeagueSelectionMenu();
		filterScreen.choseFirstLeague();
		int x = filterScreen.getActivityCount();
		filterScreen.clickOkeyButton();
		bulletinScreen.getActivityCount(x);
		bulletinScreen.chooseRate();
	}
	
}
