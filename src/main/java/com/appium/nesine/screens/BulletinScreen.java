package com.appium.nesine.screens;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BulletinScreen extends BaseScreen{

    public BulletinScreen(AndroidDriver driver) {
        super(driver);
    }
    
    private By activity_count = By.id("com.pordiva.nesine.android:id/main_layout");
    private By rate = By.className("android.widget.TextView");

    public void getActivityCount (int count)  {
    	System.out.println("Activity count on Bulletin Screen:" + count);
    	System.out.println("bulten sayisi:"+ countElements(activity_count));
    	//Assert.assertEquals(waitAndFindElements(activity_count).size(), count);
    }
    
    public void chooseRate() {
   
    	for(int i=1;i<5;i++) {
    		if(getElementBy(By.xpath("//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[@index='3']")).isEnabled()) {
    			getElementBy(By.xpath("//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[@index='3']/android.widget.LinearLayout[@index='1']/android.widget.FrameLayout[@index='1']")).click();
    		}
    		else {
    			i=i-1;
    		}
    	}
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
