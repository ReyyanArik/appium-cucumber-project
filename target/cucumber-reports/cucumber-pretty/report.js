$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/appium/nesine/cucumber/features/Football.feature");
formatter.feature({
  "line": 2,
  "name": "Football Feature",
  "description": "",
  "id": "football-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Football"
    }
  ]
});
formatter.before({
  "duration": 3695348,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successfully selection of football on main page",
  "description": "",
  "id": "football-feature;successfully-selection-of-football-on-main-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have skipped Splash page and I am on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click Football button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see Football page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click filter button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click league selection menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose first league",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I get activity count from filter page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click okey button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I get activity count from bulletin page and I compare counts",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I choose rate from bulletin page",
  "keyword": "And "
});
formatter.match({
  "location": "FootballSelectionSteps.iHaveSkippedSplashAndTutorialPagesAndIAmOnTheJobSelectionPage()"
});
formatter.result({
  "duration": 131555865,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickİsAriyorumButton()"
});
formatter.result({
  "duration": 17514554952,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: com.pordiva.nesine.android:id/layout_football (tried for 15 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.appium.nesine.screens.BaseScreen.waitAndClick(BaseScreen.java:27)\r\n\tat com.appium.nesine.screens.MainScreen.clickFootballMenu(MainScreen.java:15)\r\n\tat com.appium.nesine.cucumber.steps.FootballSelectionSteps.iClickİsAriyorumButton(FootballSelectionSteps.java:50)\r\n\tat ✽.When I click Football button(src/test/java/com/appium/nesine/cucumber/features/Football.feature:6)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.id: com.pordiva.nesine.android:id/layout_football\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027BUSRAARIK\u0027, ip: \u002710.94.40.34\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.appium.nesine.screens.BaseScreen.waitAndClick(BaseScreen.java:27)\r\n\tat com.appium.nesine.screens.MainScreen.clickFootballMenu(MainScreen.java:15)\r\n\tat com.appium.nesine.cucumber.steps.FootballSelectionSteps.iClickİsAriyorumButton(FootballSelectionSteps.java:50)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat com.appium.nesine.cucumber.tests.RunCucumberFeatures.feature(RunCucumberFeatures.java:41)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FootballSelectionSteps.iShouldSeeMyProfilePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickFilterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickLeagueSelectionMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FootballSelectionSteps.iChooseFirstLeague()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FootballSelectionSteps.iGetActivityCount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickOkeyButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FootballSelectionSteps.iCompareCounts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FootballSelectionSteps.iChooseRateAndClick()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 37205,
  "status": "passed"
});
});