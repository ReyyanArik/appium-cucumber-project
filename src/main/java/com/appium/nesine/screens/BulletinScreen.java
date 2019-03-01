package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BulletinScreen extends BaseScreen {

	public BulletinScreen(AndroidDriver driver) {
		super(driver);
	}

	private By activity_count = By.id("com.pordiva.nesine.android:id/main_layout");
	private By rate = By.className("android.widget.TextView");
	private By coupon_button = By.id("com.pordiva.nesine.android:id/background_view");

	public void getActivityCount(int count) {
		System.out.println("Activity count on Bulletin Screen:" + count);
		//System.out.println("bulten sayisi:" + countElements(activity_count));
		// Assert.assertEquals(waitAndFindElements(activity_count).size(), count);
	}

	public void chooseRate() {
		List<WebElement> ms1 = FindElements(By.id("com.pordiva.nesine.android:id/ms1"));
		for (int i = 1; i < 5; i++) {
			ms1.get(i).click();
		}
	}

	public void clickCouponButton() {
		waitAndClick(coupon_button);
	}

}
