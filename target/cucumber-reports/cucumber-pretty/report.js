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
  "duration": 3330561,
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
  "duration": 94111861,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickİsAriyorumButton()"
});
formatter.result({
  "duration": 12913889524,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iShouldSeeMyProfilePage()"
});
formatter.result({
  "duration": 1244894145,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickFilterButton()"
});
formatter.result({
  "duration": 588916092,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickLeagueSelectionMenu()"
});
formatter.result({
  "duration": 3833359491,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iChooseFirstLeague()"
});
formatter.result({
  "duration": 353440575,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iGetActivityCount()"
});
formatter.result({
  "duration": 559975538,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iClickOkeyButton()"
});
formatter.result({
  "duration": 590731052,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iCompareCounts()"
});
formatter.result({
  "duration": 775088791,
  "status": "passed"
});
formatter.match({
  "location": "FootballSelectionSteps.iChooseRateAndClick()"
});
formatter.result({
  "duration": 3876143170,
  "status": "passed"
});
formatter.after({
  "duration": 23949,
  "status": "passed"
});
});