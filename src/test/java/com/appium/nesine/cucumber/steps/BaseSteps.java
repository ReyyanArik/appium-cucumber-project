package com.appium.nesine.cucumber.steps;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.appium.nesine.screens.*;
import com.appium.nesine.ThreadLocalDriver;

public class BaseSteps {
	protected BaseScreen baseScreen = null;
	protected BulletinScreen bulletinScreen = null;
	protected FilterScreen filterScreen = null;
	protected FootballScreen footballScreen = null;
	protected MainScreen mainScreen = null;
    protected SplashScreen splashScreen = null;
     
    protected WebDriverWait wait;

    protected void setupCucumber () {
        System.out.println("Cucumber Base Test Before");
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);
        
        baseScreen = new BaseScreen(ThreadLocalDriver.getTLDriver());
        bulletinScreen = new BulletinScreen(ThreadLocalDriver.getTLDriver());
        filterScreen = new FilterScreen(ThreadLocalDriver.getTLDriver());
        footballScreen = new FootballScreen(ThreadLocalDriver.getTLDriver());
        mainScreen = new MainScreen(ThreadLocalDriver.getTLDriver());
        splashScreen = new SplashScreen(ThreadLocalDriver.getTLDriver());
            
        final Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("adb shell input keyevent 224");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }
}
