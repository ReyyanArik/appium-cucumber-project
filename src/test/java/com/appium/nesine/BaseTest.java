package com.appium.nesine;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.appium.nesine.screens.BaseScreen;
import com.appium.nesine.screens.BulletinScreen;
import com.appium.nesine.screens.FilterScreen;
import com.appium.nesine.screens.FootballScreen;
import com.appium.nesine.screens.MainScreen;
import com.appium.nesine.screens.SplashScreen;
import com.appium.nesine.utilities.DriverFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public WebDriverWait wait;
    DriverFactory driverFactory = new DriverFactory();  
    public String platformName = "Android";
    public String platformVersion = "7.1.1";
    public String appPackage = "com.pordiva.nesine.android"; 
    public String appActivity = "com.nesine.taboutside.splash.SplashActivity";
    public String deviceName = "Nexusum";
    public String hubURL = "http://127.0.0.1:4723/wd/hub";
    public String udid = "emulator-5554";

    protected SplashScreen splashScreen = null;
    protected BaseScreen baseScreen = null;
    protected MainScreen mainScreen = null;
    protected FootballScreen footballScreen = null;
    protected FilterScreen filterScreen = null;
    protected BulletinScreen bulletinScreen = null;
    
    @BeforeMethod
    @Parameters({"deviceName", "platformVersion"})
    public void setup (String deviceName, String platformVersion) throws IOException {
        
    	System.out.println("TestNG Before");
           
        final Runtime rt = Runtime.getRuntime();
        rt.exec("adb shell input keyevent 224");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("udid", udid);
        caps.setCapability("platformName", platformName);
        caps.setCapability("appPackage", appPackage);
        caps.setCapability("appActivity", appActivity);
        caps.setCapability("noReset","false");
        caps.setCapability("autoGrantPermissions", "true");
        
        ThreadLocalDriver.setTLDriver(new AndroidDriver(new URL(hubURL),caps));
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);

        splashScreen = new SplashScreen(ThreadLocalDriver.getTLDriver());
        mainScreen = new MainScreen(ThreadLocalDriver.getTLDriver());
        baseScreen = new BaseScreen(ThreadLocalDriver.getTLDriver());
        footballScreen = new FootballScreen(ThreadLocalDriver.getTLDriver());
        filterScreen = new FilterScreen(ThreadLocalDriver.getTLDriver());
        bulletinScreen = new BulletinScreen(ThreadLocalDriver.getTLDriver());
    }

    @AfterMethod
    public synchronized void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }

}
