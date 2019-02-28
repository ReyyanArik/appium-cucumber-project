package com.appium.nesine.cucumber.steps;

import com.appium.nesine.ThreadLocalDriver;
import com.appium.nesine.screens.BaseScreen;
import com.appium.nesine.screens.BulletinScreen;
import com.appium.nesine.screens.FilterScreen;
import com.appium.nesine.screens.FootballScreen;
import com.appium.nesine.screens.MainScreen;
import com.appium.nesine.screens.SplashScreen;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FootballSelectionSteps extends BaseSteps {

    BaseScreen baseScreen;
    FootballScreen footballScreen;
    MainScreen mainScreen;
    SplashScreen splashScreen;
    FilterScreen filterScreen;
    BulletinScreen bulletinScreen;
    
    public int count;

    @Before
    public void setupLoginSteps () {
        System.out.println("Cucumber Before FootballSelectionSteps");
        setupCucumber();
        baseScreen = new BaseScreen(ThreadLocalDriver.getTLDriver());
        footballScreen = new FootballScreen(ThreadLocalDriver.getTLDriver());
        mainScreen = new MainScreen(ThreadLocalDriver.getTLDriver());
        splashScreen = new SplashScreen(ThreadLocalDriver.getTLDriver());
        filterScreen = new FilterScreen(ThreadLocalDriver.getTLDriver());
        bulletinScreen = new BulletinScreen(ThreadLocalDriver.getTLDriver());
    }

    @Given("^I have skipped Splash page and I am on the main page$")
    public void iHaveSkippedSplashAndTutorialPagesAndIAmOnTheJobSelectionPage() throws Throwable {
        System.out.println("Cucumber Given");
        splashScreen.skipSplashScreen();
    }

    @When("^I click Football button$")
    public void iClickİsAriyorumButton() throws Throwable {
    	mainScreen.clickFootballMenu();
    }

    @Then("^I should see Football page$")
    public void iShouldSeeMyProfilePage() throws Throwable {
        footballScreen.checkFilterButton();
    }
    
    @And("^I click filter button$")
    public void iClickFilterButton() {
    	footballScreen.clickFilterButton();
    }
    
    @And("^I click league selection menu$")
    public void iClickLeagueSelectionMenu() {
    	filterScreen.clickLeagueSelectionMenu();
    }
    
    @And("^I choose first league$")
    public void iChooseFirstLeague() {
    	filterScreen.choseFirstLeague();
    }
    
    @And("^I get activity count from filter page$")
    public void iGetActivityCount(){
    	count = filterScreen.getActivityCount();
    } 
    
    @And("^I click okey button$")
    public void iClickOkeyButton() {
    	filterScreen.clickOkeyButton();
    }
    
    @And("^I get activity count from bulletin page and I compare counts$")
    public void iCompareCounts(){
    	bulletinScreen.getActivityCount(count);
    }
    
    @And("^I choose rate from bulletin page$")
    public void iChooseRateAndClick() {
    	bulletinScreen.chooseRate();
    }
    
    
    @After
    public synchronized void teardown () {
    	//ThreadLocalDriver.getTLDriver().quit();
    }
}
